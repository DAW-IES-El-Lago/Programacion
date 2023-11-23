package arraysmulti;

import java.util.Arrays;

public class ej5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]a=new int [20];
		
		for (int i=0;i<a.length;i++) {
			int random=((int)Math.floor(Math.random()*10+(-10)));
			a[i]=random;
		}
		System.out.println(Arrays.toString(a));
	}

}
