import java.util.Scanner;

public class Ejercicio37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hora, minutos, segundos, segundosAMinutos, minutosAHora;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la hora: ");
		hora = sc.nextInt();
		System.out.print("Introduce los minutos: ");
		minutos = sc.nextInt();
		System.out.print("Introduce los segundos: ");
		segundos = sc.nextInt();
		segundos++;
		if((hora >= 0) && (minutos >= 0) && (segundos >= 0)) {
			if(segundos == 60) {
				segundosAMinutos = segundos/60;
				minutos += segundosAMinutos;
				segundos = 0;
			}
			if(minutos == 60) {
				minutosAHora = minutos/60;
				hora += minutosAHora;
				minutos = 0;
			}
			if(hora >= 24) {
				hora = hora - 24;
			}
			System.out.println("La hora un segundo despues sera: " + hora+":"+minutos+":"+segundos);
		}
		else {
			System.out.println("No se puede introducir numeros negativos");
		}
		
	}

}
