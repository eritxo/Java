import java.util.Scanner;

public class Ejercicio65 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int divisionNumero, divisor, totalPrimos = 0;
		int numero = 1;
		while(numero < 1000) {
			boolean noPrimo = false;
			divisor = numero - 1;
			while(divisor > 1) {
				divisionNumero = numero%divisor;
				if(divisionNumero == 0) {
					noPrimo = true;
				}
				divisor--;
			}
			if(noPrimo != true) {
				System.out.println(numero + " es un numero primo.");
				totalPrimos++;
			}
			numero++;
		}
		System.out.println("Se han encontrado "+totalPrimos+" numeros primos.");
	}

}
