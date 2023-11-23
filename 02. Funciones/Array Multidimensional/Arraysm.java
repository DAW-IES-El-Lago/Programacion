package arraysmulti;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
		
		System.out.println("Numero de filas:");
		int fila=Integer.parseInt(sc.nextLine());
		System.out.println("Numero de columnas:");
		int colum=Integer.parseInt(sc.nextLine());
		
		
		int[][]abc=new int[fila][colum];
		
		

	for(int i=0; i<abc.length; i++) {
		
		System.out.println("Introduce los valores de la fila "+i+" :");
		for(int j=0; j<abc[i].length;j++) {
			System.out.println("Introduce posición ["+i+"]["+j+"] :");
			abc[i][j]=Integer.parseInt(sc.nextLine());
						
}
		System.out.println();
	}
	int[][] matrizTranspuesta = new int[abc[0].length][abc.length];
	
	for(int i=0; i<matrizTranspuesta.length;i++) {
		for(int j=0; j<matrizTranspuesta[i].length; j++) {
			matrizTranspuesta[i][j]=abc[j][i];
		}
	}
	System.out.println();
	}
}


