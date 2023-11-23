package Ejercicio12;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int cuentaPrestados(ArrayList<Libro> libros) {
		
		int contador=0;
		for(int i=0; i<libros.size(); i++) {
			if(libros.get(i).prestado==true) {
				contador++;
			}
		}
		return contador;
	}
	
	public static int publicacionesAnteriores(ArrayList<Publicacion> publicaciones, int anio) {
		int contador=0;
		for(int i=0; i<publicaciones.size(); i++) {
			if(publicaciones.get(i).getAnio()<anio) {
				contador++;
			}
	    }
		 return contador;	
    }
}
