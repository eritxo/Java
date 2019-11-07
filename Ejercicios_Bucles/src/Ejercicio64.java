import java.util.Scanner;

public class Ejercicio64 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la altura: ");
		int altura = sc.nextInt();
		System.out.print("Introduce la base: ");
		int base = sc.nextInt();
		int remember = base;
		while(altura > 0) {
			base = remember;
			System.out.print("*");
			while(base > 1) {
				System.out.print("*");
				base--;
			}
			System.out.println("");
			altura--;
		}
	}

}
