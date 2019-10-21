import java.util.Scanner;

public class Ejercicio34 {

	public static void main(String[] args) {
		int dia, mes, year, diaNacimiento, mesNacimiento, yearNacimiento, diferenciaYear;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la fecha actual: ");
		System.out.print("Introduce el dia: ");
		dia = sc.nextInt();
		System.out.print("Introduce el mes: ");
		mes = sc.nextInt();
		System.out.print("Introduce el año: ");
		year = sc.nextInt();
		System.out.println("Introduce la fecha de ancimiento: ");
		System.out.print("Introduce el dia: ");
		diaNacimiento = sc.nextInt();
		System.out.print("Introduce el mes: ");
		mesNacimiento = sc.nextInt();
		System.out.print("Introduce el año: ");
		yearNacimiento = sc.nextInt();
		diferenciaYear = year - yearNacimiento;
		if(((dia > 0) && (mes > 0) && (year > 0)) && ((diaNacimiento > 0 ) && (mesNacimiento > 0) && (yearNacimiento > 0))) {
			if(((dia <= 31) && (mes <= 12)) && ((diaNacimiento <= 31) && (mesNacimiento <= 12))) {
				if((diferenciaYear > 18)) {
					System.out.println("Eres mayor de edad.");
				}
				else if((diferenciaYear >= 18) && (mesNacimiento <= mes)) {
					if((mesNacimiento < mes)) {
						System.out.println("Eres mayor de edad.");
					}
					else if((mesNacimiento == mes) && (diaNacimiento < dia)) {
						System.out.println("Eres mayor de edad.");
					}			
					else if((mesNacimiento == mes) && (diaNacimiento == dia)) {
						System.out.println("Hoy cumples 18.");
					}
					else {
						System.out.println("No eres mayor de edad.");

					}
				}
				else {
					System.out.println("No eres mayor de edad.");

				}
			}
			else {
				System.out.println("Formato de fecha introducido incorrecto");
			}
		}
		else {
			System.out.println("Formato de fecha introducido incorrecto");
		}

	}

}
