package arraysmulti;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int cont=0,t=0;
	
		
		while(t<1 || t>100) {
			Scanner sc=new Scanner (System.in);
			System.out.println("TAMAÑO ARRAY:");
			t=sc.nextInt();
			cont=cont+1;
			if(cont==3 && t<1 || t>100) {
				System.out.println("FIN");
				break;
			}
			
		}
		if (t>0 && t<101) {	
		
		int[]a=new int[t];
		for (int pos=0;pos<a.length;pos++) {
			a[pos]=(int)(Math.random()*100+1);
			int cb=a[pos];
			
			System.out.println(a[pos]);
			
		}
		System.out.println("FIN");
		}
		}
		
		
		
		
	
		

	}


	
