import java.util.Scanner;

public class Ejercicio51 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base, exponente, resultado=1, c=0;
		System.out.print("Introduce la base: ");
		base = sc.nextInt();
		System.out.print("Introduce el exponente: ");
		exponente = sc.nextInt();
		while(c < exponente) {
			resultado = resultado*base;
			c++;
		}
		System.out.println("El resultado es: " + resultado);
	}

}
