package ejercito;

public class Medico {

	String nombre;
	String especialidad;
	static int medicos;
	
	public Medico(String nombre) {
		this.nombre=nombre;
		medicos=medicos+1;	
	}
	
	public Medico(String name,String especialidad) {
		this(name);
		this.especialidad=especialidad;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medico m=new Medico("Pepe","Estomatologo");
		
		System.out.println(medicos);

	}
}
