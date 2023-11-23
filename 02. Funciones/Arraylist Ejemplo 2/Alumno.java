package arraylistej1;

import java.util.ArrayList;

public class Alumno {
public static int numAl;
public String nombre;
public String apellido1;
public String apellido2;
private String DNI;
private ArrayList<Nota>notas;
public Curso curso;

public Alumno() {
	this.notas=new ArrayList<Nota>();
	
}

public Alumno(String nombre,String ap1,String ap2,String DNI) {
	this();
	this.nombre=nombre;
	this.apellido1=ap1;
	this.apellido2=ap2;
	this.DNI=DNI;	
}

public Alumno(Curso curso,String nombre,String ap1,String ap2,String DNI) {
	this(nombre,ap1,ap2,DNI);
	this.curso=curso;
}

public static int getNumAl() {
	return numAl;
}

public static void setNumAl(int numAl) {
	Alumno.numAl = numAl;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido1() {
	return apellido1;
}

public void setApellido1(String apellido1) {
	this.apellido1 = apellido1;
}

public String getApellido2() {
	return apellido2;
}

public void setApellido2(String apellido2) {
	this.apellido2 = apellido2;
}

public String getDNI() {
	return DNI;
}

public void setDNI(String dNI) {
	DNI = dNI;
}

public ArrayList<Nota> getNotas() {
	return notas;
}

public void setNotas(ArrayList<Nota> notas) {
	this.notas = notas;
}

public Curso getCurso() {
	return curso;
}

public void setCurso(Curso curso) {
	this.curso = curso;
}

public String tostring() {
	return
}

}
