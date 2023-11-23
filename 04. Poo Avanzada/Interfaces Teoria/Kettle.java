package Teoria;

public class Kettle extends Aparato {
	
	protected double capacidad;
	
	public Kettle(String serialNumber, double capacidad) {
		super(serialNumber);
		this.capacidad=capacidad;
	}
	
	public void on() {
		cambiar(true);
	}
	
	public void off() {
		cambiar(false);
	}

}
