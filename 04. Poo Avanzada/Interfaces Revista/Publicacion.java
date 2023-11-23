package Ejercicio12;

public abstract class Publicacion {
    
	
	protected String codigo;
	protected String titulo;
	protected int anio;
	
	public Publicacion(String codigo, String titulo, int anio) {
		this.anio=anio;
		this.codigo=codigo;
		this.titulo=titulo;
	}
	
	@Override
	public String toString() {
		return "Código"+codigo+
				", Titulo: "+
				", Año:"+anio;
	}

	//No hace falta sobrescribirlo porque otras clases lo van a heredar directamente.
	public int getAnio() {
		return anio;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public abstract boolean esMayor(Publicacion p);
	//Clase abstracta: Una clase normal que tiene al menos 1 método abstracto
	//Todos los que hereden de Publicacion tienen que tener siempre el metodo esMayor.
	
}
