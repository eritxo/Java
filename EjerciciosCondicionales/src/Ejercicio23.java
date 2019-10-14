import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String args[]) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer valor: ");
		a = sc.nextInt();
		System.out.print("Introduce el primer valor: ");
		b = sc.nextInt();
		if(a<b) {
			System.out.println("Los valores ordenados son: "+ a + " " + b);
		}
		else {
			System.out.println("Los valores ordenados son: "+ b + " " + a);
		}
	}
}
