package arraysmulti;

import java.util.Scanner;

public class r13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Num1:");
		int n1=sc.nextInt();
		System.out.println("Num2:");
		int n2=sc.nextInt();
		
		
		if(n2>n1) {
			int aux=n1;
			n1=n2;
			n2=aux;
		}
		
			for (int i=1;i<=n2;i++) { // i=1 ... hasta i>n2
				System.out.println();
				
					for (int j=1;j<=n1;j++) {
							System.out.print(" *");
					}

		

			}
	}

}
	