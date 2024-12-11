package strings;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Variable para recoger la farse del usuario.
		String fraseUsuario;

		// Creamos un nuevo Scanner.
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usaurio la frase a invertir.
		System.out.println("Introduzca la frase que desea invertir:");

		// Leemos la frase del teclado.
		fraseUsuario = sc.nextLine();

		// Ofrecemos el resultado al usuario.
		System.out.println(invierteFrase(fraseUsuario));

	}

	/**
	 * Funcion para invertir la frase.
	 * 
	 * @param fraseOrdenada Recibe la farse del usaurio.
	 * @return Devuelve la farse invertida.
	 */
	static String invierteFrase(String fraseOrdenada) {

		// Variable ara recopger la frase desordenada.
		String fraseDesordenada = "";

		// Bucle para recorrer la tabla del final al inicio.
		for (int i = fraseOrdenada.length() - 1; i >= 0; i--) {

			// Aplicamos los cvalores a la nueva frase.
			fraseDesordenada += fraseOrdenada.charAt(i);

		}

		// Devolvemos la nueva frase invertida.
		return fraseDesordenada;

	}

}
