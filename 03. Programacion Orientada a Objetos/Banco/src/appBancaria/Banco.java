package appBancaria;

import java.util.Scanner;

public class Banco {

	public boolean codigoBanco(int b, boolean blanco) {
		
		if(blanco) {
			return true;
		}
		else {
			if(b>=200 && b<=999) {
				return true;
			}
			else {
				return false;
			}
		}
		
	}
	
	
	
	public boolean codigoSucursal(int s) {
		
		if(s>=1000 && s<=9999) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	
	public boolean numeroCuenta(int c) {
		
		if(c>=10000 && c<=99999) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	
	public boolean clavePersonal(String p) {
		
		p=p.toLowerCase();
		int numeros=0, letras=0;
		
		if(p.length()!=5)
			return false;
		
		for(int i=0; i<p.length(); i++) {
			if((int)(p.charAt(i))>=97 && (int)(p.charAt(i))<=122) {
				letras++;
			}
			if((int)(p.charAt(i))>=48 && (int)(p.charAt(i))<=57) {
				numeros++;
			}
		}
		
		if(letras==5)
			return false;
		if(numeros==5)
			return false;
		else
			return true;
		
	}
	
	
	
	public boolean orden(String o) {
		
		o=o.toUpperCase();
		
		if(o=="" || o=="TALONARIO" || o=="MOVIMIENTOS") {
			return true;
		}
		else
			return false;
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
	}
	
}
