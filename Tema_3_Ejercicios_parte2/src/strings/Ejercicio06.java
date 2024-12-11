package strings;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		// Variable para recoger la frase del usuario
		String frase = "";

		// Frase en minusculas y sin espacios
		String fraseSinEspacios = frase.toLowerCase().replace(" ", "");

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario que introduzca la frase.
		System.out.println("Introduzca la frase que desea saber si es palindroma:");

		// Leemos la frase del teclado.
		frase = sc.nextLine();

		fraseSinEspacios = frase.toLowerCase().replace(" ", "");

		// Ofrecemos el resultado al usuario.
		System.out.println(palindroma(fraseSinEspacios, invierteFrase(fraseSinEspacios)));

		// Cerramos el Scanner.
		sc.close();

	}

	static String invierteFrase(String fraseOrdenada) {

		// Variable ara recoger la frase desordenada.
		String fraseDesordenada = "";

		// Bucle para recorrer la tabla del final al inicio.
		for (int i = fraseOrdenada.length() - 1; i >= 0; i--) {

			// Aplicamos los valores a la nueva frase.
			fraseDesordenada += fraseOrdenada.charAt(i);

		}

		// Devolvemos la nueva frase invertida.
		return fraseDesordenada;

	}

	static boolean palindroma(String fraseSinEspacios, String fraseDesordenada) {

		// Variable booleana inicializda a false.
		boolean esPalindroma = false;

		// Condicion para ver si es palindroma.
		if (fraseSinEspacios.equals(fraseDesordenada)) {

			// Cambiamos a true.
			esPalindroma = true;

		}

		// Devolvemos si es palindroma.
		return esPalindroma;

	}

}
