import java.util.Scanner;

public class Ejercicio42 {

	public static void main(String[] args) {
		int year, mes, dia;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el numero del dia: ");
		dia = sc.nextInt();
		System.out.print("Introduce el numero del mes: ");
		mes = sc.nextInt();
		System.out.print("Introduce el año: ");
		year = sc.nextInt();
		if((mes <= 12 ) || (year > 0) || (dia > 0)) {
			if(((year%4 == 0) && (year%100 !=0)) || ((year%4 == 0) && (year%400 ==0))) {
				if((mes == 2) && (dia <= 29)) {
					System.out.println("Fecha valida");
				}
				else if(((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)) && (dia <= 31)) {
					System.out.println("Fecha valida");
				}
				else if(((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11))  && (dia <= 30)) {
					System.out.println("Fecha valida");
				}
				else {
					System.out.println("Fecha no valida");
				}
			}
			else if ((mes <=12) && (dia <=31)){
				if((mes == 2) && (dia <= 28)) {
					System.out.println("Fecha valida");
				}
				else if(((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)) && (dia <= 31)) {
					System.out.println("Fecha valida");
				}
				else if(((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11))  && (dia <= 30)) {
					System.out.println("Fecha valida");
				}
				else {
					System.out.println("Fecha no valida");
				}
			}
			else {
				System.out.println("Fecha no valida");
			}
		}
		else {
			System.out.println("No se puede introducir numeros negativos");
		}
	}

}
