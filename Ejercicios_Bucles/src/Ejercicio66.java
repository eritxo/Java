import java.util.Scanner;

public class Ejercicio66 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alumno = 1, examenes;
		double nota = 0, notaMedia, sumaNotas = 0;
		while(nota != -2) {
			examenes = 0;
			nota = 0;
			sumaNotas = 0;
			System.out.println("Entra las notas del alumno " + alumno);
			alumno++;
			while(nota != -1) {
				if((nota <= 10) && (nota >= 0)) {
					++examenes;
					System.out.print("Nota del examen " + examenes + ": ");
					nota = sc.nextDouble();
					sumaNotas = sumaNotas + nota;
				}
				else if(nota == -2) {
					break;
				}
				else {
					System.out.println("Nota incorrecta.");
					--examenes;
					nota = 0;
				}
			}
			sumaNotas = sumaNotas+1;
			--examenes;
			notaMedia = sumaNotas/examenes;
			System.out.println("Nota media : " + notaMedia);
		}
		System.out.println("Fin.");
	}

}
