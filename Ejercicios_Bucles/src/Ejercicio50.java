import java.util.Scanner;

public class Ejercicio50 {

	public static void main(String[] args) {
		int a=0, b=0, operacion;
		Scanner sc = new Scanner(System.in);
		while(a < 1 || a > 10) {
			System.out.print("Introduce la tabla que quieres ver: ");
			a = sc.nextInt();
		}
		System.out.println("Tabla de multiplicar del numero " + " " + a);
		while(b < 11) {
			operacion = b*a;
			System.out.println(b + " * " + a +" = " + operacion);
			b++;
		}
	}

}
