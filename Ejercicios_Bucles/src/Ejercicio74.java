import java.util.Scanner;

public class Ejercicio74 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, min, max;
		System.out.print("Introduce el primer numero: ");
		a = sc.nextInt();
		System.out.print("Introduce el primer numero: ");
		b = sc.nextInt();
		if(a > b) {
			max = a;
			min = b;
		}
		else {
			max = b;
			min = a;
		}
		while((max-1) > min) {
			min++;
			System.out.println(min);
		}

	}

}
