import java.util.Random;
import java.util.Scanner;

public class PT2MedinaMatiasEx2 {

	public static void main(String[] args) {
		//Declaramos el escaner, un random y las variables
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		double porcentajeAcietos, porcentajeFallos, opcionA, opcionB, opcionC, opcionD;
		int contador = 10, a, b, resultado, aciertos = 0, fallos = 0, operacionRandom, opcionCorrecta,
				opcionUsuario;
		//Hacemos un bucle que se ejecutara 10 veces
		while(contador > 0) {
			//Generamos dos numeros alteatorios entre el 0 y el 100
			a = random.nextInt(101);
			b = random.nextInt(101);
			//Generamos un numero alteatorio entre el 0 y el 3
			operacionRandom = random.nextInt(4);
			//Despues de generar el numero aleatorio lo comparamos y una vez comparamos
			// imprimimos por pantalla una operacion aleatoria
			if(operacionRandom == 0) {
				resultado = a+b;
				System.out.println("¿Cual es el resultado de: "+a+"+"+b+" ?");
			}
			else if(operacionRandom == 1) {
				resultado = a-b;
				System.out.println("¿Cual es el resultado de: "+a+"-"+b+" ?");
			}
			else if(operacionRandom == 2) {
				resultado = a/b;
				System.out.println("¿Cual es el resultado de: "+a+"/"+b+" ?");
			}
			else {
				resultado = a*b;
				System.out.println("¿Cual es el resultado de: "+a+"*"+b+" ?");
			}
			//Calculamos las opciones que podra escoger el usuario
			opcionA = a-2*b;
			opcionB = 2*a*b-4;
			opcionC = 3*b-2*a;
			opcionD = resultado;
			//Utilizamos el numero aleatorio generado previamente para escoger el orden de las opciones
			// que se mostraran al usuario
			//Dentro de cada opcion establecemos cual es la opcion correcta
			if(operacionRandom == 0) {
				System.out.println("Opcion 1- "+ opcionA);
				System.out.println("Opcion 2- "+ opcionB);
				System.out.println("Opcion 3- "+ opcionC);
				System.out.println("Opcion 4- "+ opcionD);
				opcionCorrecta = 4;
			}
			else if(operacionRandom == 1) {
				System.out.println("Opcion 1- "+ opcionC);
				System.out.println("Opcion 2- "+ opcionD);
				System.out.println("Opcion 3- "+ opcionB);
				System.out.println("Opcion 4- "+ opcionA);
				opcionCorrecta = 2;
			}
			else if(operacionRandom == 2) {
				System.out.println("Opcion 1- "+ opcionB);
				System.out.println("Opcion 2- "+ opcionC);
				System.out.println("Opcion 3- "+ opcionD);
				System.out.println("Opcion 4- "+ opcionA);
				opcionCorrecta = 3;
			}
			else {
				System.out.println("Opcion 1- "+ opcionD);
				System.out.println("Opcion 2- "+ opcionC);
				System.out.println("Opcion 3- "+ opcionB);
				System.out.println("Opcion 4- "+ opcionA);
				opcionCorrecta = 1;
			}
			//Leemos por teclado la respuesta del usuario
			System.out.print("Introduce la opcion correspondiente a la respuesta correcta: ");
			opcionUsuario = sc.nextInt();
			//Comprobamos que la opcion que ha introducido el usuario este entre el 1 y el 4
			while((opcionUsuario > 4) || (opcionUsuario < 0)) {
				System.out.print("Error, introduce un numero entre 1 y 4: ");
				opcionUsuario = sc.nextInt();
			}
			//Si la respuesta del usuario corresponde con la opcion correcta se contara como acierto
			if(opcionUsuario == opcionCorrecta) {
				System.out.println("Correcto!");
				aciertos++;
			}
			//En caso de que la respuesta del usuario no corresponda con la opcion correcta
			// se contara como un fallo
			else {
				System.out.println("Incorrecto!");
				fallos++;
			}
			//Restamos al contador 1
			contador--;
		}
		//Finalmente calculamos le porcentaje de fallos y aciertos del usuario
		porcentajeAcietos = (aciertos*100)/10;
		porcentajeFallos = (fallos*100)/10;
		System.out.println("De un total de 10 casos: ");
		System.out.println("Un "+porcentajeAcietos+"% han sido aciertos.");
		System.out.println("Un "+porcentajeFallos+"% han sido fallos.");

	}

}
