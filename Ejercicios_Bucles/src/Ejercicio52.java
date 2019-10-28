import java.util.Scanner;

public class Ejercicio52 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dividendo, divisor, cociente=0, resto=1, contador;
		System.out.print("Introduce el valor de dividendo: ");
		dividendo = sc.nextInt();
		System.out.print("Introduce el valor de divisor: ");
		divisor = sc.nextInt();
		while(dividendo >= divisor) {
			dividendo = dividendo - divisor;
			cociente++;
			resto = dividendo;
		}
		System.out.println("El resutado es: " + cociente);
		System.out.println("El resto es: " + resto);
	}
}
