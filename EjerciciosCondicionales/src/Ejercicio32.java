import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
		double a, b, c, discriminante, resultadoPositivo, resultadoNegativo;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el valor de a: ");
		a = sc.nextDouble();
		System.out.print("Introduce el valor de b: ");
		b = sc.nextDouble();
		System.out.print("Introduce el valor de c: ");
		c = sc.nextDouble();
		discriminante = Math.sqrt(Math.pow(b, 2) - (4*a*c));
		resultadoPositivo = ((-b)+discriminante)/(2*a);
		resultadoNegativo = ((-b)-discriminante)/(2*a);
		if((a==0)) {
			System.out.println("No es una ecuacion de segundo grado");
		}
		else if((a*c*4) > (b*b)) {
			System.out.println("No hay soluciones reales");
		}
		else if(discriminante == 0) {
			System.out.println("Una unica solucion real");
			System.out.println("x= "+ resultadoPositivo);
		}
		else if(discriminante > 0) {
			System.out.println("x1= "+ resultadoNegativo);
			System.out.println("x2= "+ resultadoPositivo);
		}
	}

}
