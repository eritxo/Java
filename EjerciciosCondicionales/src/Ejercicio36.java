import java.util.Scanner;

public class Ejercicio36 {

	public static void main(String args[]) {
		double base, lado, altura, radio, resultado;
		int operacion;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero correspondiente: ");
		System.out.println("1- Cuadrado");
		System.out.println("2- Triangulo");
		System.out.println("3- Circulo");
		operacion = sc.nextInt();
		if((operacion > 0) && (operacion <4)) {
			if(operacion ==1) {
				System.out.print("Introduce el lado: ");
				lado = sc.nextDouble();
				resultado = Math.pow(lado, 2);
				System.out.print("El area es: " + resultado + " cm^2");
			}
			else if(operacion ==2) {
				System.out.print("Introduce la base: ");
				base = sc.nextDouble();
				System.out.print("Introduce la altura: ");
				altura = sc.nextDouble();
				resultado = base*altura;
				System.out.print("El area es: " + resultado + " cm^2");
			}
			else {
				System.out.print("Introduce el radio: ");
				radio = sc.nextDouble();
				resultado = Math.pow(radio, 2)*Math.PI;
				System.out.print("El area es: " + resultado + " cm^2");
			}
		}
		else {
			System.out.println("El numero introducido no coincide con ninguna operacion.");
		}
	}
}
