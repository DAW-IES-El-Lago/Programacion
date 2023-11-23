package arraysmulti;

public class ej4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a=new int [10];
		
		for (int i=0;i<a.length;i++) {
			int random=((int)Math.floor(Math.random()*100+1));
			a[i]=random;
			System.out.println(random+". Cuadrado: "+random*random+" Cubo: "+random*random*random);
		}

	}

}
