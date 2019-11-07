import java.util.Scanner;

public class Ejercicio58 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int divisor;
		System.out.print("Introduce el primer numero: ");
		int a = sc.nextInt();
		System.out.print("Introduce el segundo numero: ");
		int b = sc.nextInt();
		if(a>b) {
			divisor = b;
		}
		else {
			divisor = a;
		}
		while(((a%divisor != 0) || (b%divisor != 0)) && divisor > 1) {
			divisor--;
		}
		System.out.println("El maximo comun divisor es: " + divisor);
	}

}
