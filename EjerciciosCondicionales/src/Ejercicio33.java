import java.util.Scanner;

public class Ejercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double peso, IMC,altura;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el peso: ");
		peso = sc.nextDouble();
		System.out.print("Introduce la altura en cm: ");
		altura = sc.nextInt();
		altura = altura/100;
		IMC = peso/Math.pow(altura, 2);
		if(IMC <= 18.5) {
			System.out.println("Tu indice de masa corporal es: "+ IMC);
			System.out.println("Peso bajo - Riesgo alto");
		}
		else if((IMC > 18.5) && (IMC <= 25)) {
			System.out.println("Tu indice de masa corporal es: "+ IMC);
			System.out.println("Peso normal - Sin riesgo");
		}
		else if((IMC > 25) && (IMC <= 30)) {
			System.out.println("Tu indice de masa corporal es: "+ IMC);
			System.out.println("Pre-Obesidad - Riesgo medio");
		}
		else if((IMC > 30) && (IMC <= 35)) {
			System.out.println("Tu indice de masa corporal es: "+ IMC);
			System.out.println("Obesidad grado I - riesgo alto");
		}
		else if((IMC > 35) && (IMC <= 40)) {
			System.out.println("Tu indice de masa corporal es: "+ IMC);
			System.out.println("Obesidad grado II - riesgo muy alto");
		}
		else {
			System.out.println("Tu indice de masa corporal es: "+ IMC);
			System.out.println("Obesidad grado III - riesgo altisimo");
		}
	}

}
