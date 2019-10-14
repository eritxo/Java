import java.util.Scanner;

public class Ejercicio31 {

	public static void main(String[] args) {
		double a, b, resultado;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ecuación de 1er grado : ax+b=0");
		System.out.print("Introduce el valor de a: ");
		a = sc.nextDouble();
		System.out.print("Introduce el valor de b: ");
		b = sc.nextDouble();
		resultado = (-b)/a;
		if((a == 0) && (b != 0)) {
			System.out.println("No tiene solucion");
		}
		else if((a==0)&& (b==0)) {
			System.out.println("Solucion indeterminada");
		}
		else {
			System.out.println("La solucion es: "+ resultado);
		}
	}

}
