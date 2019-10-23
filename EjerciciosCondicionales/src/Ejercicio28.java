import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		double precioHora, salario, precioextra;
		int horas;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el numero de horas: ");
		horas = sc.nextInt();
		System.out.print("Introduce el precio por hora: ");
		precioHora = sc.nextDouble();
		if((horas > 0) && (precioHora >0)) {
			if(horas > 38) {
				precioextra = precioHora*1.5;
				salario = 38*precioHora;
				horas = horas-38;
				salario += horas*precioextra;
				System.out.println("El salario es: " + salario);
			}
			else {
				salario = horas * precioHora;
				System.out.println("El salario es: " + salario);
			}
		}
		else {
			System.out.println("No se puede introducir numeros negativos");
		}
	}

}
