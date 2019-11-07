import java.util.Scanner;

public class Ejercicio68 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = -1;
		while(numero != 0 ) {
			System.out.print("Introduce un numero: ");
			numero = sc.nextInt();
		}
		System.out.println("Final del programa.");
	}

}
