import java.util.Scanner;

public class PT2MedinaMatiasEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temperaturaA=0, temperaturaB=0, temperaturaC=0, tempMedia, porcentajeMacho, 
				porcentajeHembra, porcentajeNoFertil,totalHuevos;
		int macho =0, hembra = 0, noFertil = 0, totalHuevosInt;
		while((temperaturaA != -1) || (temperaturaB != -1) || (temperaturaC != -1)) {
			System.out.print("Introduce la temperatura A: ");
			temperaturaA = sc.nextDouble();
			System.out.print("Introduce la temperatura B: ");
			temperaturaB = sc.nextDouble();
			System.out.print("Introduce la temperatura C: ");
			temperaturaC = sc.nextDouble();
			if((temperaturaA == -1) || (temperaturaB == -1) || (temperaturaC == -1)) {}
			else {
				if(((temperaturaA >= 28) && (temperaturaB >= 28) && (temperaturaC >= 28))&&
						((temperaturaA <= 32) && (temperaturaB <= 32) && (temperaturaC <= 32))) {
					tempMedia = (temperaturaA + temperaturaB + temperaturaC)/3;
					if(tempMedia < 30) {
						System.out.println("Macho");
						macho++;
					}
					else {
						System.out.println("Hembra");
						hembra++;
					}
				}
				else {
					System.out.println("No fertil");
					noFertil++;
				}
			}
		}
		totalHuevos = macho+hembra+noFertil;
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
