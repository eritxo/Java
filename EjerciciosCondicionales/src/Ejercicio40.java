import java.util.Scanner;

public class Ejercicio40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el a�o: ");
		year = sc.nextInt();
		if((year%4 == 0) && (year%100 !=0)) {
			System.out.println("El a�o " + year + " es bisiesto");
		}
		else {
			System.out.println("El a�o " + year + " no es bisiesto");
		}

	}

}
