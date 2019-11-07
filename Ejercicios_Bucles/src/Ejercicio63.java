import java.util.Scanner;

public class Ejercicio63 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int voto = 0, si = 0, no = 0, abstencion = 0;
		while(voto != 4) {
			System.out.print("Entra tu voto ( 1=SI , 2=NO, 3=ABSTENCION, 4=FIN ) : ");
			voto = sc.nextInt();
			if((voto <= 4) && (voto >= 1)) {
				if(voto == 1) {
					si++;
				}
				else if(voto == 2) {
					no++;
				}
				else if(voto == 3) {
					abstencion++;
				}
			}
			else {
				System.out.println("Voto inválido.");
			}
		}
		System.out.println("Contando votos...");
		System.out.print("SI |");
		while(si > 0) {
			System.out.print("*");
			si--;
		}
		System.out.println("");
		System.out.print("NO |");
		while(no > 0) {
			System.out.print("*");
			no--;
		}
		System.out.println("");
		System.out.print("ABS|");
		while(abstencion > 0) {
			System.out.print("*");
			abstencion--;
		}
		System.out.println("");
		System.out.println("   +-----+-----+-----+-----+-----+-----+-----+-----+-----+-----+");
		System.out.println("   0     10    20    30    40    50    60    70    80    90    100%");
	}

}
