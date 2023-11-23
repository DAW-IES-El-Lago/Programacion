package Teoria;

public abstract class Aparato implements Funcionalidad{
    
	// Si una abstracta implementa una interfaz, no hay que implementar sus métodos.
	
	protected String serialNumber;
	protected boolean on;
	
	/*public abstract void on();
	public abstract void off();
	*/
	
	public Aparato(String serialNumber, boolean on) {
		this.serialNumber=serialNumber;
		this.on=on;
	}
	
	public Aparato(String serialNumber) {
		this.serialNumber=serialNumber;
		this.on=false;
	}
	
	protected void cambiar(boolean on) {
		this.on=on;
		
	}
	
}
