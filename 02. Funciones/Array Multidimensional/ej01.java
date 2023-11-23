package arraysmulti;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ej01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt(); // número de equipos
	        HashMap<Integer, Equipo> equipos = new HashMap<>();
	        
	        // Inicializar equipos
	        for (int i = 1; i <= n; i++) {
	            equipos.put(i, new Equipo(i));
	        }
	        
	        // Leer resultados y actualizar tablas
	        while (sc.hasNextInt()) {
	            int local = sc.nextInt();
	            int golesLocal = sc.nextInt();
	            int visitante = sc.nextInt();
	            int golesVisitante = sc.nextInt();
	            
	            // Actualizar estadísticas del equipo local
	            Equipo equipoLocal = equipos.get(local);
	            equipoLocal.partidosJugados++;
	            equipoLocal.golesMarcados += golesLocal;
	            equipoLocal.golesRecibidos += golesVisitante;
	            if (golesLocal > golesVisitante) {
	                equipoLocal.puntos += 3;
	            } else if (golesLocal == golesVisitante) {
	                equipoLocal.puntos += 1;
	            }
	            
	            // Actualizar estadísticas del equipo visitante
	            Equipo equipoVisitante = equipos.get(visitante);
	            equipoVisitante.partidosJugados++;
	            equipoVisitante.golesMarcados += golesVisitante;
	            equipoVisitante.golesRecibidos += golesLocal;
	            if (golesVisitante > golesLocal) {
	                equipoVisitante.puntos += 3;
	            } else if (golesVisitante == golesLocal) {
	                equipoVisitante.puntos += 1;
	            }
	        }
	        
	        // Imprimir tablas
	        for (int i = 1; i <= n; i++) {
	            Equipo equipo = equipos.get(i);
	            System.out.println(equipo.id + " " + equipo.partidosJugados + " " + equipo.golesMarcados + " " + equipo.golesRecibidos + " " + equipo.puntos);
	        }
	    }
	}

	class Equipo {
	    int id;
	    int partidosJugados;
	    int golesMarcados;
	    int golesRecibidos;
	    int puntos;
	    
	    Equipo(int id) {
	        this.id = id;
	    }
	}
