package arraylistej1;

public class Curso {
	public static final int MAXH=30;
	public static final int MAXASIG=10;
	
	public String nombre;
	private String id;
	private Asignatura[] asignaturas;
	
	public Curso() {
		asignaturas=new Asignatura[MAXASIG];
	}
	
	public Curso(String nombre,String id) {
		this();
		this.nombre=nombre;
		this.id=id;
	}
	
	public Curso(String nombre,String id,Asignatura[]asignatura) {
		this(nombre,id);
		
		
		
		for(int i=0;i<asignaturas.length;i++) {
			this.asignaturas[i]=asignatura[i];
		}
	}
	
	public boolean aniadirAsig(Asignatura asignatura) {
		int suma=0;
		if(this.asignaturas[asignaturas.length-1]!=null) {
			return false;
		}
		for(int i=0;i<this.asignaturas.length;i++) {
			if(this.asignaturas[i]==null) {
				suma=suma+asignatura.numHoras;
				if(suma<=MAXH) {
				 this.asignaturas[i]=asignatura;
				return true;
				}else {
					return false;
				}
			}else {
				suma=suma+asignaturas[i].numHoras;
			}
		}
	
		return false;
	}
	
	public Asignatura eliminarAsignatura(String id) {
		Asignatura eliminada=new Asignatura();
		for(int i=0;i<this.asignaturas.length && this.asignaturas[i]!=null;i++) {
			if(asignaturas[i].getId().equals(id)) {
				for(int j=i;j<asignaturas.length-1;j++) {
					asignaturas[j]=asignaturas[j+1];
				}
				asignaturas[asignaturas.length-1]=null;
				return eliminada;
			}
		}
		return eliminada;
	}
	
	public void MostrarAsigCurso() {
		
		System.out.println("Asignaturas de "+this.nombre);
		
		if(asignaturas[0]==null) {
			System.out.println("No hay asignaturas en este curso");
			return;
		}
		for(int i=0;i<this.asignaturas.length && this.asignaturas[i]!=null;i++) {
			System.out.println(asignaturas[i].tostring());
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Asignatura[] getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Asignatura[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	
}
