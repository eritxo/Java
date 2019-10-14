import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		double catetoOpuesto, catetoContiguo, hipotenusa, catetosSuma, hipotenusaCuadrado, casoDos, casoTres;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el valor del cateto opuesto: ");
		catetoOpuesto = sc.nextDouble();
		catetoOpuesto = Math.pow(catetoOpuesto, 2);
		System.out.print("Introduce el valor del cateto contiguo: ");
		catetoContiguo = sc.nextDouble();
		catetoContiguo = Math.pow(catetoContiguo, 2);
		System.out.print("Introduce el valor de la hipotenusa: ");
		hipotenusa = sc.nextDouble();
		hipotenusaCuadrado = Math.pow(hipotenusa, 2);
		catetosSuma = catetoOpuesto + catetoContiguo;
		casoDos = hipotenusaCuadrado - catetoOpuesto;
		casoTres = hipotenusaCuadrado - Math.pow(catetoContiguo, 2);
		if(hipotenusaCuadrado == catetosSuma) {
			System.out.println("Es un triangulo rectangulo");
		}
		else if(){
			System.out.println("Es un triangulo obtusangulo");
		}
	}

}
