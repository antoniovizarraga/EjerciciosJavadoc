package clases;

import java.util.Random;

/**
 * Clase que generará números aleatorios dependiendo de la función que se ejecute
 * y los parámetros que se manden.
 * @author avizarraga
 * @version 1.0
 */

public class Aleatorios {

	/**
	 * Método que tras pasarle el parámetro llamado: "Cantidad",
	 * imprimirá por pantalla una serie de números aleatorios.
	 * Lo imprimirá tantas veces como tenga el parámetro:
	 * "Cantidad".
	 * @param cantidad
	 */
	public static void numerosAletorios(int cantidad) {
		double aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = Math.random();
			System.out.println(aleatorio);
		}
	}

	/**
	 * Método que generará una cantidad de números aleatorios teniendo un
	 * valor como límite. La cantidad de números aleatorios a generar
	 * queda definido en el parámetro: "Cantidad". El límite del cual
	 * los números aleatorios no pueden sobrepasarse será el
	 * parámetro: "max".
	 * @param cantidad
	 * @param max
	 */
	public static void numerosAleatorios(int cantidad, int max) {
		int aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = (int) Math.random() * max;
			System.out.println(aleatorio);
		}
	}
	
	/**
	 * Método que generará una serie de números aleatorios y los imprimirá
	 * por pantalla. La cantidad de números aleatorios a generar dependerá
	 * del valor que tenga el parámetro: "cantidad", mientras que el valor
	 * mínimo y máximo de los valores generados se definirán en los
	 * parámetros: "minimo" y: "maximo".
	 * @param cantidad
	 * @param minimo
	 * @param maximo
	 */

	public static void numerosAleatorios(int cantidad, int minimo, int maximo) {
		int aleatorio;
		Random rand = new Random();
		for(int i=1; i<=cantidad; i++) {
			aleatorio = rand.nextInt(minimo, maximo+1);
			System.out.println(aleatorio);
		}
	}
}
