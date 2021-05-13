package fpdualeveris;

import variables.Developer;

/**
 * Dual-Ejercicio1-Java.
 * 
 * @author jjimemon
 *
 */

public class FPDual {

	/**
	 * Main Class
	 * 
	 * @param
	 */

	public static void main(String[] args) {

		// Llamamiento al método.
		variablesChallenge();

	}

	// Método que crea los objeto de tipo Developer y el uso de sus métodos.
	private static void variablesChallenge() {

		// Creaciones de objetos.
		Developer dev1 = new Developer("Manuel");
		Developer dev2 = new Developer("Javier");
		Developer dev3 = new Developer("Alvaro");
		Developer dev4 = new Developer("Raquel");

		// Nos devuelve el valor total de empleados en la empresa.
		System.out.println("Total de empleados en la empresa llamada desde el empleado con ID " + dev1.getIdEmployed() + " es: " + dev1.getEmployed());
		System.out.println("Total de empleados en la empresa llamada desde el empleado con ID " + dev4.getIdEmployed() + " es: " + dev4.getEmployed());

		// Devuelve el id de cada empleado
		System.out.println("\n" + "el empleado " + dev1.getEmployedName() + " posee la ID " + dev1.getIdEmployed());
		System.out.println("el empleado " + dev2.getEmployedName() + " posee la ID " + dev2.getIdEmployed());
		System.out.println("el empleado " + dev3.getEmployedName() + " posee la ID " + dev3.getIdEmployed());
		System.out.println("el empleado " + dev4.getEmployedName() + " posee la ID " + dev4.getIdEmployed());

		// Invocacion del metodo que resta dias de vacaciones al objeto.

		System.out.println("\n" + "Los días actuales de vacaciones de " + dev2.getEmployedName() + " es de " + dev2.getHolidaysEmployed() + " tras la resta indicada, ahora es de "
		        + dev2.restarDiasVacaciones(3));

		// Consulta de días que puede disfrutar cada programador.
		System.out.println("\n" + "Los dias actuales de vacaciones del empleado "+dev1.getEmployedName()+" es de "+dev1.getHolidaysEmployed());
		System.out.println("Los dias actuales de vacaciones del empleado "+dev2.getEmployedName()+" es de "+dev2.getHolidaysEmployed());
		System.out.println("Los dias actuales de vacaciones del empleado "+dev3.getEmployedName()+" es de "+dev3.getHolidaysEmployed());
		System.out.println("Los dias actuales de vacaciones del empleado "+dev4.getEmployedName()+" es de "+dev4.getHolidaysEmployed()+"\n");

		// Pinta la empresa, llamandola desde la clase directamente.
		System.out.println(Developer.EMPRESA);

	}

}
