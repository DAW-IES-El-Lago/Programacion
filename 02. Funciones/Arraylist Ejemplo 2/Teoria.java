package arraylistej1;

import java.util.ArrayList;
import java.util.Scanner;

import arraylist.Curso;

public class Teoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>listaCadenas;
		ArrayList<Integer>listaEnteros;
		ArrayList<Curso>listaCursos;
		
		//CREACION
		listaCadenas=new ArrayList<String>();
		listaCursos=new ArrayList<Curso>(25);
		listaEnteros=new ArrayList<Integer>(25);
		//DECLARACION Y CREACION
		ArrayList<Double> listaDecimales=new ArrayList<Double>();
		
		//CREAR USANDO OTRO ARRAYLIST
		
		listaEnteros.add(5);
		listaEnteros.add(7);
		listaEnteros.add(9);
		listaEnteros.add(10);
		
		ArrayList <Integer>listaNotas=new ArrayList<Integer>(listaEnteros);
		
		System.out.println(listaNotas);
		System.out.println(listaNotas.size());
		
		//boolean add
		if(listaCadenas.add("Primera cadena")) {
			System.out.println("Cadena añadida");
		}
		
		listaCadenas.add("Segunda Cadena");
		System.out.println(listaCadenas);
		
		//void add index object
		String cadenaIntermedia=new String("Cadena intermedia");
		
		listaCadenas.add(1,cadenaIntermedia);
		System.out.println(listaCadenas);
		
		//boolean add colección
		
		listaEnteros.addAll(listaNotas);
		System.out.println(listaEnteros);
		
		//boolean add coleccion index
		listaEnteros.addAll(2,listaNotas);
		System.out.println(listaEnteros);
		
		
		//object set index object
		String viejaCadena =listaCadenas.set(1,"nueva cadena intermedia");
		System.out.println(viejaCadena);
		listaCadenas.add(viejaCadena);
		System.out.println(listaCadenas);
		listaCadenas.set(3,"Tercera cadena");
		System.out.println(listaCadenas);
		
		//clear()
		
		listaCursos.add(new Curso());
		int tam=listaCursos.get(0).getAsignaturas().length;
		System.out.println(tam);
		listaCursos.add(new Curso());
		System.out.println(listaCursos.size());
		listaCursos.clear();
		System.out.println(listaCursos.size());
		
		//boolean contains
		if(listaCadenas.contains("Primera cadena")) {
		System.out.println("Si lo contiene");
		}
		
		if(!listaEnteros.contains(2)) {
			System.out.println();
		}
		
		//boolean containsAll
		if(listaNotas.containsAll(listaEnteros)) {
			System.out.println("Si lo contiene");
		}
		
		//object get(index)
		System.out.println(listaCadenas.get(0));
		
		//indexOf
		
		System.out.println(listaEnteros.indexOf(5));
		System.out.println(listaEnteros.indexOf(7));
		System.out.println(listaEnteros.indexOf(11));
		
		//remove por indice
		listaEnteros.remove(0);
		System.out.println(listaEnteros.remove(listaEnteros.size()-1));
		System.out.println(listaEnteros);
		System.out.println(listaCadenas.remove(0));
		
		//remove por objeto
		if(listaCadenas.remove("Tercera cadena"))
			System.out.println("Eliminado");
		System.out.println(listaCadenas);
		
		if(!listaCadenas.remove("Nada")) {
			System.out.println("No esta");
		}
		
		//size()
		System.out.println(listaCadenas.size());
		
		//isEmpty()
		if(listaDecimales.isEmpty()) {
			System.out.println("El array esta vacio");
		}
		
		//Recorrer
		String cadena2;
		for(int i=0;i<listaCadenas.size();i++) {
			cadena2=listaCadenas.get(i);
			System.out.println(listaCadenas.get(i));
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce entero hasta negativo");
		int entero=sc.nextInt();
		for(int i=listaEnteros.size()-1;entero>=0;i++) {
			listaEnteros.add(entero);
			listaEnteros.get(i);
			System.out.println("Introduce entero hasta negativo");
			entero=sc.nextInt();
			}
		System.out.println(listaEnteros);
		
		
		for(String cadena:listaCadenas) {
			System.out.println(cadena);
		}
		

		
	}
	

}
