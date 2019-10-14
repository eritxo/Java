import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String args[]) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer numero: ");
		a = sc.nextInt();
		System.out.print("Introduce el segundo numero: ");
		b = sc.nextInt();
		System.out.print("Introduce el tercer numero: ");
		c = sc.nextInt();
		if((a > b) && (a > c)) {
			System.out.print(a);
			if (b >c) {
				System.out.print(" " + b + " " + c);
			}
			else if(c > b) {
				System.out.print(" " + c + " " + b);
			}
			else if(b == c) {
				System.out.print(" " + c + " " + b);
			}
		}
		else if((b > a) && (b > c)) {
			System.out.print(b);
			if (a >c) {
				System.out.print(" " + a + " " + c);
			}
			else if(c > a) {
				System.out.print(" " + c + " " + a);
			}
			else if(a == c) {
				System.out.print(" " + c + " " + a);
			}
		}
		else if((c > a) && (c > b)) {
			System.out.print(c);
			if (a > b) {
				System.out.print(" " + a + " " + b);
			}
			else if(b > a) {
				System.out.print(" " + b + " " + a);
			}
			else if(a == b) {
				System.out.print(" " + b + " " + a);
			}
		}
		else {
			System.out.print(a + " " + b + " " + c);
		}
	}
}
