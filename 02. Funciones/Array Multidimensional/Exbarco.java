package arraysmulti;

import java.util.Scanner;

public class Exbarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean[][] tablero=new boolean[10][10];
		
		posicionarBarco(tablero,sc);
		dibujarTablero(tablero);
		

	}
	
	public static void posicionarBarco(boolean[][] tablero,Scanner sc) {
		System.out.println("Jugador 1,¿Como quieres posicionar el barco?");
		System.out.println("Horizontal");
		System.out.println("Verical");
		String direccion=sc.nextLine();
		int f=0;
		int c=0;
		
		switch(direccion) {
		
		case "Horizontal":
			do {
				System.out.println("Introduce la fila de la posicion inicial: ");
				 f=Integer.parseInt(sc.nextLine());
				System.out.println("Introduce la columna de la posicion inicial: ");
				 c=Integer.parseInt(sc.nextLine());
			}while(!posicionValida(f,c+3,tablero.length));
			for(int i=c;i<c+4;i++) {
				tablero[f][i]=true;
			}
			break;
		
		case "Vertical":
			do {
				System.out.println("Introduce la fila de la posicion inicial: ");
				f=Integer.parseInt(sc.nextLine());
				System.out.println("Introduce la columna de la posicion inicial: ");
				 c=Integer.parseInt(sc.nextLine());
			}while(!posicionValida(f+3,c,tablero.length));
			for(int i=f;i<f+4;i++) {
				tablero[i][c]=true;
			}
			break;
		
		default:
			System.out.println("Opcion incorrecta");
		}
		
		
	}
	
	public static boolean posicionValida(int f,int c, int tam) {
	if(f>tam || c>tam)	{
		return false;
	}
	return true;
	}
	
	public static void dibujarTablero(boolean[][] tablero) {
		for (int i=0; i<tablero.length;i++) {
			for (int j=0; j<tablero[i].length;j++) {
				if(tablero[i][j])
					System.out.print("X");
				else
					System.out.print("O");
			}
			System.out.println();
		}
	}
	
	

}
