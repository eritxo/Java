import java.util.Scanner;

public class Ejercicio38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, primeraCifra, segundaCifra;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero entre 30 y 99: ");
		numero = sc.nextInt();
		primeraCifra = numero/10;
		segundaCifra = numero%10;
		if((numero >= 30) && (numero <=99)) {
			if(primeraCifra == 3) {
				System.out.print("Treinta ");
			}
			else if(primeraCifra == 4) {
				System.out.print("Cuarenta ");
			}
			else if(primeraCifra == 5) {
				System.out.print("Cincuenta ");
			}
			else if(primeraCifra == 6) {
				System.out.print("Sesenta ");
			}
			else if(primeraCifra == 7) {
				System.out.print("Setenta ");
			}
			else if(primeraCifra == 8) {
				System.out.print("Ochenta ");
			}
			else if(primeraCifra == 9) {
				System.out.print("Noventa  ");
			}
			if(segundaCifra == 0) {
				System.out.print("");
			}
			else if(segundaCifra == 1) {
				System.out.print("y uno.");
			}
			else if(segundaCifra == 2) {
				System.out.print("y dos.");
			}
			else if(segundaCifra == 3) {
				System.out.print("y tres.");
			}
			else if(segundaCifra == 4) {
				System.out.print("y cuatro.");
			}
			else if(segundaCifra == 5) {
				System.out.print("y cinco.");
			}
			else if(segundaCifra == 6) {
				System.out.print("y seies.");
			}
			else if(segundaCifra == 7) {
				System.out.print("y siete.");
			}
			else if(segundaCifra == 8) {
				System.out.print("y ocho.");
			}
			else if(segundaCifra == 9) {
				System.out.print("y nueve.");
			}
		}
		else {
			System.out.println("Numero fuera de rango");
		}
		
	}

}
