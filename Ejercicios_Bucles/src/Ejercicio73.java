import java.util.Scanner;

public class Ejercicio73 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0, contador = 0, contador2 = 0, contador3= 0;
		while(numero >= 0) {
			System.out.print("Introduce un numero: ");
			numero = sc.nextInt();
			if((numero >= 5) && (numero <= 10)) {
				contador++;
			}
			else if((numero >= 11) && (numero <= 15)) {
				contador2++;
			}
			else {
				contador3++;
			}
		}
		System.out.println("Hay " + contador + " numeros entre 5 y 10");
		System.out.println("Hay " + contador2 + " numeros entre 11 y 15");
		System.out.println("Hay " + contador3 + " numeros fuera de los rangos");
	}

}
