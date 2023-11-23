package Ejercicio12;

public class Libro extends Publicacion implements Prestable{
	
	public boolean prestado;
	
	public Libro(String codigo, String titulo, int anio) {
		super(codigo, titulo, anio);
		prestado = false;
	}
	
	@Override
	public String toString() {
		if(prestado) {
			return super.toString()+". Prestado.";
		}else {
			return super.toString()+". No está prestado";
		}
	}
	
	public String getTitulo() {
		return super.titulo; //El super no es necesario
	}
	
	@Override
	public boolean esMayor(Publicacion p) {
		if(p instanceof Libro) { //instanceof no es necesario, todas las publicaciones tienen año
		Libro l = (Libro) p;
		if(this.anio>l.anio) {
			return true;
		}
		return false;
	  }
	   return false;
	}
	
	//Implementacion de la interfaz prestable
	
	@Override
	public void prestar() {
		if(prestado) {
			System.out.println("El libro está prestado");
			return;
		}
		prestado=true;
	}
	
	@Override
	public void devolver() {
		if(!prestado()) {
			System.out.println("El libro no está prestado");
			return;
		}
		prestado=false;
	}
	
	@Override
	public boolean prestado() {
		return prestado;
	}
	
	
	
}









