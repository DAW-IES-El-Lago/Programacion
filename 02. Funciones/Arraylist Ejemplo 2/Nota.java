package arraylistej1;

public class Nota {
	private String IDAsig;
	private double nota;
	
	public Nota() {
		
	}
	
	public Nota(String idasig) {
		this.IDAsig=idasig;
	}
	
	public Nota(String IDAsig,double nota) {
		this(IDAsig);
		this.nota=nota;
	}

	public String getIDAsig() {
		return IDAsig;
	}

	public void setIDAsig(String iDAsig) {
		IDAsig = iDAsig;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	
}
