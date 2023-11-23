package arraysmulti;

import java.util.Scanner;

public class ej13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int[]a=new int[5];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		boolean cre=true;
		boolean fal=true;
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				cre=false;
			}
			if(a[i]<a[i+1]) {
				fal=false;
			}
		}
		
		if (cre) {
            System.out.println("Los números están ordenados de forma creciente");
        } else if (fal) {
            System.out.println("Los números están ordenados de forma decreciente");
        } else {
            System.out.println("Los números están desordenados");
        }

	}

}
