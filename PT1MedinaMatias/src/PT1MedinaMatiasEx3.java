import java.util.Scanner;

public class PT1MedinaMatiasEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dientesArriba, dientesAbajo, canIzqArriba, canDerArriba,
		canIzqAbajo, canDerAbajo, incisivosIzqArriba, incisivosDerArriba,
		incisivosIzqdaAbajo, incisivosDerAbajo;
		boolean chocanCaninos = false, chocanIncisivos = false;
		System.out.print("Introduce los dientes de arriba: ");
		dientesArriba = sc.nextInt();
		System.out.print("Introduce los dientes de abajo: ");
		dientesAbajo = sc.nextInt();
		sc.close();
		if(((dientesArriba < 1111) || (dientesArriba > 3333)) || ((dientesAbajo < 1111) || (dientesAbajo > 3333))) {
			System.out.println("Has introducido un numero incorrecto.");
		}
		else {
			canIzqArriba = (dientesArriba/1000);
			canDerArriba = (dientesArriba%10);
			canIzqAbajo = (dientesAbajo/1000);
			canDerAbajo = (dientesAbajo%10);
			incisivosIzqArriba = (dientesArriba/100)%10;
			incisivosDerArriba = (dientesArriba%100)/10;
			incisivosIzqdaAbajo = (dientesAbajo/100)%10;
			incisivosDerAbajo = (dientesAbajo%100)/10;
			
			if((canIzqArriba != canIzqAbajo) && (canDerArriba != canDerAbajo)) {
				chocanCaninos = false;
			}
			else {
				chocanCaninos = true;
			}
			if((((incisivosIzqArriba != incisivosIzqdaAbajo) && (incisivosDerArriba != incisivosDerAbajo)) 
			|| ((incisivosIzqArriba == incisivosIzqdaAbajo) && (incisivosDerArriba == incisivosDerAbajo)))
					&& (chocanCaninos == false)) {
				chocanIncisivos = false;
			}
			else {
				chocanIncisivos = true;
			}
			if((chocanIncisivos == false) && (chocanCaninos == false)) {
				System.out.println("SI");
			}
			else {
				System.out.println("NO");
			}
		}
		
	}

}
