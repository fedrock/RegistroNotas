package ar.edu.unju.fi.main;


import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNotas;

public class Main {

	public static void main(String[] args) {
		// Ejemplo de while
		/*
		System.out.println("Inicio del programa");
		int numero = 11;
		while (numero<=10) {
			System.out.println(numero);
			numero++;
		}
		System.out.println("Fin del programa");
		//Ejemplo de do while
		System.out.println("Inicio del programa ");
		numero = 1;
		do {
			System.out.println(numero);
			numero++;
		}while (numero<=10);
		System.out.println("Fin del programa");
		*/
		//Notas Finales de 4 materias
		
		Alumno alumno = generarAlumno();
		System.out.println(alumno.toString());
		Scanner scanner = new Scanner(System.in);
		int numMaterias = 1;
		while (numMaterias <= 2) {
			//Se cargan las materias
			System.out.println("Ingrese el codigo de la materia ");
			String codigoMateria = scanner.next();
			System.out.println("Ingrese el nombre de la materia: ");
			String nombreMateria = scanner.next();
			
			Materia materia = new Materia(codigoMateria, nombreMateria);
			
			System.out.println("Ingrese el codigo de registro de la Nota: ");
			String codigoNota = scanner.next();
			System.out.println("Ingrese nota final: ");
			Float nota = scanner.nextFloat();
			
			RegistroNotas registroNotas = new RegistroNotas(codigoNota, alumno, materia, nota);
		
			System.out.println(registroNotas.toString());
			
			numMaterias++;
		}
		
	}
	public static Alumno generarAlumno () {
		Scanner scanner = new Scanner(System.in);
		Alumno alumno = new Alumno();
		System.out.println("Ingrese el legajo: ");
		Integer legajo = scanner.nextInt();
		System.out.println("Ingrese el apellido: ");
		String apellido = scanner.next();
		System.out.println("Ingrese el nombre: ");
		String nombre = scanner.next();
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		return alumno;
	}
	
	
	
	
}
