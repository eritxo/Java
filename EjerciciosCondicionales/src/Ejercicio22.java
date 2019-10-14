import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String args[]) {
		double a, c;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el precio del articulo: ");
		a = sc.nextInt();
		System.out.print("Introduce el numero de unidades: ");
		b = sc.nextInt();
		c = a*b;
		if(c>300) {
			c = (c*1.21);
			c = c - (c*0.05);
		}
		else {
			c = (c*1.21);
		}
		System.out.print("Importe total: " + c);

	}
}
