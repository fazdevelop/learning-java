import java.util.Scanner;
import java.util.Random;

public class Adivinanza{
    public static void main(String args[]){
        try (Scanner userInputScanner = new Scanner(System.in)) {
            Random rand = new Random();

            int adivinarNum = rand.nextInt(100) + 1;
            int numUser;
            int intentos = 0;

            System.out.println("Adivina el numero ! Porfavor, ingrese un numero del 1 al 100");

            while(true) {   
                try {
                    numUser = userInputScanner.nextInt();
                    intentos++;

                    if(numUser > adivinarNum){
                        System.out.println("Tu numero es demasiado alto, intente con uno mas bajo");
                    } else if(numUser < adivinarNum){
                        System.out.println("Tu numero es demasiado bajo, intente con uno mas alto");
                    } else {
                        System.out.println("Felicidades has acertado !" + " Numero de intentos: " + intentos);
                        break;
                    }
                }
                catch(java.util.InputMismatchException e) {
                    System.out.println("Por favor, ingresa un numero !");
                    userInputScanner.next();
                }
            }
        }
    }
}