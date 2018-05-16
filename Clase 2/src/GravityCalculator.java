
public class GravityCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// '+='
		// "+=" --> Es un operando. Significa: Sumarle a la variable de la izquierda lo
		// que
		// pongamos a la derecha sin borrar lo anterior
		// '-='
		// "-=" Es un operando. Significa: Restarle a la variable de la izquierda lo que
		// pongamos a la derecha sin borrar lo anterior
		// '++' Aumenta la variabe de al lado
		// "i++;" --> aumenta "i" en 1. Entonces si i valia 9, ahora vale 10
		// '--'
		// "i--;" --> disminuye "i" en 1. Entonces si i valia 10, ahora vale 9
		// '>'
		// ">" --> No es un operando. Significa: Mayor
		// '<'
		// "<" --> No es un operando. Significa: Menor
		// '=='
		// "=="--> No es un operando. se utiliza para comparar dos valores enteros
		// '='
		// "=" --> Es un operando. Asigna un valor de derecha a izquierda
		// '<='
		// "<=" --> No es un operando. Significa: Menor o Igual
		// '>='
		// ">=" --> No es un operando. Significa: Mayor o Igual
		// '!='
		// "!=" --> No es un operando. se utiliza para preguntar si es "distinto"
		// '&&'
		// "&&" --> No es un operando. Es el "y" lógico. Concatena/Une dos condiciones
		// y para que sea verdadero ambas deben serlo
		// '||'
		// "||" --> No es un operando. Es el "O" lógico. Concatena dos condiciones
		// y para que sea verdadero por lo menos 1 verdadera
		// '%'
		// "%" --> Es un operando que calcula el resto de una división. EJ: 4%2 --> 0
		//																EJ: 5%2
		
		
		
		

		// double gravity = 0.0;
		// double initialVelocity = 0.0;
		// double fallingTime = 10.0;
		// double initialPosition = 0.0;
		// double finalPosition = 0.0;
		// System.out.println("The object's position after " + fallingTime +
		// " seconds is " + finalPosition + " m.");

		// x(t) = 0.5 x at² + Vit + Xi Formula de distancia

		double gravity = -9.81;
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.0;
		
		 finalPosition = 0.5 * gravity *(fallingTime*fallingTime)
					+(initialVelocity*fallingTime) + initialPosition;
		
		System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}















}




