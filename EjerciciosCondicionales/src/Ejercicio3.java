import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String args[]) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer numero: ");
		a = sc.nextInt();
		System.out.print("Introduce el segundo numero: ");
		b = sc.nextInt();
		if(a<b) {
			System.out.println(a+" es mas grande que "+b);
		}
		else {
			System.out.println(b+" es mas grande que "+a);
		}
	}
}
