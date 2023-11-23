package arraylistejs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>l1=new ArrayList<>();
		Scanner sc=new Scanner (System.in);
		
		for(int i=0;i<10;i++) {
			System.out.println("Introduce la palabra en la posicion "+i);
			String a=sc.nextLine();
			l1.add(a);	
		}
		
		
		Collections.sort(l1);
		
		for (String l2 : l1) {
            System.out.println(l2);
        }

	}

}
