package arraylistej1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asignatura[]asignaturas=new Asignatura[5];
		
		asignaturas[0]=new Asignatura("Programación",8,"prog");
		asignaturas[1]=new Asignatura("Bases de datos",6,"BBDD");
		asignaturas[2]=new Asignatura("Sistemas Informáticos",5,"SI");
		
		Curso DAW1=new Curso("Desarrollo","DAW1",asignaturas);

	}

}
