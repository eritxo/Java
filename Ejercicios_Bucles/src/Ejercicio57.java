import java.util.Scanner;

public class Ejercicio57 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int divisionNumero, divisor;
		System.out.print("Introduce un numero: ");
		int numero = sc.nextInt();
		divisor = numero - 1;
		boolean noPrimo = false;
		while(divisor > 1) {
			divisionNumero = numero%divisor;
			if(divisionNumero == 0) {
				noPrimo = true;
			}
			divisor--;
		}
		if(noPrimo == true) {
			System.out.println(numero +" no es un numero primo.");
		}
		else {
			System.out.println(numero + " es un numero primo.");
		}
	}

}
