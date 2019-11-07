import java.util.Scanner;

public class Ejercicio69 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 101;
		while(numero > 100) {
			System.out.print("Introduce un numero: ");
			numero = sc.nextInt();
		}
		System.out.println("Final del programa.");

	}

}
