import java.util.Scanner;

public class Ejercicio71 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 1, contador = 0;
		double media, suma = 0;
		while(numero > 0) {
			System.out.print("Introduce un numero: ");
			numero = sc.nextInt();
			suma = suma+numero;
			contador++;
		}
		contador = contador -1;
		System.out.println("La suma total de los numeros es: " + suma);
		media = suma/contador;
		System.out.println("La media es: " + media);
	}

}
