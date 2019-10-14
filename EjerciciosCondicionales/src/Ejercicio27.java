import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String args[]) {
		double primerLado, segundoLado, tercerLado, sumaLados, sumaLadosCasoDos, sumaLadosCasoTres;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer lado: ");
		primerLado = sc.nextDouble();
		System.out.print("Introduce el segundo lado: ");
		segundoLado = sc.nextDouble();
		System.out.print("Introduce el tercer lado: ");
		tercerLado = sc.nextDouble();
		sumaLados = primerLado + segundoLado;
		sumaLadosCasoDos = segundoLado + tercerLado;
		sumaLadosCasoTres = primerLado + tercerLado;
		if((sumaLados < tercerLado) || (sumaLadosCasoDos < primerLado) || (sumaLadosCasoTres < segundoLado)) {
			System.out.println("El triangulo es imposible");
		}
		else {
			System.out.println("El triangulo es posible");
		}
	}
}
