package EscuelaCompleta;

import EscuelaCompleta.Institucion.Asignatura;
import EscuelaCompleta.Institucion.Clase;

import java.util.ArrayList;

public class Profesor extends Persona{
    private Asignatura[] asignaturas;

    public Profesor(String nombre, String dni, int edad, Asignatura[] asignaturas) {
        super(nombre, dni, edad);
        this.asignaturas = asignaturas;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    public void pasarLista(Clase c){
        System.out.println("Pasando lista grupo " + c.getNombreClase());
        //recorrer arraylist de alumnos y si se encuentra a si mismo saltarse ya que es un profesor
        System.out.println("Pasando lista grupo " + c.getNombreClase());

        ArrayList<Persona> alumnos = c.getClase();

        for (Persona alumno : alumnos) {
            if (alumno instanceof Profesor) {
                continue; // Saltar si es un profesor
            }

            System.out.println("Presente: " + alumno.getNombre());
        }
    }
}
