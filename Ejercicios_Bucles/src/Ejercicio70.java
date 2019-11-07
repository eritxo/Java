import java.util.Scanner;

public class Ejercicio70 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0, contador = 0;
		while(numero >= 0) {
			System.out.print("Introduce un numero: ");
			numero = sc.nextInt();
			contador++;
		}
		System.out.println("Se han introducido " +contador + " numeros.");
	}

}
