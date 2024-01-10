package clases;

/**
 * Clase que contiene los demás métodos para escribir parámetros relacionados con la esfera.
 * @author avizarraga
 * @version 1.0
 */
public class Esfera {
	
	/**
	 * Atributo que controla el radio de la esfera.
	 */
	double radio = 1.0;
	
	/**
	 * Constructor de la esfera sin parámetros
	 */
	public Esfera() {
		super();
	}


	/**
	 * Constructor de la esfera incluyendo parámetros
	 * @param radio define el radio de la esfera
	 */
	public Esfera(double radio) {
		super();
		this.radio = radio;
	}
	
/**
 * Es un método que calcula la superficie de la esfera y la devuelve.
 * @return Devuelve la superficie. 
 */
	public double superficie() {
		double superficie = 4*Math.PI*Math.pow(radio, 2);		
		return superficie;
	}
	
	/**
	 * Método que calcula el volumen de la esfera y lo devuelve.
	 * @return Devuelve el volumen de la esfera.
	 */
	public double volumen() {
		double volumen = (4*Math.PI/3) * Math.pow(radio, 3);
		return volumen;
	}
}
