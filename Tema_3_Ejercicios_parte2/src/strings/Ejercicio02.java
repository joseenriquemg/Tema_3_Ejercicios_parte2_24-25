package strings;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String frase1;

		String frase2;

		boolean esCorrecto = true;

		// Solicitamos la contraseña a adivinar.
		System.out.println("Jugador 1, introduzca la contraseña:");
		frase1 = sc.nextLine();

		do {

			// Solicitamos la contraseña que desea probar el jugador 2.
			System.out.println("Jugador 2, ¿Cual crees que es la contraseña?");
			frase2 = sc.nextLine();

			if (frase1.equals(frase2)) {

				esCorrecto = false;

			}

			for (int i = 0; i < frase1.length(); i++) {

				if (i >= frase2.length()) {

					System.out.print('*');

				} else if (frase1.toUpperCase().charAt(i) == frase2.toUpperCase().charAt(i)) {

					System.out.print(frase1.charAt(i));

				} else {

					System.out.print('*');

				}

			}
			System.out.println();

		} while (esCorrecto);

		System.out.println("Enhorabuena jugador 2. Acertaste!");

	}

}
