import java.util.Scanner;

public class Ejercicio60 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota = 1;
		double suspensos = 0, aprobados = 0, totalEx = 0, procentajeSuspensos, procentajeAprobados;
		while(nota != -1) {
			System.out.print("Introduce la nota del examen: ");
			nota = sc.nextDouble();
			if(((nota < 0) && (nota != -1)) || (nota > 10)) {
				System.out.println("Nota invalida");
			}
			else if(nota == -1) {
				System.out.println("Calculando...");
			}
			else {
				totalEx++;
				if(nota >= 5) {
					aprobados++;
				}
				else {
					suspensos++;
				}
			}
		}
		procentajeSuspensos = 100*(suspensos/totalEx);
		procentajeAprobados = 100*(aprobados/totalEx);
		System.out.println("Hay " + suspensos + " de suspensos que son un "+ procentajeSuspensos + "%");
		System.out.println("Hay " + aprobados + " de aprobados que son un "+ procentajeAprobados + "%");

	}

}
