package arraysmulti;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce el tamaño de la matriz cuadrada:");
		Scanner sc=new Scanner (System.in);
		int tam=sc.nextInt();
		boolean [][] a=new boolean[tam][tam];
		
		for(int i=0; i<tam;i++)
			for(int j=0;j<tam;j++) {
				if(esPrimo(i) && esPrimo(j))
					a[i] [j]=true;
				
				if(!factoresComunes(i,j))
					a[i][j]=true;
					
			}
		

	}
	
	public static boolean esPrimo (int n) {
		int cont=0;
		if(n==1 && n==0)
			return false;
		for(int i=2;i<n;i++) {
			
			if(n%i==0)
				return false;
		}
			return true;
	}
	
	public static boolean factoresComunes(int n1,int n2) {
		int menor;
		
		if(n1<n2)
			menor=n1;
		else
			menor=n2;
		for(int i=2; i<menor;i++) {
			
			if (n1%i==0 && n2%i==0)
				return true;
	}
	return false;

}
}
