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

		// Llamamiento al método variablesChallenge.
		variablesChallenge();

	}

	/**
	 * Method that creates the objects of type Developer and the use of its methods
	 */
	private static void variablesChallenge() {

		// Creador del objeto StringBuilder
		StringBuilder cadena = new StringBuilder();

		// Creador de objetos Developer.
		if (Developer.verification(4)) {
			Developer dev1 = new Developer("Manuel");
			Developer dev2 = new Developer("Javier");
			Developer dev3 = new Developer("Alvaro");
			Developer dev4 = new Developer("Raquel");
		
			// Devuelve el valor total de empleados en la empresa llamado desde diferentes desarrolladores.
			System.out.println(cadena.append("Total de empleados en la empresa llamada desde el empleado con ID ").append(dev1.getIdEmployed()).append(" es: ")
			        .append(dev1.getEmployed()));
			cadena.setLength(0);

			System.out.println(cadena.append("Total de empleados en la empresa llamada desde el empleado con ID ").append(dev4.getIdEmployed()).append(" es: ")
			        .append(dev4.getEmployed()));
			cadena.setLength(0);

			// Devuelve el id de cada empleado
			System.out.println(cadena.append("\n").append("el empleado ").append(dev1.getEmployedName()).append(" posee la ID ").append(dev1.getIdEmployed()));
			cadena.setLength(0);
			System.out.println(cadena.append("el empleado ").append(dev2.getEmployedName()).append(" posee la ID ").append(dev2.getIdEmployed()));
			cadena.setLength(0);
			System.out.println(cadena.append("el empleado ").append(dev3.getEmployedName()).append(" posee la ID ").append(dev3.getIdEmployed()));
			cadena.setLength(0);
			System.out.println(cadena.append("el empleado ").append(dev4.getEmployedName()).append(" posee la ID ").append(dev4.getIdEmployed()));
			cadena.setLength(0);

			// Invocacion del método que resta días de vacaciones al objeto.

			System.out.println(cadena.append("\n").append("Los días actuales de vacaciones de ").append(dev2.getEmployedName()).append(" es de ")
			        .append(dev2.getHolidaysEmployed()).append(" tras la resta indicada, ahora es de ").append(dev2.subtractVacationDays(3)));
			cadena.setLength(0);

			// Consulta de días que puede disfrutar cada programador.
			System.out.println(cadena.append("\n").append("Los dias actuales de vacaciones del empleado ").append(dev1.getEmployedName()).append(" es de ")
			        .append(dev1.getHolidaysEmployed()));
			cadena.setLength(0);
			System.out.println(cadena.append("Los dias actuales de vacaciones del empleado ").append(dev2.getEmployedName()).append(" es de ")
			        .append(dev2.getHolidaysEmployed()));
			cadena.setLength(0);
			System.out.println(cadena.append("Los dias actuales de vacaciones del empleado ").append(dev3.getEmployedName()).append(" es de ")
			        .append(dev3.getHolidaysEmployed()));
			cadena.setLength(0);
			System.out.println(cadena.append("Los dias actuales de vacaciones del empleado ").append(dev4.getEmployedName()).append(" es de ")
			        .append(dev4.getHolidaysEmployed()));
			cadena.setLength(0);

			// Pinta la empresa, llamandola desde la clase directamente.
			System.out.println(Developer.getBUSINESS());

		}

	}
}
