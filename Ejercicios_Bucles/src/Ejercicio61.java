import java.util.Scanner;

public class Ejercicio61 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double media ,sumaTemp = 0, temperatura = 0, maxima = -10000, minima = 50000;
		int dias = 1;
		while(temperatura != -1000) {
			System.out.print("Introduce la temperatura del dia "+ dias +": ");
			temperatura = sc.nextDouble();
			if(temperatura != -1000) {
				dias++;
				sumaTemp = sumaTemp + temperatura;
				if(temperatura > maxima) {
					maxima = temperatura;
				}
				else if(temperatura < minima){
					minima = temperatura;
				}
			}
			else {
				System.out.println("Calculando...");
			}
		}
		dias = dias - 1 ;
		media = (sumaTemp/(dias));
		System.out.println("Se ha introducido la temperatura de " + dias +" dias.");
		System.out.println("La media es de " + media + " ºC");
		System.out.println("La temperatura máxima ha sido de "+maxima+" ºC y la mínima de "+minima+" ºC");
	}

}
