import java.util.Scanner;

public class Ejercicio56 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el numerador: ");
		int numerador = sc.nextInt();
		System.out.print("Introduce el denominador: ");
		int denominador  = sc.nextInt();
		while((numerador%2 == 0) && (denominador%2 == 0)) {
			numerador = numerador/2;
			denominador = denominador/2;
		}
		System.out.println(numerador+"/"+denominador);
	}

}
