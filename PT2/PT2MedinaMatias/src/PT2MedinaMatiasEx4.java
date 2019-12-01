import java.util.Scanner;

public class PT2MedinaMatiasEx4 {

	public static void main(String[] args) {
		//Declaramos las variables y el escaner
		Scanner sc = new Scanner(System.in);
		int x, y;
		double divisor, dividendo, contador, e, raizN;
		//Leemos lo que introduce el usuario por teclado
		System.out.print("Introduce el valor de x: ");
		x = sc.nextInt();
		System.out.print("Introduce el valor de y: ");
		y = sc.nextInt();
		//Calculamos el primer valor de la sucesion
		e = x*1.0;
		e = 1 + (e/1);
		//Mientras y sea mas grande que 1 ejecutamos el bucle
		while(y > 1) {
			//El dividendo toma como valor el contenido de la variable x
			dividendo = x;
			//El divisor toma como valor 1
			divisor = 1;
			//El contador toma como valor 1
			contador = 1;
			//Mientras el contador sea mas pequeño que la variable y el bucle se ejecutara
			while(contador < y) {
				//Calculamos el factorial empezando por el ultimo
				divisor = divisor*(contador+1);
				contador++;
			}
			//Utilizamos la variable contador para saber cuantas veces tenemos que elevar el dividendo
			while(contador > 1) {
				//Elevamos la variable dividendo
				dividendo = dividendo*x;
				--contador;
			}
			//Calculamos el valor de la suma del primer valor de e + la sucesion
			e = e + (dividendo/divisor);
			y--;
		}
		//Convertimos la variable x a double por que sino no podemos calcula la raiz N del resultado 
		//de la suma de sucesiones
		raizN = x*1.0;
		//Calculamos la raiz N de la suma de sucesiones
		e = Math.pow(e, 1/raizN);
		//Imprimimos por pantalla el valor de e
		System.out.println("E: " + e);
	}

}
