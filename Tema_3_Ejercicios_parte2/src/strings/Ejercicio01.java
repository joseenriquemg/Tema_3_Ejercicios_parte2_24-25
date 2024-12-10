package strings;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		// Creamos un nuevo Scanner
		Scanner sc = new Scanner(System.in);

		// Variables para recoger las frases
		String frase1;
		String frase2;

		// Solicitamos la primera frase y la leemos del teclado.
		System.out.println("Introduzca la primera frase:");
		frase1 = sc.nextLine();

		// Solicitamos la segunda frase y la leemos del teclado.
		System.out.println("Introduzca la segunda frase:");
		frase2 = sc.nextLine();

		// Condicion para ofrecer el resultado.
		if (frase1.length() > frase2.length()) {

			System.out.println("La primera frase es mayor.");

		} else if (frase1.length() < frase2.length()) {

			System.out.println("La segunda frase es mayor.");

		} else {

			System.out.println("Ambas frases son iguales.");

		}

		// Crerramos el Scanner
		sc.close();

	}

}
