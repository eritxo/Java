import java.util.Scanner;

public class PT2MedinaMatiasEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroIntroducido, sumaDivisores, contador;
		System.out.print("Introduce un numero: ");
		numeroIntroducido = sc.nextInt();
		--numeroIntroducido;
		while(numeroIntroducido > 0) {
			contador = 1;
			sumaDivisores = 0;
			while(contador < numeroIntroducido) {
				if((numeroIntroducido%contador) == 0) {
					sumaDivisores = sumaDivisores+ contador;
				}
				contador++;
			}
			if(sumaDivisores == numeroIntroducido) {
				System.out.println(numeroIntroducido);
			}
			numeroIntroducido--;
		}
	}

}
