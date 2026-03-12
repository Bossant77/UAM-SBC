// Santiago de Jesús Bolio Cano
//540809
import java.util.Scanner;

public class estructuraCondicional {
    public static void main(String[] args) {

        int ni = 0; 
        int jo = 0; 
        int ad = 0; 
        int ma = 0;

        double pni = 0; 
        double pjo = 0; 
        double pad = 0; 
        double pma = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 50; i++) {
            int edad;
            double peso;

            System.out.print("Edad de la persona: ");
            edad = input.nextInt();

            System.out.print("Peso de la persona: ");
            peso = input.nextDouble();

            if (edad <= 12) {
                ni++;
                pni += peso;
            } else if (edad <= 29) {
                jo++;
                pjo += peso;
            } else if (edad <= 59) {
                ad++;
                pad += peso;
            } else {
                ma++;
                pma += peso;
            }
        }

        System.out.println("Total de niños: " + ni + ", Peso promedio: " + (pni / ni));
        System.out.println("Total de jóvenes: " + jo + ", Peso promedio: " + (pjo / jo));
        System.out.println("Total de adultos: " + ad + ", Peso promedio: " + (pad / ad));
        System.out.println("Total de adultos mayores: " + ma + ", Peso promedio: " + (pma / ma));
    }
}