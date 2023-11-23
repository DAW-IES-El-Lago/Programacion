package arraysmulti;

import java.util.Arrays;
import java.util.Scanner;

public class ej13a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]a=new int[10];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<8;i++) {
			System.out.println("Ingrese un número: ");
			int num=sc.nextInt();
			
			a[i]=num;
		}
		
		for(int i=8;i<a.length;i++) {
			System.out.println("Ingrese un numero: ");
			int num=sc.nextInt();
			System.out.println("Ingrese una posicion: ");
			int pos=sc.nextInt();
			
		
		
		for(int j=i;j>pos;j--) {
			a[j]=a[j-1];
		}
		
		a[pos]=num;
		}
		System.out.print(Arrays.toString(a));

	}

}
