import java.util.Scanner;

public class Ejercicio62 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int usuario = -1, random, rangoMin = 0, rangoMax = 1000, intentos = 1;
		random = (int) (999*Math.random());
		while(usuario != random) {
			System.out.print("Intento " + intentos +",   "+ rangoMin + " > x > " + rangoMax + " ? ");
			usuario = sc.nextInt();
			if((usuario >= 1) && (usuario <= 999)) {
				if(usuario < random) {
					rangoMin = usuario;
				}
				else {
					rangoMax = usuario;
				}
				++intentos;
			}
			else {
				System.out.println("Numero fuera de rango.");
			}
		}		
		--intentos;
		System.out.println("Enhorabuena!!!, el número secreto era el " + random);
		System.out.println("Has necesitado "+intentos+" intentos.");
	}

}
