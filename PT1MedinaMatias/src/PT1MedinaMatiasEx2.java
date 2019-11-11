import java.util.Scanner;

public class PT1MedinaMatiasEx2 {

	public static void main(String[] args) {
		//Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		//Declaramos las variables
		int canalOrigen, canalDestino, distanciaCanales, pulsadas, min, max;
		//Imprimimos por pantalla un mensaje para que el usuario sepa que debe introducir un valor
		System.out.print("Introduce el canal de origen: ");
		//Canal Origen toma por valor lo que el usuario introducio por teclado
		canalOrigen = sc.nextInt();
		//Imprimimos por pantalla un mensaje para que el usuario sepa que debe introducir un valor
		System.out.print("Introduce el canal de destino: ");
		//Canal Destino toma por valor lo que el usuario introducio por teclado
		canalDestino = sc.nextInt();
		//Cerramos Scanner
		sc.close();
		//Controlamos que el canal de origen y destino esten dentro del rango
		if(((canalOrigen <=0) || (canalOrigen >= 100)) || ((canalDestino <= 0) || (canalDestino >= 100))) {
			System.out.println("Has introducido un numero de canal incorrecto.");
		}
		//Si los canales estan dentro del rango ejecutaremos el codigo
		else {
			//Comparamos la dos variables para poder ordenarlas
			if(canalOrigen > canalDestino) {
				max = canalOrigen;
				min = canalDestino;
			}
			else {
				max = canalDestino;
				min = canalOrigen;
			}
			//Calculamos la distancia de canales que hay entre los canales que ordenamos previamente
			distanciaCanales = max - min;
			//Si la distancia entre los dos canales es igual o mayor a 50 
			if(distanciaCanales >= 50) {
				/*Si sumamos el valor de la variable min obtendremos las pulsadas necesarias para llegar al canal 99
				 * Una vez realizado el paso anterior calculamos la distancia desde el 99 hasta el valor de la variable max, 
				 * esto lo hacemos restando a 99 el valor de la variable max
				 * Una vez tenemos las pulsadas que hay que dar para llegar al 99 y la distancia que hay entre 99 y la variable max sumamos 
				 * los resultados y obetenmos el numero de pulsadas que necesitamos para llegar al canal.
				*/
				pulsadas = min + (99-max);
			}
			else {
				/*Si la distancia entre los canales es menor a 50 no vale la pena llegar al 99 para calcular el numero de pulsadas
				 *  por lo tanto el numero de pulsadas que necesitamos es igual a la distancia entre canales
				 * */
				pulsadas = distanciaCanales;
			}
			//Despues de realizar las operaciones correspondientes imprimimos por pantalla el resultado.
			System.out.println("Se necesitan " + pulsadas + " pulsadas totales.");
		}
	}

}
