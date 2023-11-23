package ejercito;

public class General {

	String nombre;
	int numeroGeneral;
	Unidad numerounidad;
	static int generales;
	
	public General(String nombre,Unidad numerounidad) {
		this.nombre=nombre;
		this.numerounidad=numerounidad;
		numeroGeneral=generales+1;
		generales++;
	}
}
