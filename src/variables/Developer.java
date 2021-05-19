package variables;


/**
 * Class that contains all the application logic
 * 
 * @author jjimemon
 *
 */

public class Developer {

	/** Variable declarations */
	private static int employed = 0;
	private int idEmployed;
	private String employedName;
	private int holidaysEmployed = 21;
	public final static String BUSINESS = "EVERIS";

	/**
	 * Constructor that receives employee name and creates the object
	 * 
	 * @param employedName
	 */
	public Developer(String employedName) {

		employed++;
		this.idEmployed = employed;
		this.employedName = employedName;

	}

	/** toString with the console write pattern */
	@Override
	public String toString() {
		return "Developer: EmployedName=" + employedName + ", IDEmployed=" + idEmployed + ", HolidaysEmployed=" + holidaysEmployed + "]";
	}

	/** Getters and Setters. */
	public String getEmployedName() {
		return employedName;
	}

	public static int getEmployed() {
		return employed;
	}

	public int getIdEmployed() {
		return idEmployed;
	}

	public void setIdEmployed(int idEmployed) {
		this.idEmployed = idEmployed;
	}

	public int getHolidaysEmployed() {
		return holidaysEmployed;
	}

	public void setHolidaysEmployed(int holidaysEmployed) {
		this.holidaysEmployed = holidaysEmployed;
	}

	public static String getBUSINESS() {
		return BUSINESS;
	}

	/**
	 * Method that subtracts vacation days from the invoking object
	 * 
	 * @param days
	 * @return resul
	 */
	public int subtractVacationDays(int days) {
		int resul;

		// Condicional que controla que el día introducido sea mayor que 0 y que el empleado tenga mas dias de vacaciones que el numero introducido por
		// parámetro.
		if (this.getHolidaysEmployed() >= days && days > 0) {
			// trae los dias de vacaciones del objeto invocante y lo resta con los días introducidos por parámetros.
			resul = this.getHolidaysEmployed() - days;
			this.setHolidaysEmployed(resul);
		} else {
			resul = this.getHolidaysEmployed();
			System.out.println("Error, no se le puede restar más dias de vacaciones o el valor introducido es menor a 0");
		}

		return resul;

	}
	
	/**
	 * Method that verifies whether or not more employees can be added.
	 * @param number
	 * @return yesOrNot
	 */
	public static boolean verification(int number) {

		boolean yesOrNot=Boolean.FALSE;

		if(getEmployed()+number>127) {
			System.out.println("No se ha podido iniciar, se ha excedido del límite de empleados(127)");
		}else {
			yesOrNot=Boolean.TRUE;
		}
		
		
		return yesOrNot;

	}

}
