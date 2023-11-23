package Ejercicio12;

public class Revista extends Publicacion{

	private int numero;
	public Revista(String codigo, String titulo, int anio, int numero) {
		super(codigo, titulo, anio);
		this.numero=numero;
	}
	
	@Override
	public String toString() {
		return super.toString()+", Número: "+numero;
	}
	
	@Override
	public boolean esMayor(Publicacion p) {
		if(p instanceof Revista) {
			Revista r = (Revista) p;
		if(this.numero>r.numero) {
			return true;
		}
		return false;
	  }
	   return false;
	}

		
}
