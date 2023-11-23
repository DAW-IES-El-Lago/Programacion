package arraylistejs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>l1=new ArrayList<>();
		Scanner sc=new Scanner (System.in);
		
		for(int i=0;i<10;i++) {
			System.out.println("Introduce el numero en la posicion "+i);
			int a=sc.nextInt();
			l1.add(a);	
		}
		
		
		Collections.sort(l1);
		
		for (int l2 : l1) {
            System.out.println(l2);
        }

	}

}
