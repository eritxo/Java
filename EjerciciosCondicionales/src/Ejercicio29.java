import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
		int numero, cifras=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el numero: ");
		numero = sc.nextInt();
		if((numero >= 0) && (numero <= 9999)) {
			while(numero > 0) {
				numero = numero/10;
				cifras++;
			}
			System.out.println("El numero de cifras es: " + cifras);

		}
		else {
			System.out.println("Numero fuera de rango.");
		}
	}

}
