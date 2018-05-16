package clase6;

import java.util.Scanner;

public class ejericioPorAlfajor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese cualquier palabra");

		String palab;
		int Carac;

		Scanner sc = new Scanner(System.in);

		palab = sc.nextLine();

		Carac = palab.length();

		System.out.println("La palabra " + palab);

		System.out.print(" Tiene " + Carac + " Caracteres");

		System.out.println(" Reingrese la palabra");

		char c = sc.next().charAt(Carac / 2);

		System.out.println("El caracter del medio es " + c);

	}

}
