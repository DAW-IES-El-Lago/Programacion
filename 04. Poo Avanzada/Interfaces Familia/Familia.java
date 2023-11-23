package Ejercicio;

import java.util.ArrayList;

public abstract class Familia implements Relaciones {
	
	private ArrayList<Persona> miembros = new ArrayList<Persona>();
	private String direccion;
	
	public Familia(ArrayList<Persona> miembros, String direccion) {
		this.miembros=miembros;
		this.direccion=direccion;
	}
	
	@Override
	public boolean esMayor(Object b) {
		if(b instanceof Familia) {
			Familia f = (Familia) b;
			if(this.miembros.size()>f.miembros.size()) {
				return true;
			}
			else
				return false;
		}
		System.out.println("El objeto no es una familia");
		return false;
	}

	//REVISAR ESTO PARA EL EXAMEN 
	public boolean esIgual(Object b) {
		if(b instanceof Familia) {
			Familia f= (Familia) b;
			if(!f.direccion.equals(this.direccion)) {
				return false;
			}
			for(int i=0; i<f.miembros.size() && i<this.miembros.size(); i++) {
				if(!f.miembros.get(i).esIgual(this.miembros.get(i))) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
	
	
}
