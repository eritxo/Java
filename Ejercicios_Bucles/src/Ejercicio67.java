import java.util.Scanner;

public class Ejercicio67 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int numero = sc.nextInt();
		int raizDigital= 0, longitud = 0,remember = numero,
				divisor = 1, primeraCifra, segundaCifra;
		while(remember > 0) {
			remember = remember/10;
			longitud++;
		}
		while(longitud > 1) {
			divisor = divisor*10;
			longitud--;
		}
		while(numero > 0) {
			primeraCifra = numero/divisor;
			numero = numero%divisor;
			raizDigital = primeraCifra+raizDigital;
			divisor = divisor/10;
		}
		if(raizDigital >= 10) {
			primeraCifra = raizDigital /10;
			segundaCifra = raizDigital%10;
			raizDigital = primeraCifra + segundaCifra;
		}
		System.out.println("La raiz digital es: " + raizDigital);
	}
}
