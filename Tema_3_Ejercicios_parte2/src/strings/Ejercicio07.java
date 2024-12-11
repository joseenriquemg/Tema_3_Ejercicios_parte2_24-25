package strings;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		// Creamos la variable para recoger la frase.
		String frase;
		
		// Creamos la variable para recoger la palabra.
		String palabra;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario que introduzca la frase.
		System.out.println("Introduzca las frases que deseas contar los espacios:");

		// Leemos la frase del teclado.
		frase = sc.nextLine();

		// Solicitamos al usuario que introduzca la frase.
		System.out.println("Introduzca la palabra que deseas contar en la frase:");

		// Leemos la frase del teclado.
		palabra = sc.nextLine();

		// Ofrecemos el resultado al usuario.
		System.out.println();

		System.out.println(cuentaPalabra(frase, palabra));

		// Cerramos el Scanner.
		sc.close();

	}

	static String cuentaPalabra(String frase, String palabra) {

		int cuentaPalabra = 0;

		String palabraSeparada = "";

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == ' ') {

				System.out.println("   ");

			} else {
				
				palabraSeparada += frase.charAt(i);
				
			}
			
			

		}

		return palabraSeparada;

	}

}
