import java.util.Scanner;

public class men�s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//el switch no evalua rango solo casos concretos
		//default--> este es un caso que se va a ejecutar cuando el dato ingresado no este contemplado. Es opcioal en la estructura osea puede no estar
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
	int	num1;
	int	num2;
		
	
	System.out.println("Igrese la opci�n que desee");
	
	System.out.println("1) Suma");
	System.out.println("2) Resta");	
	System.out.println("3) Multiplicaci�n");	
	System.out.println("4) Divisi�n");
	
	System.out.println("Ingrese el primer numero");	
	num1 = sc.nextInt();
	System.out.println("Ingrese el segundo numero: ");
	num2=sc2.nextInt();
	
	
	
	}

}
