package strings;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Variable para recoger las palabras.
		String palabras = "";

		// Variable para recoger la frase.
		String frase = "";

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// solicitamos la palabra al usaurio.
		System.out.println("Agregue una palabra ( \" fin \" para salir )");

		// Leemos del teclado.
		palabras = sc.nextLine();

		// Bucle while para ir pidiendo palabras.
		while (!palabras.equalsIgnoreCase("fin")) {

			// Añadimos la palabras a la frase.
			frase += palabras + " ";

			// solicitamos la palabra al usaurio.
			System.out.println("Agregue otra palabra a su frase( \" fin \" para salir )");

			// Leemos del teclado.
			palabras = sc.nextLine();

			// Cerramos el Scanner.
			sc.close();

		}

		// Salto de linea.
		System.out.println();

		// Ofrecemos el resultado al usuario.
		System.out.println("Su frase es la siguiente:");
		System.out.println(frase);

	}

}
