import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String args[]) {
		double a, b, c, d, e, media;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer numero: ");
		a = sc.nextDouble();
		System.out.print("Introduce el segundo numero: ");
		b = sc.nextDouble();
		System.out.print("Introduce el tercer numero: ");
		c = sc.nextDouble();
		System.out.print("Introduce el cuarto numero: ");
		d = sc.nextDouble();
		System.out.print("Introduce el quinto numero: ");
		e = sc.nextDouble();
		media = (a+b+c+d+e)/5;
		System.out.println("La media es: "+ media);
		if(a>media) {
			System.out.println(a);
		}
		if(b>media) {
			System.out.println(b);
		}
		if(c>media) {
			System.out.println(c);
		}
		if(d>media) {
			System.out.println(d);
		}
		if(e>media) {
			System.out.println(e);
		}
	}
}
