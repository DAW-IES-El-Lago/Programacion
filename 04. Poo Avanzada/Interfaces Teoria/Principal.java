package Teoria;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Interfaz i = new Interfaz(); No se pueden declarar objetos de tipo Interfaz.Dará error
		
		ClaseInterfaz instancia = new ClaseInterfaz();
		
		instancia.MetodoDeInstancia1();
		instancia.MetodoDeInstancia2();
		instancia.metodoPorDefecto();
		
		Interfaz instancia2 = new ClaseInterfaz();
		System.out.println(instancia2.getClass());
		
		Interfaz.metodoEstatico();
		
		System.out.println(Interfaz.CONSTANTE);
		
		System.out.println(ClaseInterfaz.CONSTANTE);
		
		
		
	}

}
