package clase6;

import java.util.Scanner;

public class clase6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// un vector es un avariable tipo objeto
		// Variables tipo objeto --> Metodos asociados
		// Variables primitivas --> No tiene metodos asociados

		double[] var = new double[3];
		// var[0] = 9;
		double prom = 0;
		Scanner sc = new Scanner(System.in);

		// Esta es la forma de cargar un vector
		int suma = 0;
		for (int i = 0; i < var.length; i++) {

			System.out.println("Ingresá la nota");

			var[i] = sc.nextInt();
			prom += (var[i]) / (var.length);

		}
		System.out.println("El promedio es " + prom);
//		System.out.println(var.length);

		// Esta es la forma de mostrar un vector

		for (int k = 0; k < var.length; k++) {

			System.out.print(var[k] + " ");

		}

	}// Aca termina el main

}// Aca termina la clase
