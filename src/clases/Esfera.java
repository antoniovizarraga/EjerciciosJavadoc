package clases;

/**
 * Clase que contiene los demás métodos para escribir parámetros relacionados con la esfera.
 * @author avizarraga
 * @version 1.0
 */
public class Esfera {
	
	/**
	 * Atributo 
	 */
	double radio = 1.0;
	
	public Esfera() {
		super();
	}


	public Esfera(double radio) {
		super();
		this.radio = radio;
	}
	

	public double superficie() {
		double superficie = 4*Math.PI*Math.pow(radio, 2);		
		return superficie;
	}
	
	public double volumen() {
		double volumen = (4*Math.PI/3) * Math.pow(radio, 3);
		return volumen;
	}
}
