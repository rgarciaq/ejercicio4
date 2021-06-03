/**
 * @author Raúl García
 * @version 2020-12 (4.18.0)
 */
package ejercicio4;

import java.util.Scanner;

public class GestionVacunas {

public static void main(String[] args) {
	
	String nombre,dni,nombreVacuna="",vacuna1="",vacuna2="",mesVacuna1="",mesVacuna2="";

	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduzca el nombre del paciente:");
	nombre = teclado.next();
	System.out.println("Introduzca el dni del paciente:");
	dni = teclado.next();
	System.out.println("¿Vacuna 1 o 2?");
	nombreVacuna = teclado.next();
	
	if(nombreVacuna.equals("1")) {
		System.out.println("Introduzca la vacuna 1: ");
		vacuna1 = teclado.next();
		System.out.println("Introduzca el mes de vacunación de vacuna 1:");
		mesVacuna1 = teclado.next();
		
	}else if(nombreVacuna.equals("2")) {
		
		System.out.println("Introduzca la vacuna 2: ");
		vacuna2 = teclado.next();
		System.out.println("Introduzca el mes de vacunación de vacuna 2:");
		mesVacuna2 = teclado.next();
		
	}else {
		System.out.println("Error");
	}
					
	System.out.println("VACUNACIÓN PACIENTE "+ nombre +"-"+ dni + "_________________");
	System.out.println("Vacuna 1 "+ vacuna1 +" Fecha:"+mesVacuna1);
	System.out.println("Vacuna 2 "+ vacuna2 +" Fecha:"+mesVacuna2);
	
	tipoVacuna(nombre, vacuna1, vacuna2);		
	}

/**
 * 
 * @param nombre
 * @param vacuna1
 * @param vacuna2
 */
private static void tipoVacuna(String nombre, String vacuna1, String vacuna2) {
	if(vacuna2.equals("")) {
		if(vacuna1.equals("Moderna")) {
			System.out.println("El paciente "+ nombre + " debe esperar 5 meses para la vacuna 2 ");
		}else if(vacuna1.equals("Pfizer")) {
			System.out.println("El paciente "+ nombre + "debe esperar 4 meses para la vacuna 2 ");
		}else if(vacuna1.equals("Janssen")) {
			System.out.println("El paciente está ya vacuando");
		}else {
			System.out.println("El paciente "+ nombre + " está ya vacunado ");
		}
	}
}
}