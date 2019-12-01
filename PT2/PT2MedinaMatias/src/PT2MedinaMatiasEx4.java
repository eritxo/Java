import java.util.Scanner;

public class PT2MedinaMatiasEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		double divisor, dividendo, contador, e, raizN;
		System.out.print("Introduce el valor de x: ");
		x = sc.nextInt();
		System.out.print("Introduce el valor de y: ");
		y = sc.nextInt();
		e = x*1.0;
		e = 1 + (e/1);
		while(y > 1) {
			dividendo = x;
			divisor = 1;
			contador = 1;
			while(contador < y) {
				divisor = divisor*(contador+1);
				contador++;
			}
			while(contador > 1) {
				dividendo = dividendo*x;
				--contador;
			}
			e = e + (dividendo/divisor);
			y--;
		}
		raizN = x*1.0;
		e = Math.pow(e, 1/raizN);
		System.out.println("E: " + e);
	}

}
