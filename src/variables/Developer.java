package variables;

public class Developer {

	// Declaraciones de variables.
	private static int employed = 0;
	private int idEmployed;
	private String employedName;
	private int holidaysEmployed = 21;
	public final static String EMPRESA = "EVERIS";

	// M�todo constructor.
	public Developer(String employedName) {

		employed++;
		this.idEmployed = employed;
		this.employedName = employedName;

	}

	// toString con el patron de escritura por consola.
	@Override
	public String toString() {
		return "Developer: EmployedName=" + employedName + ", IDEmployed=" + idEmployed + ", HolidaysEmployed=" + holidaysEmployed + "]";
	}

	/**
	 * Getters and Setters.
	 * 
	 *
	 */
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

	public static String getEmpresa() {
		return EMPRESA;
	}

	// M�todos.

	// M�todo que resta dias de vacaciones al objeto invocante.
	public int restarDiasVacaciones(int diasARestar) {
		int resultado;
		
		//Condicional que controla que el d�a introducido sea mayor que 0 y que el empleado tenga mas dias de vacaciones que el numero introducido por par�metro.
		if(this.getHolidaysEmployed()>=diasARestar && diasARestar>0) {
			// trae los dias de vacaciones del objeto invocante y lo resta con los d�as introducidos por par�metros.
			resultado = this.getHolidaysEmployed() - diasARestar;
			this.setHolidaysEmployed(resultado);
		}else {
			resultado=this.getHolidaysEmployed();
			System.out.println("Error, no se le puede restar m�s dias de vacaciones o el valor introducido es menor a 0");
		}

		return resultado;

	}

}
