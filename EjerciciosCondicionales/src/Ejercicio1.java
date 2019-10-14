import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String args[]) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		a=sc.nextInt();
		if(a>10){
			System.out.println("El numero " +a+ " es mayor que 10");
		}
		else if(a<10) {
			System.out.println("El numero " +a+ " es menor que 10");

		}
		else {
			System.out.println("El numero " +a+ " es igual a 10");
		}
	}
}
