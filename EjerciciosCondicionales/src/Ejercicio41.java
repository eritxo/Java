import java.util.Scanner;

public class Ejercicio41 {

	public static void main(String[] args) {
		int year, mes;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el numero del mes: ");
		mes = sc.nextInt();
		System.out.print("Introduce el año: ");
		year = sc.nextInt();
		if((mes > 0 ) || (year > 0)) {
			if((year%4 == 0) && (year%100 !=0)) {
				if(mes == 2) {
					System.out.println("El mes "+ mes + "del año " + year + " tiene 29 dias.");
				}			
			}
			else {
				System.out.println("El mes "+ mes + "del año " + year + " tiene 28 dias.");
			}
			if((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)) {
				System.out.println("El mes "+ mes + "del año " + year + " tiene 31 dias.");
			}
			else if((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
				System.out.println("El mes "+ mes + "del año " + year + " tiene 30 dias.");
			}
		}
		else {
			System.out.println("No se puede introducir numeros negativos");
		}
	}
}
