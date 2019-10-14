import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String args[]) {
		int a, b, c, d;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer valor: ");
		a = sc.nextInt();
		System.out.print("Introduce el segundo valor: ");
		b = sc.nextInt();
		c = a%b;
		d = b%a;
		if(c == 0) {
			System.out.println(a + " es divisible por " + b);
		}
		else if(d == 0) {
			System.out.println(b + " es divisible por " + a);
		}
		else {
			System.out.println("No son divisibles");
		}
	}
}
