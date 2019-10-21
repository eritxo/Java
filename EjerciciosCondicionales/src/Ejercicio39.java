import java.util.Scanner;

public class Ejercicio39 {

	public static void main(String args[]) {
		int hora, horaAngeles, horaMexico, horaLondres, horaSydney, horaMoscu, pais;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la hora actual (Solo la hora): ");
		hora = sc.nextInt();
		System.out.println("1- Hora en Los Angeles");
		System.out.println("2- Hora en Mexico DF");
		System.out.println("3- Hora en Londres");
		System.out.println("4- Hora en Sydney");
		System.out.println("5- Hora en Moscu");
		System.out.print("Introduce el pais: ");
		pais = sc.nextInt();
		if(pais == 1) {
			horaAngeles = hora-8;
			if(horaAngeles < 0){
				horaAngeles *= -1;
				System.out.println("Hora en Los Angeles " + horaAngeles + " h.");
			}
			else {
				System.out.println("Hora en Los Angeles " + horaAngeles + " h.");

			}
		}
		else if (pais == 2) {
			horaMexico = hora-6;
			if(horaMexico < 0){
				horaMexico *= -1;
				System.out.println("Hora en Mexico DF " + horaMexico + " h.");
			}
			else {
				System.out.println("Hora en Mexico DF " + horaMexico + " h.");

			}
		}
		else if (pais == 3) {
			horaLondres = hora;
			System.out.println("Hora en Londres " + horaLondres + " h.");
		}
		else if (pais == 4) {
			horaSydney = hora+10;
			if (horaSydney > 23) {
				horaSydney -= 24;
				System.out.println("Hora en Sydney " + horaSydney + " h.");
			}
			else {
				System.out.println("Hora en Sydney " + horaSydney + " h.");

			}
		}
		else if (pais == 5) {
			horaMoscu = hora+3;
			if(horaMoscu>23) {
				horaMoscu -= 24;
				System.out.println("Hora en Moscu " + horaMoscu + " h.");
			}
			else {
				System.out.println("Hora en Moscu " + horaMoscu + " h.");
			}
		}
		else {
			System.out.println("Has introducido un numero incorrecto.");
		}
	}
}
