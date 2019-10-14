import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String args[]) {
		int a, b, max, min;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer valor: ");
		a = sc.nextInt();
		System.out.print("Introduce el segundo valor: ");
		b = sc.nextInt();
		if(a > b) {
			max = a;
			min = b;
		}
		else {
			max = b;
			min = a;

		}
		if(min != 0) {
			if ((max%min) == 0) {
				System.out.println(max + " es divisible por " + min);
			}
			else {
				System.out.println("No son divisibles");
			}
		}
		else {
			System.out.println("No se puede dividir por 0");
		}
		
	}
}
