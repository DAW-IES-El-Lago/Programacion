package String;

import java.util.Scanner;

public class str1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//TEORIA STRING
		
		String t1="Hola";
		
		String t2= new String();//vacio
		
		System.out.println("¿Esta vacio el String t2?");
		System.out.println(t2.isEmpty());//boolean
		
		t2="que tal";
		
		System.out.println("¿Ahora?");
		System.out.println(t2.isEmpty());// if(!s.isEmpty())->FALSE LO HACE
		
		
		String t3=new String("adios");
		
		String t4;
		t4=".";
		
		//length() -> Metodo de la clase String que devuelve un int
		
		System.out.println(t1+" tiene "+t1.length()+" letras");
		
		for(int i=0; i<t1.length();i++) {
			System.out.println(t1.charAt(i));
			//.charAt
			//H
			//O
			//L
			//A
		}
		//System.out.println(t1.charAt(t1.length())); ERROR
		System.out.println("Ultima letra de " +t1+":"+t1.charAt(t1.length()-1));
		
		String mayus=t1.toUpperCase();
		String minus=t1.toLowerCase();
		
		System.out.println(mayus+" "+minus);
		
		String s2="next job";
		String s3="nex";
		if(s2.startsWith("Nex")) {
			System.out.println(s2);
		}
		if(s2.startsWith(s3)) {
			System.out.println("Empieza por"+s2);
		}
		String s4="next next";
		if(s4.startsWith(s3)) {
			if (s4.startsWith(s3,5)) {
				System.out.println(s4);
			}
		}
		if(s4.endsWith("ext")) {
			System.out.println("ext");
		}
		String[] nombres= {"Luis Martin","Juan Martinez","Pepe Marcial","Sonia Machin","Tania Martinez"};
		
		String nombre="Juan Martinez";
		
		int espacio=nombre.indexOf(" ");
		
		for(int i=0;i<nombres.length;i++) {
			int posEspacio=nombres[i].indexOf(" ");
			if(nombres[i].startsWith("Martinez", posEspacio +1)) {
				System.out.println(nombres[i]); 
			}
		}
		
		for(int i=0;i<nombres.length;i++) {
			int posEspacio=nombres[i].indexOf(" M");
			if(nombres[i].startsWith("Martin", posEspacio +1)) {
				System.out.println(nombres[i]); 
			}
		}
		int posE=nombres[2].indexOf('e');
		if(posE>=0) {
			if(nombres[2].indexOf('e',posE+1)>=0) {
				System.out.println(nombres[2]+" tiene dos 'e'");
			}
		}
		System.out.println(nombres[0].lastIndexOf('i'));
		System.out.println(nombres[0].lastIndexOf('i',8));
		
		System.out.println(nombres[2].lastIndexOf("pe"));
		System.out.println(nombres[2].lastIndexOf("pe",1));
		System.out.println(nombres[2].toLowerCase().lastIndexOf("pe",1));
		
		String comparar1="HOLA";
		String comparar2="HoLa";
		
		if(comparar1.equals(comparar2.toUpperCase())) {
			System.out.println("son iguales");
		}
		
		for(int i=0;i<nombres.length;i++) {
		if(nombres[i].equals("Sonia Machin"))	{
			System.out.println("Sonia Machin esta en la posicion "+i);
			break;
		}
		}
		if (comparar1.equalsIgnoreCase(comparar2)) {
			System.out.println("son iguales ignorando mayuscula/minuscula");
		}
		
		String frase="Comienza la parte de POO";
		
		if(frase.contains("POO")) {
			System.out.println("Esta frase contiene POO");
		}
		
		String r="radiografia";
		
		System.out.println(r.compareTo("radia"));
		
		System.out.println('a'-'o');
		
		posE=nombres[4].indexOf(' ');
		
		System.out.println("Nombre: "+ nombres[4].substring(0,posE));
		System.out.println("Apellido: "+nombres[4].substring(posE+1,nombres[4].length()));
		
		String comentarios="15,usuario1,usuario2,comentario";
		
		int idComentario=Integer.parseInt(comentarios.substring(0,2));
		
		int posComa=comentarios.indexOf(',');
		int posComa2=comentarios.indexOf(',',posComa+1);
		String emisor=comentarios.substring(posComa+1,posComa2);
		System.out.println("Comentario "+idComentario+" de "+emisor);
		
		
		comentarios=comentarios.replaceAll("usuario","user");
		
		System.out.println(comentarios.replaceFirst("user","usuario"));
		
		System.out.println(comentarios);
		
		System.out.println(comentarios.replace('u','U'));
		
		System.out.println(comentarios.replace((CharSequence)"us", "US"));
		
		String aes="          aaaa     aaaaaa      ";
		
		System.out.println(aes.length()+" "+aes.trim().length());
		
		
		/*
		Scanner sc =new Scanner(System.in);
		String nombreScanner=sc.nextLine();
		
		int n=sc.nextInt();
		
		nombreScanner=sc.nextLine();
		*/
		
		String cadena1="Ca de na con esp a cios";
		String cadena2="Cadenaconespacios";
		
		int posEs,posE2;
		posEs=cadena1.indexOf(' ');//Primer espacio
		String subcadena="";
		String subcadena2="";
		/*
		if(posEs!=-1) {
			subcadena=cadena1.substring(0,posEs);
		}
		System.out.println(subcadena);
		
		posE2=posEs;
		*/
		posE2=-1;
		
		do {
			posEs=posE2;
			
			posE2=cadena1.indexOf(' ',posEs+1);
			
			if(posE2!=-1) 
			subcadena2=cadena1.substring(posEs+1,posE2);
			else 
				subcadena2=cadena1.substring(posEs+1,cadena1.length());
				
				subcadena=subcadena+subcadena2;
			
		}while(posE2!=-1);
		
		System.out.println(subcadena);
		
		cadena1=subcadena;
		
		if(cadena1.equals(cadena2)) {
			cadena1=subcadena;
		}
		
		
		
				}

}
