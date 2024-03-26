import java.util.Scanner;

public class Promedio{
	public static void main(String args[]){
		Scanner userInputScanner = new Scanner(System.in);
		float matematicas = 0;
		float biologia = 0;
		float fisica = 0;
		float promedio = 0;
		
		System.out.println("Ingresa tu nota final de matemáticas");
		matematicas = userInputScanner.nextFloat();

		System.out.println("Ingresa tu nota final de biología");
		biologia = userInputScanner.nextFloat();

		System.out.println("Ingresa tu nota final de física");
		fisica = userInputScanner.nextFloat();

		promedio = (matematicas + biologia + fisica) / 3;

		if(promedio >= 6){
			System.out.println("Tu promedio es: " + promedio + " Felicidades, has aprobado !!!");
		} else {
			System.out.println("Tu promedio es: " + promedio + " Lo siento, has reprobado :(");
		}
	}
}