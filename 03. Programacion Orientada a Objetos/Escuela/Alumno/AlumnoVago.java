package EscuelaCompleta.Alumno;

public class AlumnoVago extends Alumno{
    private boolean esRepetidor;

    public AlumnoVago(String nombre, String dni, int edad, String sexo, boolean esRepetidor) {
        super(nombre, dni, edad, sexo);
        this.esRepetidor = esRepetidor;
    }

    public boolean isEsRepetidor() {
        return esRepetidor;
    }

    public void setEsRepetidor(boolean esRepetidor) {
        this.esRepetidor = esRepetidor;
    }
}
