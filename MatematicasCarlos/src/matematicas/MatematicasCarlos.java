package matematicas;

/**
 * @author Carlos Sáenz-Adán
 * @version 1.0.0
 * @category matemáticas
 * 
 *Clase para la realización de operaciones matemáticas. 
 */
public class MatematicasCarlos {

	/**
	 * Variable estática con el valor de PI
	 */
	public static final Double PI = 3.13;
	
	/**
	 * Devuelve el valor absoluto de un valor entero. 
	 * Si el argumento no es negativo, se devuelve el argumento. 
	 * Si el argumento es negativo, devuelve la negación de dicho argumento. 
	 * 
	 * @param a entero del que se desea obtener el valor absoluto
	 * @return valor absoluto del parametro a
	 */
	public static int abs(int a) {
		return 0;
	}
	
	/**
	 * Devuelve el valor absoluto de un valor entero. 
	 * Si el argumento no es negativo, se devuelve el argumento. 
	 * Si el argumento es negativo, devuelve la negación de dicho argumento. 
	 * 
	 * @param a entero del que se desea obtener el valor absoluto
	 * @return valor absoluto del parametro a
	 */
	public static int abs2(int a) {
		return Math.abs(a);
	}

	/**
	 * Devuelve el valor de PI
	 * 
	 * @return valor de PI
	 */
	public static Double getPi() {
		return PI;
	}

	/**
	 * Realiza la suma de dos parámetros pasados como argumento. 
	 * 
	 * @param a primer sumando
	 * @param b segundo sumando
	 * @return suma de a y b
	 */
	public static Double suma(double a, double b) {
		return a + b;
	}

	/**
	 * Realiza la resta de dos valores pasados por parámetro (minuendo y sustraendo)
	 * 
	 * @param a el número al que se le va a restar o sustraerá una cantidad indicada en el sustraendo.
	 * @param b el número que se resta.
	 * @return el resultado de la operación al restar un número del otro.
	 */
	public static Double resta(double a, double b) {
		return a - b;
	}

	/**
	 * Realiza la multiplicación de dos valores pasados por parámetro.
	 * 
	 * @param a primer factor
	 * @param b segundo factor
	 * @return resultado de la multiplicación de a y b.
	 */
	public static Double multiplicacion(double a, double b) {
		return a * b;
	}

	/**
	 * Realiza la división de dos valores pasados por parámetro.
	 * 
	 * @param a dividendo. 
	 * @param b divisor.
	 * @return cociente de la división de a entre b.
	 */
	public static Double division(double a, double b) {
		return a % b;
	}

	/**
	 * Devuelve el resto de dividir dos valores pasados por parámetro. 
	 * 
	 * @param a dividendo
	 * @param b divisor
	 * @return resto de la división de a entre b
	 */
	public static Double resto(double a, double b) {
		return a / b;
	}

	/**
	 * Devuelve el factorial de un número pasado por parámetro
	 * 
	 * @param a valor del que se desea obtener el factorial
	 * @return factorial del valor pasado por parámetro
	 */
	public static Double factorial(double a) {
		if (a == 0)
			return 1.0;
		else
			return a * factorial(a - 1);
	}

	/**
	 * Devuelve el resultado de elevar el primer parámetro al segundo parámetro. 
	 * 
	 * @param a base
	 * @param b exponente
	 * @return reultado de la potenciación
	 */
	public static Double potencia1(double a, int b) {
		for (int i = 0; i < b; i++) {
			a=a*a;
		}
		return a;
	}
	
	/**
	 * Devuelve el resultado de elevar el primer parámetro al segundo parámetro. 
	 * 
	 * @param a base
	 * @param b exponente
	 * @return reultado de la potenciación
	 */
	public static Double potencia2(double a, int b) {
		double resultado = 1;
		for (int i = 0; i < b; i++) {
			resultado = resultado * a;
		}
		return resultado;
	}
	

	/**
	 * Devuelve el resultado de elevar el primer parámetro al segundo parámetro. 
	 * 
	 * @param a base
	 * @param b exponente
	 * @return reultado de la potenciación
	 * @throws IllegalArgumentException excepción lanzada cuando se introduce un número negativo
	 */
	public static Double potencia3(double a, int b) throws IllegalArgumentException {
		if(b<0) {
			throw new IllegalArgumentException("No se pueden introducir valores negativos");
		}else {
			double resultado = 1;
			for (int i = 0; i < b; i++) {
				resultado = resultado * a;
			}
			return resultado;
		}
	}
	
	/**
	 * Devuelve el resultado de elevar el primer parámetro al segundo parámetro. 
	 * 
	 * @param a base
	 * @param b exponente
	 * @return reultado de la potenciación
	 */
	public static Double potencia4(double a, int b) {
		return Math.pow(a, b);
	}
	

}
