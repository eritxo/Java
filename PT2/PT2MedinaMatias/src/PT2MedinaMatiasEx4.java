import java.util.Scanner;

public class PT2MedinaMatiasEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, contador = 1, contadorF = 0, bucle;
		double factorial = 1, dividendo, e = 0, sumaFactorial = 0;
		System.out.print("Introduce el valor de x: ");
		x = sc.nextInt();
		System.out.print("Introduce el valor de y: ");
		y = sc.nextInt();
		bucle = y;
		dividendo = x;
		e = e + 1 +(dividendo/factorial);
		while(bucle > contador) {
			y = bucle-1;
			while(y > 0) {
				factorial = y * factorial;
				y--;
			}
			dividendo = dividendo*dividendo;
			e = e + (dividendo/factorial);
			contador++;
		}
		System.out.println("Dividendo: " + e);
		System.out.println("Factorial: " + factorial);

	}

}
