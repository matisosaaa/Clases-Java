package clase4;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Vamos a usar programación orientada a objetos cuando los proyectos sean
		// largos
		// La porgramacion estructurada es mas complicada de leer

		// La diferencia entre do while y while es que do while hace que
		// entre por lo menos una vez, si no cumple con la condición se va,
		// mientras que while, directamente reconoce y no lo hace entrar

		// Variables primitivas; Int;Char;Float

		int num = 0;
		String pal;
		double com;

		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		
		num = sc.nextInt();
		System.out.print("Ingrese String");
		pal = sc1.nextLine();
		System.out.print("Ingrese Double");
		com = sc2.nextDouble();

		Scanner sn = new Scanner(System.in);

		String con;

		con = sn.nextLine();

		if (con.equalsIgnoreCase("S")) {

			System.out.println("Ingresó S!");

		}

		else

			System.out.print("Ingresó N!");

	}

}
