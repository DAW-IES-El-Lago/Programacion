package Teoria;

public interface Interfaz {
	
    int CONSTANTE =0; // public static final. Siempre por defecto
    
    void MetodoDeInstancia1(); // Los metodos abstractos no tienen { }
    
    void MetodoDeInstancia2();
    
    static void metodoEstatico() {
    	System.out.println("Interfaz: Método estático");
    }
    
    default void metodoPorDefecto() { // Para que se tenga la opcion de heredar y se pueda sobreescribir o no.
    	System.out.println("Interfaz: Método por defecto");
    } // Esta es la forma más parecida de heredar de una superclase
    
    private void metodoPrivado() {
    	System.out.println("Interfaz: Método privado");
    }

}

// En la interfaz es obligatorio que haya métodos abstractos
// La interfaz no puede tener objetos -> no hay Objeto o = new Objeto
// Métodos que tienen implementacion en interfaces; Estatico, por defecto y privado
// Estatico pertenece a la clase, entonces se puede utilizar desde la clase
// Por defecto funciona como un método normal
// El privado solo lo pueden utilizar otros métodos de la case.