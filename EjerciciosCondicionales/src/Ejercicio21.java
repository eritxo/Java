import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String args[]) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce numero: ");
		a = sc.nextInt();
		if(a < 0) {
			System.out.println(a + " es negativo");
		}
		else if( a > 0) {
			System.out.println(a + " es positivo");
		}
		else {
			System.out.println("El numero es 0");
		}
	}
}
