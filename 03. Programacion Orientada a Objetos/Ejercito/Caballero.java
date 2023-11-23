package ejercito;

public class Caballero {
	
	String nombre;
	String idCaballero;
	static int caballeros;
	
	public Caballero(String nombre) {
		this.nombre=nombre;
		idCaballero=nombre.charAt(0)+Integer.toString(caballeros+1);
		caballeros++;
	}

}
