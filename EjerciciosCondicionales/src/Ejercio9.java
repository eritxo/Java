import java.util.Scanner;

public class Ejercio9 {

	public static void main(String args[]) {
		int salarioMensual, pagas, salarioAnual;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el salario: ");
		salarioMensual = sc.nextInt();
		System.out.print("Introduce el numero de pagas: ");
		pagas = sc.nextInt();
		salarioAnual = (salarioMensual*pagas);
		if(salarioAnual < 1000000) {
			System.out.println("Porcentaje de impuestos a pagar: 5%");
		}
		else if((salarioAnual >= 1000000) && (salarioAnual <= 2500000) ) {
			System.out.println("Porcentaje de impuestos a pagar: 12%");
		}
		else if((salarioAnual >= 2500001) && (salarioAnual <= 3800000) ) {
			System.out.println("Porcentaje de impuestos a pagar: 15%");
		}
		else if((salarioAnual >= 3800001) && (salarioAnual <= 6000000) ) {
			System.out.println("Porcentaje de impuestos a pagar: 22%");
		}
		if(salarioAnual > 6000000) {
			System.out.println("Porcentaje de impuestos a pagar: 30%");
		}
	}
}
