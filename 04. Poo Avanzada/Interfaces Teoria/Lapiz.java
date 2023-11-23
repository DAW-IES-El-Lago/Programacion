package Teoria;

public class Lapiz extends Herramienta implements Dibujable{

	Lapiz(int grosor, String color){
		super(grosor,color);
	} // Si no se mete el constructor por defecto de Lapiz, no funciona.
	
	// Por defecto todos estos metodos van a ser abstractos
	
	public void dibujarRecta() {
		System.out.println("Recta");
		
	}
	
	public void dibujarCurva() {
		System.out.println("curva");
	}
	
	public void dibujarLibre() {
			System.out.println("Libre");
	}
	
	
	
}
