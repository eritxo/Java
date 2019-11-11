import java.util.Scanner;

public class PT1MedinaMatiasEx1 {

	public static void main(String[] args) {
		//Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		//Declaramos las variables
		int amplitud, altura, cerillasTotales, cerillasVeritcales, cerillasHorizontales;
		//Imprimimos por pantalla un mensaje para que el usuario sepa que debe introducir un valor
		System.out.print("Introduce la altura: ");
		//Altura toma por valor lo que introduce el usuario por teclado
		altura = sc.nextInt();
		//Imprimimos por pantalla un mensaje para que el usuario sepa que debe introducir un valor
		System.out.print("Introduce la amplitud: ");
		//Amplitud toma por valor lo que introduce el usuario por teclado
		amplitud = sc.nextInt();
		//Cerramos el Scanner
		sc.close();
		//Realizamos un control para ver si los numeros introducidos son validos
		if((altura <= 0) || (amplitud <=0)) {
			System.out.println("Has introducido una altura o amplitud incorrecta.");
		}
		//Si los numeros son validos se ejecutara el siguiente codigo
		else {
			/* Si descomponemos las construcciones en cerillas verticales y horizontales podemos observar
			 * que las cerillas vericales equivalen a (amplitud + 1) * altura.
			 * Tambien nos damos cuenta de que las cerillas horizontales equivalen a la (altura + 1) * amplitud.
			 */
			//Calculamos las cerillas verticales siguiendo el metodo explicado anteriormente
			cerillasVeritcales = (amplitud+1) * altura;
			//Calculamos las cerillas horizontales siguiendo el metodo explicado anteriormente
			cerillasHorizontales = (altura+1) * amplitud;
			//Sumamos las cerillas verticales y horizontales para obtener el total de cerillas.
			cerillasTotales = cerillasVeritcales+cerillasHorizontales;
			System.out.println("Se necesitan en total: " +cerillasTotales+ " cerillas.");
		}
	}

}
