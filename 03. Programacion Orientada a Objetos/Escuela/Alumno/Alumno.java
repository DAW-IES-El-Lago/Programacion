package EscuelaCompleta.Alumno;

import EscuelaCompleta.Institucion.Asignatura;
import EscuelaCompleta.EstudiarAsignatura;
import EscuelaCompleta.Persona;

public class Alumno extends Persona implements EstudiarAsignatura {
    private String sexo;

    public Alumno(String nombre, String dni, int edad, String sexo) {
        super(nombre, dni, edad);
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public void estudiarAsignatura(Asignatura a) {
        System.out.println(this.getNombre() + " esta estudiando... " + a);
    }
}
