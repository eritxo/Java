import java.util.Scanner;

public class Ejercicio35 {

	public static void main(String args[]) {
		double ladoA, ladoB, ladoC;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el lado A: ");
		ladoA = sc.nextDouble();
		System.out.print("Introduce el lado B: ");
		ladoB = sc.nextDouble();
		System.out.print("Introduce el lado C: ");
		ladoC = sc.nextDouble();
		if(ladoA == ladoB) {
			System.out.println("Es un triangulo isosceles");
		}
		else if(ladoB == ladoC) {
			System.out.println("Es un triangulo isosceles");
		}
		else if(ladoC == ladoA) {
			System.out.println("Es un triangulo isosceles");
		}
		else {
			System.out.println("No es un triangulo isosceles");
		}
	}
}
