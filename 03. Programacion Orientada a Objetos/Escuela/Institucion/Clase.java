package EscuelaCompleta.Institucion;

import EscuelaCompleta.Persona;

import java.util.ArrayList;

public class Clase {
    private String nombreClase;
    private ArrayList <Persona> clase;

    public Clase(String nombreClase, ArrayList<Persona> clase) {
        this.nombreClase = nombreClase;
        this.clase = clase;
    }

    public ArrayList ordenarClase(ArrayList<Persona> clase){
        //implementar ordenacion del arraylist clase con el metodo burbuja por el atributo Persona.nombre
        int n = clase.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                Persona personaActual = clase.get(j);
                Persona personaSiguiente = clase.get(j + 1);

                if (personaActual.getNombre().compareTo(personaSiguiente.getNombre()) > 0) {
                    // Intercambiar las posiciones de las personas
                    clase.set(j, personaSiguiente);
                    clase.set(j + 1, personaActual);
                }
            }
        }
        return clase;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public ArrayList<Persona> getClase() {
        return clase;
    }

    public void setClase(ArrayList<Persona> clase) {
        this.clase = clase;
    }
}
