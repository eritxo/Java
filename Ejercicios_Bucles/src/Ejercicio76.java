import java.util.Scanner;

public class Ejercicio76 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, min = 999999999;
		System.out.print("Introduce las veces: ");
		a = sc.nextInt();
		while(a > 0) {
			System.out.print("Introduce un numero: ");
			b = sc.nextInt();
			if(b < min) {
				min = b;
			}
			a--;
		}
		System.out.println("El menor de los numeros es: " + min);
	}

}
