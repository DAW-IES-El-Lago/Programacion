package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nombres=new ArrayList<String>();
		
		ArrayList<Integer> edades=new ArrayList<Integer>();
		
		ArrayList<Persona> personas=new ArrayList<Persona>();
		
		nombres.add("José");
		
		String n="Manuel";
		
		nombres.add(n);
		
		nombres.set(0, "Carmen");
		
		System.out.println(nombres);
		
		System.out.println(nombres.get(0)+" ,"+nombres.get(1));
		
		nombres.remove(0);
		
		System.out.println(nombres);
		
		edades.add(1);
		edades.add(2);
		edades.add(3);
		edades.add(4);
		edades.add(5);
		
		System.out.println(edades);
		edades.remove(2);
		System.out.println(edades);
		
		edades.clear();
		System.out.println(edades);
		
		System.out.println("Nombres: "+nombres.size()+" Edades: "+edades.size());
		
		edades.add(1);
		edades.add(2);
		edades.add(3);
		edades.add(4);
		edades.add(5);
		
		
		for(int i=0;i<edades.size();i++) {
			System.out.println(edades.get(i));
		}
		
		Persona p1=new Persona("Carlota","12345678C",25);
		
		personas.add(p1);
		personas.add(new Persona("Ana","12345678B",30));
		
		for(int i=0;i<personas.size();i++) {
			if(personas.get(i).nombre.equals("Manuel")) {
				System.out.println(personas.get(i).nombre);
				System.out.println(personas.get(i).DNI);
				System.out.println(personas.get(i).edad);
				System.out.println(personas.get(i).toString());
			}
		}
		System.out.println(personas.get(0).toString());
		
		
		for(String name:nombres) {
			System.out.println(name);
		}
		
		//-------------------------------------------------------------------------------//
		
	
		ArrayList<String> arrayIterar=new ArrayList<String>();
		
		
		arrayIterar.add("elemento 1");
		arrayIterar.add("elemento 2");
		arrayIterar.add("elemento 3");
		
		Iterator<String> itCadenas=arrayIterar.iterator();
		
		while(itCadenas.hasNext()) {
			System.out.println(itCadenas.next());
		}
		
		itCadenas=arrayIterar.listIterator(5);
		
		while(itCadenas.hasNext()) {
			System.out.println(itCadenas.next());
		}
		
		itCadenas=arrayIterar.listIterator();
		while(itCadenas.hasNext()) {
			if(itCadenas.next().endsWith("6")) {
				itCadenas.remove();
			}
		}
		
		System.out.println(arrayIterar);
		
		itCadenas=arrayIterar.listIterator();
			
		while(itCadenas.hasNext()) {
		if(itCadenas.next().startsWith("el")) {
			itCadenas.remove();
					}

				
		

	}
	}
}
