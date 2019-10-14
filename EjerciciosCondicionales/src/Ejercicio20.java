import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String args[]) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce numero: ");
		a = sc.nextInt();
		if(a < 0) {
			System.out.println(a + " no es mayor que 0");
		}
		else {
			System.out.println(a + " es mayor que 0");

		}
	}
}
