import java.util.Scanner;

public class Ejercicio53 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, factorial = 1;
		System.out.print("Introduce un numero: ");
		a = sc.nextInt();
		while((a < 0) || (a > 13)) {
			System.out.print("Introduce un numero: ");
			a = sc.nextInt();
		}
		System.out.print("El factorial de "+ a);
		while(a > 0) {
			factorial = a * factorial;
			a--;
		}
		System.out.print(" es: "+ factorial);
	}

}
