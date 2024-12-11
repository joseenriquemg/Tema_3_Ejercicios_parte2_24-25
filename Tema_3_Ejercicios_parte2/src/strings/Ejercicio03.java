package strings;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Creamos la variable para recoger la frase.
		String frase;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario que introduzca la frase.
		System.out.println("Introduzca las frases que deseas contar los espacios:");

		// Leemos la frase del teclado.
		frase = sc.nextLine();

		// Ofrecemos el resultado al usuario.
		System.out.println("Su frase tiene " + cuentaEspacios(frase) + " espacios.");

		// Cerramos el Scanner.
		sc.close();

	}

	/**
	 * Funcion encargada de contar los espacios de una frase.
	 * 
	 * @param frase Recibe la frase del usuario.
	 * @return Devuele el numero de espacios que hay en la frase.
	 */
	static int cuentaEspacios(String frase) {

		// Contador de espacios.
		int espacios = 0;

		// Bucle for para recorrer la tabla.
		for (int i = 0; i < frase.length(); i++) {

			// Condicion para detectar un espacio.
			if (frase.charAt(i) == ' ') {

				// Aumentamos el contador de espacios.
				espacios++;

			}

		}

		// Devolvemos el numero de espacios.
		return espacios;

	}

}
