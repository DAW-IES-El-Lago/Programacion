package arraysmulti;

import java.util.Arrays;
import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[]a=new int[10];
		int[][]m=new int[3][3];
		
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Introduce valor "+i+":");
			a[i]=sc.nextInt();
			if(a[i]==0) {
				break;
			}
		}
		
		System.out.println(Arrays.toString(a));
		
		

	}

}
