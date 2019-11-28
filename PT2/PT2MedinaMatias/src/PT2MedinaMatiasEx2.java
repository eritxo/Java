import java.util.Random;
import java.util.Scanner;

public class PT2MedinaMatiasEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		double porcentajeAcietos, porcentajeFallos, opcionA, opcionB, opcionC, opcionD;
		int contador = 10, a, b, c, aciertos = 0, fallos = 0, operacionRandom, opcionCorrecta,
				opcionesRandom, opcionUsuario;
		while(contador > 0) {
			a = random.nextInt(101);
			b = random.nextInt(101);
			operacionRandom = random.nextInt(4);
			if(operacionRandom == 0) {
				c = a+b;
				System.out.println("¿Cual es el resultado de: "+a+"+"+b+" ?");
			}
			else if(operacionRandom == 1) {
				c = a-b;
				System.out.println("¿Cual es el resultado de: "+a+"-"+b+" ?");
			}
			else if(operacionRandom == 2) {
				c = a/b;
				System.out.println("¿Cual es el resultado de: "+a+"/"+b+" ?");
			}
			else {
				c = a*b;
				System.out.println("¿Cual es el resultado de: "+a+"*"+b+" ?");
			}
			opcionA = a-2*b;
			opcionB = 2*a*b-4;
			opcionC = 3*b-2*a;
			opcionD = c;
			opcionesRandom = random.nextInt(4);
			if(opcionesRandom == 0) {
				System.out.println("Opcion 1- "+ opcionA);
				System.out.println("Opcion 2- "+ opcionB);
				System.out.println("Opcion 3- "+ opcionC);
				System.out.println("Opcion 4- "+ opcionD);
				opcionCorrecta = 4;
			}
			else if(opcionesRandom == 1) {
				System.out.println("Opcion 1- "+ opcionC);
				System.out.println("Opcion 2- "+ opcionD);
				System.out.println("Opcion 3- "+ opcionB);
				System.out.println("Opcion 4- "+ opcionA);
				opcionCorrecta = 2;
			}
			else if(opcionesRandom == 2) {
				System.out.println("Opcion 1- "+ opcionB);
				System.out.println("Opcion 2- "+ opcionC);
				System.out.println("Opcion 3- "+ opcionD);
				System.out.println("Opcion 4- "+ opcionA);
				opcionCorrecta = 3;
			}
			else {
				System.out.println("Opcion 1- "+ opcionD);
				System.out.println("Opcion 2- "+ opcionC);
				System.out.println("Opcion 3- "+ opcionB);
				System.out.println("Opcion 4- "+ opcionA);
				opcionCorrecta = 1;
			}
			System.out.print("Introduce la opcion correspondiente a la respuesta correcta: ");
			opcionUsuario = sc.nextInt();
			while((opcionUsuario > 4) || (opcionUsuario < 0)) {
				System.out.print("Error, introduce un numero entre 1 y 4: ");
				opcionUsuario = sc.nextInt();
			}
			if(opcionUsuario == opcionCorrecta) {
				System.out.println("Correcto!");
				aciertos++;
			}
			else {
				System.out.println("Incorrecto!");
				fallos++;
			}
			contador--;
		}
		porcentajeAcietos = (aciertos*100)/10;
		porcentajeFallos = (fallos*100)/10;
		System.out.println("De un total de 10 casos: ");
		System.out.println("Un "+porcentajeAcietos+"% han sido aciertos.");
		System.out.println("Un "+porcentajeFallos+"% han sido fallos.");

	}

}
