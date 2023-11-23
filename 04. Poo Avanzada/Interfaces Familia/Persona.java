package Ejercicio;

public class Persona implements Relaciones{
	
	String nombreApellidos; //package
	int edad;
	String dni;
	
	public boolean esMayor(Object b) {
		if(b instanceof Persona) {
			Persona p = (Persona) b;
			
			if(this.edad>p.edad) {
				return true;
			}
			return false;
		}
		System.out.println("No es objeto persona");
		return false;
	}
	
	@Override
	public boolean esMenor(Object b) {
		if(b instanceof Persona) {
			Persona p = (Persona) b;
			
			if(this.edad<p.edad) {
				return true;
			}
			return false;
		}
		System.out.println("No es objeto persona");
		return false;
	}
	
	@Override
	public boolean esIgual(Object o) {
		if(o instanceof Persona) {
			Persona p = (Persona) o;
			if(this.nombreApellidos.equals(p.nombreApellidos)&& this.dni.equals(p.dni)
					&& this.edad==p.edad) {
				return true;
			}
			return false;
		}
		System.out.println("No es de tipo persona");
		return false;
	}
}
