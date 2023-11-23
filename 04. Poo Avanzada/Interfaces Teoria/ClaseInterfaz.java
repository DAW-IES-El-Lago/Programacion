package Teoria;

public class ClaseInterfaz implements Interfaz, Dibujable {

	// Como implementar interfaces

	public void MetodoDeInstancia1() {
		// Esto es sobreescritura. Debe tener los mismos modificadores,
		// valores de retorno, nombre del metodo y sus parametros.
		// Lo unico que se puede modificar es el alcance si restringe MENOS
		// que el de la subclase.

		System.out.println("Clase Interfaz: Método de instancia 1");

	}

	public void MetodoDeInstancia2() {
		System.out.println("Clase Interfaz: Método de instancia 2");

	}

	// EXTENSION DE DIBUJABLE
	 
	public void dibujarRecta() {
		System.out.println("ClaseInterfaz: recta");
	}

	public void dibujarCurva() {
		System.out.println("ClaseInterfaz: curva");
	}

	public void dibujarLibre() {
		System.out.println("ClaseInterfaz: libre");
	}

	
	@Override
	public void metodoPorDefecto() {// Funciona igual que herencia
		System.out.println("ClaseInterfaz: Método por defecto");
	}
	
}
