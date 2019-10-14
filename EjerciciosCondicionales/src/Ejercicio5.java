import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String args[]) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer numero: ");
		a = sc.nextInt();
		System.out.print("Introduce el segundo numero: ");
		b = sc.nextInt();
		if((a > 0) && ((b > 0) ||(a>0))) {
			System.out.println("OK");
		}
		else {
			System.out.println("NO");
		}
		
	}
}
