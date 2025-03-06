package fecha;

/**
<<<<<<< HEAD
 * Clase fecha
 */
public class Fecha {
	/**
	 * Atributo privado d
	 */
	private int d; // d�a

	/**
	 * Atributo privado m
	 */
	private int m; // mes

	/**
	 * Atributo a
	 */
	private int a; // a�o

	/**
	 * Método fecha el cual no hace nada
=======
 * Clase Fecha
 */
public class Fecha {
	public static final int DIEZ = 10;
	private int varaibleD; // varaibleD�variableA
	private int variableM; // mes
	private int variableA; // variableA�o

	/**
	 * Metodo fecha
>>>>>>> pmd-refactor
	 */
	public Fecha() {

	}

	/**
<<<<<<< HEAD
	 * Constructor de fecha con sus diferentes parámetros
=======
	 * Constructor con los atributos de la clase
>>>>>>> pmd-refactor
	 * 
	 * @param dia
	 * @param mes
	 * @param anio
	 */
	public Fecha(int dia, int mes, int anio) {
		this.varaibleD = dia;
		this.variableM = mes;
		this.variableA = anio;
	}

	/**
<<<<<<< HEAD
	 * Método para comprobar si la fecha es correcta o no
	 * 
	 * @return true o false dependiendo del resultado
=======
	 * Método para hayar si la fecha es correcta o no
	 * 
	 * @return true o false dependiendo de la validez de la operacion
>>>>>>> pmd-refactor
	 */
	public boolean fechaCorrecta() {
		boolean diaCorrecto;
		boolean mesCorrecto;
		boolean anioCorrecto;
		anioCorrecto = variableA > 0;
		mesCorrecto = variableM >= 1 && variableM <= 12;
		boolean diaMayor1 = varaibleD >= 1;
		switch (variableM) {
		case 2:
			if (esBisiesto()) {
				diaCorrecto = diaMayor1 && varaibleD <= 29;
			} else {
				diaCorrecto = diaMayor1 && varaibleD <= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = diaMayor1 && varaibleD <= 30;
			break;
		default:
			diaCorrecto = diaMayor1 && varaibleD <= 31;
		}
		return diaCorrecto && mesCorrecto && anioCorrecto;
	}

	/**
	 * Método esBisiesto. Solo lo usa fechaCorrecta, por eso es privado
	 * 
<<<<<<< HEAD
	 * @return true o false dependiendo si el mes es bisiesto o no
=======
	 * @return true o false dependiendo del resultado de si es bisiesto o no
>>>>>>> pmd-refactor
	 */
	private boolean esBisiesto() {
		return variableA % 4 == 0 && variableA % 100 != 0 || variableA % 400 == 0;
	}

	/**
<<<<<<< HEAD
	 * Método diaSiguiente que aumenta en 1 el día
	 */
	public void diaSiguiente() {
		d++;
=======
	 * Método diaSiguiente que aumenta el dia en 1
	 */
	public void nextDay() {
		varaibleD++;
>>>>>>> pmd-refactor
		if (!fechaCorrecta()) {
			varaibleD = 1;
			variableM++;
			if (!fechaCorrecta()) {
				variableM = 1;
				variableA++;
			}
		}
	}

	/**
	 * Método toString
	 */
	public String toString() {
		String resultado = "";
		if (varaibleD < DIEZ && variableM < DIEZ) {
			resultado = "0" + varaibleD + "-0" + variableM + "-" + variableA;
		} else if (varaibleD < DIEZ && variableM >= DIEZ) {
			resultado = "0" + varaibleD + "-" + variableM + "-" + variableA;
		} else if (varaibleD >= DIEZ && variableM < DIEZ) {
			resultado = varaibleD + "-0" + variableM + "-" + variableA;
		} else {
			resultado = varaibleD + "-" + variableM + "-" + variableA;
		}
		return resultado;
	}

}
