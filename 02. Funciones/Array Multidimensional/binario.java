package arraysmulti;

import java.util.Scanner;

public class binario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un numero binario:");
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		
		int natural=calacularNatural(n);
		
		if(natural>=0) {
			System.out.println("Es binario.");
		}else {
			System.out.println("no Es binario.");
		}
		
		

	}
	public static int calacularNatural(long n) {
		
		int i=0,d=0, binario=0;
		if(n<0) {
			return -1;
		}
		
		while(n>=0) {
			d=(int)n%10;
			if(d==1) {
				binario= binario + (int)Math.pow(2,i);
			}else {
				if(d!=0) {
					return -1;
				}
			}
			n=n/10;
			i++;
		}
		return binario;
	}

}
