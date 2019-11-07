import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio59 {
	
    private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double capitalInicial, interes, capitalAcumulado, intereses;
		int years, c = 1;
		System.out.print("Introduce el capital inicial: ");
		capitalInicial = sc.nextDouble();
		System.out.print("Introduce la tasa de interes anual: ");
		interes = sc.nextDouble();
		System.out.print("Introduce el numero de años: ");
		years = sc.nextInt();
		System.out.println("+-----+-------------+-------------------+");
		System.out.println("| AÑO |  INTERESES  | CAPITAL ACUMULADO |");
		System.out.println("+-----+-------------+-------------------+");
		capitalAcumulado = capitalInicial;
		while(c <= years) {
			intereses = capitalAcumulado * (interes/100);
			capitalAcumulado = intereses + capitalAcumulado;
			System.out.println("|   "+c+" |      "+df2.format(intereses)+" |          "+df2.format(capitalAcumulado)+" |");
			c++;
		}
		System.out.println("+-----+-------------+-------------------+");
		System.out.println("Capital final: " +df2.format(capitalAcumulado));
	}

}
