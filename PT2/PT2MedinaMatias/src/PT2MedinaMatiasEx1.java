import java.util.Scanner;

public class PT2MedinaMatiasEx1 {

	public static void main(String[] args) {
		//Declaramos el escaner y las variables
		Scanner sc = new Scanner(System.in);
		double temperaturaA=0, temperaturaB=0, temperaturaC=0, tempMedia = 0, porcentajeMacho, 
				porcentajeHembra, porcentajeNoFertil,totalHuevos;
		int macho =0, hembra = 0, noFertil = 0, totalHuevosInt;
		//Hacemos un bucle para que el codigo se ejecute mientras ninguna de las temperaturas sea -1
		while(tempMedia != -1) {
			//Leemos las temperaturas por teclado
			System.out.print("Introduce la temperatura A: ");
			temperaturaA = sc.nextDouble();
			System.out.print("Introduce la temperatura B: ");
			temperaturaB = sc.nextDouble();
			System.out.print("Introduce la temperatura C: ");
			temperaturaC = sc.nextDouble();
			//Calculamos la temperatura media
			tempMedia = (temperaturaA + temperaturaB + temperaturaC)/3;
			//Si la temperatura media es -1 significa que el programa ha finalizado por lo tanto
			//no tenemos que ejecutar ningun codigo
			if(tempMedia == -1) {}
			//Si la temperatura media no es -1 ejecutamos el siguiente codigo
			else {
				//Comprobamos que las temperaturas esten dentro del rango para ver si los huevos son 
				// fertiles
				if((temperaturaA >= 28) && (temperaturaB >= 28) && (temperaturaC >= 28) &&
						(temperaturaA <=32) && (temperaturaB <=32) && (temperaturaC <=32)) {
					//Si la temperatura media esta por debajo de los 30 grados el caiman sera macho
					if(tempMedia < 30) {
						System.out.println("Macho");
						macho++;
					}
					//Si la temperatura media esta por encima de los 30 grados el caiman sera hembra
					else {
						System.out.println("Hembra");
						hembra++;
					}
				}
				//Si las temperaturas estan fuera del rango los huevos seran infertiles
				else {
					System.out.println("No fertil");
					noFertil++;
				}
			}
		}
		//Una vez fuera del bucle calculamos el total del huevos
		totalHuevos = macho+hembra+noFertil;
		//Si el total del huevos es igual a 0 el programa habra finalizado nada mas inciarlo y
		//no se contaron huevos
		if(totalHuevos == 0) {
			System.out.println("Fin del programa.");
		}
		//Si el total del huevos es superior a 0 calculamos los porcentajes y los imprimimos por pantalla
		else {
			totalHuevosInt = (int) totalHuevos;
			porcentajeMacho = (macho*100)/totalHuevos;
			porcentajeHembra = (hembra*100)/totalHuevos;
			porcentajeNoFertil = (noFertil*100)/totalHuevos;
			System.out.println("De un total de "+ totalHuevosInt +" huevos:");
			System.out.println("Se ha registrado un "+ porcentajeMacho +"% de caimanes machos.");
			System.out.println("Se ha registrado un "+ porcentajeHembra +"% de caimanes hembras.");
			System.out.println("Se ha registrado un "+ porcentajeNoFertil +"% de huevos infertiles.");
		}
	}

}
