import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String args[]) {
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer numero: ");
		a = sc.nextDouble();
		System.out.print("Introduce el segundo numero: ");
		b = sc.nextDouble();
		c = a+b;
		if(c > 0) {
			System.out.println("El numero " +c+ " es positivo.");
		}
		else if(c ==0 ) {
			System.out.println("El numero es cero.");
		}
		else {
			System.out.println("El numero " +c+ " es negativo.");
		}
	}
}
