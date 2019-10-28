
public class Ejercicio54 {

	public static void main(String[] args) {
		int lanzamiento = 1, numero, veces=0;
		while(lanzamiento < 101) {
			numero = (int) (6*Math.random());
			System.out.println("Lanzamiento " + lanzamiento++ + " --> " + numero);
			if(numero == 1) {
				veces++;
			}
		}
		System.out.println("El numero 1 ha salido "+ veces + " veces.");
	}

}
