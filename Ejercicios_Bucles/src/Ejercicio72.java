import java.util.Scanner;

public class Ejercicio72 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 1, contador = 1, suma = 0;
		while(numero > 0) {
			if(contador >= 2) {
				System.out.print("Introduce un numero: ");
				numero = sc.nextInt();
				suma = suma+numero;
				contador = 1;
				System.out.println("La suma es: " + suma);
			}
			else {
				System.out.print("Introduce un numero: ");
				suma = 0;
				numero = sc.nextInt();
				suma = suma+numero;
				contador++;
			}
		}
	}

}
