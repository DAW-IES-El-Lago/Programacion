package arraysmulti;

import java.util.Arrays;
import java.util.Scanner;

public class ej3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Tamaño array:");
		int t=sc.nextInt();
		int suma=0;
		int[]a=new int[t];
		
		for (int i=0;i<a.length-1;i++) {
			int random=((int)Math.floor(Math.random()*10+1));
			a[i]=random;
			suma=suma+random;	
		}
		a[a.length-1]=suma;
		System.out.println(Arrays.toString(a));
		
	}

	
}
