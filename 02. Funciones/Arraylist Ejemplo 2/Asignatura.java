package arraylistej1;

public class Asignatura {
	
	public final int MAXAL=30;
	
	public String nombre;
	private String id;
	public int numHoras;
	
	private Alumno[] alumnos;
	
	public Asignatura() {
		alumnos=new Alumno[1];
	}
	
	public Asignatura(String nombre,int numHoras,String id) {
		this();
		this.nombre=nombre;
		this.numHoras=numHoras;
		this.id=id;
	}
	public Asignatura(String nombre,int numHoras,String id,Alumno[]alumnos) {
		this(nombre,numHoras,id);
		this.alumnos=new Alumno[alumnos.length];
		for(int i=0;i<alumnos.length;i++) {
			this.alumnos[i]=alumnos[i];
		}
	
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	
	}
	
	public String tostring() {
		return "Nombre: "+this.nombre+", ID: "+this.id+", Número de horas: "+this.numHoras;
	}
	

	public boolean eliminarAlumno(String dni) {
		
		Alumno[] aux= new Alumno[alumnos.length-1];
		boolean encontrado=false;
		int j=0;
		
		
		for(int i=0;i<alumnos.length;i++) {
			if(alumnos[i].getDNI().equals(dni)) {
				encontrado=true;
			}else {
				try {
				aux[j]=alumnos[i];
				j++;
				}catch(IndexOutOfBoundsException be) {
					System.out.println("No se ha encontrado el alumno en "+this.nombre);
				}
			}
		}
		
		if(encontrado) {
			alumnos=aux;
			System.out.println("Se ha eliminado el alumno");
			mostrarAlumnos();
		}
		
		return encontrado;
	}
	
	public void mostrarAlumnos() {
		System.out.println("ALUMNOS DE "+this.id);
		for(int i=0;i<alumnos.length;i++) {
			System.out.println(alumnos[i].tostring());
		}
	}
	

}
