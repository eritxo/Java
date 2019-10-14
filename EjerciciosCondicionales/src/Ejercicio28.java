import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		double precioHora, salario;
		int horas;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el numero de horas: ");
		horas = sc.nextInt();
		System.out.print("Introduce el precio por hora: ");
		precioHora = sc.nextDouble();
		if(horas > 38) {
			salario = 38*precioHora;
			horas = horas-38;
			salario += horas*(precioHora*1.5);
			System.out.println("El salario es: " + salario);
		}
		else {
			salario = horas * precioHora;
			System.out.println("El salario es: " + salario);
		}
	}

}
