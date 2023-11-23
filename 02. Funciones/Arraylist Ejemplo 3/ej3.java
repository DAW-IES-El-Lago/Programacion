package arraylistejs;

import java.util.ArrayList;
import java.util.Collections;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam=(int)(Math.random()*11)+10;
		ArrayList<Integer>l1=new ArrayList<Integer>();
		
		
		for(int i=0; i<tam;i++) {
		l1.add((int)Math.random()*101);	
		}
		
		
		
		
		
		

	}
	public static int suma(ArrayList<Integer>lista) {
		int suma=0;
		
		for(int i=0;i<lista.size();i++) {
			suma=suma+lista.get(i);
		}
		return suma;
		
	}
   public static int minimo(ArrayList<Integer>lista) {
	   
	   int minimo=lista.get(0);
	   
	   for(int i=1;i<lista.size();i++) {
			if(lista.get(i)<minimo) {
				minimo=lista.get(i);
			}
		}
		return minimo;
		
		
	}
    public static int maximo(ArrayList<Integer>lista) {
    	ArrayList<Integer>l2=new ArrayList<Integer>(lista);
    	Collections.sort(l2);
    	return l2.get(l2.size()-1);

}
    
    public static double media(ArrayList<Integer>lista) {
 	   
 	   int suma=0;
 	   
 	   for(int elemento:lista) {
 		   suma=suma+elemento;
 		}
 		return (double)suma/lista.size()
; 		
 		
 	}

}
