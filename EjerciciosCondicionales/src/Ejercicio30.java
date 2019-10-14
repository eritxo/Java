import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {
		int cantidad;
		double precioUnidad, precioTotal;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el precio de DVD: ");
		precioUnidad = sc.nextDouble();
		System.out.print("Introduce la cantidad de DVD: ");
		cantidad = sc.nextInt();
		if(cantidad < 10) {
			precioTotal = cantidad*precioUnidad;
			System.out.println("Sin descuento");
			System.out.println("El precio total es: " + precioTotal);
		}
		else if((cantidad >= 10) && (cantidad <= 24)) {
			precioUnidad = precioUnidad - (precioUnidad *0.05);
			precioTotal = cantidad*precioUnidad;
			System.out.println("Descuento del 5%");
			System.out.println("El precio total es: " + precioTotal);
		}
		else if((cantidad >= 25) && (cantidad <= 99)) {
			precioUnidad = precioUnidad - (precioUnidad *0.10);
			precioTotal = cantidad*precioUnidad;
			System.out.println("Descuento del 10%");
			System.out.println("El precio total es: " + precioTotal);
		}
		else if((cantidad >= 100)) {
			precioUnidad = precioUnidad - (precioUnidad *0.15);
			precioTotal = cantidad*precioUnidad;
			System.out.println("Descuento del 15%");
			System.out.println("El precio total es: " + precioTotal);
		}
	}

}
