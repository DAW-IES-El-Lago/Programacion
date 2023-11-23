package EscuelaCompleta.Alumno;

public class AlumnoTrabajador extends Alumno{
    private int matriculasHonor;

    public AlumnoTrabajador(String nombre, String dni, int edad, String sexo, int matriculasHonor) {
        super(nombre, dni, edad, sexo);
        this.matriculasHonor = matriculasHonor;
    }

    public int getMatriculasHonor() {
        return matriculasHonor;
    }

    public void setMatriculasHonor(int matriculasHonor) {
        this.matriculasHonor = matriculasHonor;
    }
}
