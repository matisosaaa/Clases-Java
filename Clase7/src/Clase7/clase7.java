package Clase7;

import java.util.Random;

public class clase7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] var = new int[10];

		cargoVector(var);

		ordenoVector(var);

		imprimoVector(var);

		// primero cargo el vector automagicamente

		// System.out.println(" ");
		// System.out.println("Mi vector esta cargado con: ");
		//
		// // imprimo vector
		// for (int i = 0; i < var.length; i++) {
		//
		// System.out.print(var[i] + " ");
		// }
	}// aca termina el metodo main

	public static void cargoVector(int[] var) {

		int i = 0;

		do {
			Random aleatorio = new Random(System.currentTimeMillis());
			// Producir nuevo int aleatorio entre 0 y 99
			int intAleatorio = aleatorio.nextInt(100);

			// Refrescar datos aleatorios
			// aleatorio.setSeed(System.currentTimeMillis());

			try {
				Thread.sleep(5);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}

			var[i] = intAleatorio;

			i++;
			System.out.print(intAleatorio + " ");

		} while (i < 10);

	}// aca termina el metodo cargovector

	public static void ordenoVector(int[] var) {

		int valorMasGrande = 0;
		int valorMasChico = 0;

		int c = 0;
		for (int i = 0; i < var.length; i++) {

			if ((var[i] - var[c]) < 0) {
				valorMasGrande = var[i];
				valorMasChico = var[c];

			}
			var[i] = valorMasChico;
			c++;
			if (c == 100) {
				c--;
			}
		}
	}// Aca termina el metodo ordenoVector

	public static void imprimoVector(int[] var) {

		System.out.println(" ");

		for (int k = 0; k < var.length; k++) {

			System.out.print(var[k] + " ");

		}

	}// Aca termina el metodo imrimoVector

}// aca termina la clase
