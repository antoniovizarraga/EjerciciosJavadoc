package clases;

/**
 * Clase con distintas operaciones necesarias para sumar, restar, mutliplicar...
 */
public class Operaciones {

	/**
	 * El primer valor que usarán los demás métodos
	 */
	double num1;
	
	/**
	 * El segundo valor que se usará en los siguientes métodos.
	 */
	double num2;

	
	/**
	 * Constructor de la clase Operaciones vacío.
	 */
	public Operaciones() {
		
	}

	/**
	 * Constructor que toma como parámetros los números que se usarán
	 * para realizar las operaciones.
	 * @param num1 Primer valor que se usará para los cálculos.
	 * @param num2 Segundo valor que se usará para los cálculos.
	 */
	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	/**
	 * Método que realiza una suma entre dos valores y devuelve el resultado.
	 * @return Devuelve el resultado de sumar dos valores.
	 */
	public double suma() {
		return num1+num2;
	}
	
	/**
	 * Método que hace una resta entre dos valores y devuelve el resultado.
	 * @return Devuelve el resultado de restar dos valores.
	 */
	public double resta() {
		return num1-num2;
	}
	
	/**
	 * Método que multiplica dos valores y devuelve el total.
	 * @return Devuelve el resultado de multiplicar dos valores.
	 */
	public double multiplicacion() {
		return num1*num2;
	}
	
	/**
	 * Método que divide los valores y devuelve el resultado.
	 * @return Devuelve el resultado de dividir dos valores.
	 */
	public double division() {
		double res = 0;
		
		if(num2 != 0) {
			res = num1/num2;
		} 
		return res;
	}
	
	/**
	 * Método que devuelve el máximo de dos valores dados.
	 * @return Devuelve el máximo de dos valores.
	 */
	public double max() {
		return num1>num2 ? num1 : num2; 
	}
	
	/**
	 * Método que devuelve el mínimo de dos valores dados.
	 * @return Devuelve el mínimo de dos valores.
	 */
	public double min() {
		return num1<num2 ? num1 : num2; 
	}
}
