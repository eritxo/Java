import java.util.Scanner;

public class PT2MedinaMatiasEx3 {

	public static void main(String[] args) {
		//Declaramos el escaner y las variables
		Scanner sc = new Scanner(System.in);
		int numeroIntroducido, sumaDivisores, contador;
		//Leemos lo que ha introducido el usuario
		System.out.print("Introduce un numero: ");
		numeroIntroducido = sc.nextInt();
		//Le restamos 1 al numero introducido por que nos interesa saber todos los numeros perfectos
		// inferiores al numero introducido
		--numeroIntroducido;
		//Mientras el numero sea mas grande que 0 se ejecutara el bucle
		while(numeroIntroducido > 0) {
			//Reseteamos la variable contador
			contador = 1;
			//Reseteamos la variable sumaDivisores
			sumaDivisores = 0;
			//Mientras el contador sea mas pequeño que el numero introducido se ejecutrara el bucle
			while(contador < numeroIntroducido) {
				//Calcuamos los divisores del numero introducido
				if((numeroIntroducido%contador) == 0) {
					//Si el numero contador es divisor del numero introducido lo sumaremos
					sumaDivisores = sumaDivisores+ contador;
				}
				contador++;
			}
			//Si la suma de los divisores es igual al numero introducido sera un numero perfecto
			if(sumaDivisores == numeroIntroducido) {
				System.out.println(numeroIntroducido + " es un numero perfecto.");
			}
			//Restamos 1 al numero introducido
			numeroIntroducido--;
		}
	}

}
