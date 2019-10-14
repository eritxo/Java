import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String args[]) {
		double nota; 
		int edad, carnet;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la nota : ");
		nota = sc.nextDouble();
		System.out.print("Introduce la edad: ");
		edad = sc.nextInt();
		System.out.print("Introduce la variable carnet: ");
		carnet = sc.nextInt();
		if(((nota >= 5) && (edad >= 18)) && (carnet == 1)) {
			System.out.println("ACEPTADO");
		}
		else if(carnet == 2) {
			System.out.println("POSIBLE");
		}
	}
}
