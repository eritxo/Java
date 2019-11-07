import java.util.Scanner;

public class Ejercicio55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dividendo, divisor;
		System.out.print("Introduce un numero entero positivo: ");
		dividendo = sc.nextInt();
		while((dividendo < 0) && ((dividendo%2) != 0)) {
			System.out.print("Introduce un numero entero positivo: ");
			dividendo = sc.nextInt();
		}
		divisor = 1;
		System.out.print("Sus divisores son:");
		while(divisor <= dividendo) {
			if((dividendo%divisor) == 0) {
				System.out.print(" "+ divisor);
			}
			divisor++;
		}
	}

}
