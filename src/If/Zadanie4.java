package If;
import java.util.Scanner;

public class Zadanie4{

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj wyniki z 3 testow:");
        double wynik1 = klawiatura.nextDouble();
        double wynik2 = klawiatura.nextDouble();
        double wynik3 = klawiatura.nextDouble();
        double srednia=(wynik1+wynik2+wynik3)/3;


        System.out.println("Średia wynosi: " + srednia);

        if (srednia>=90) {
            System.out.println("Masz 5");
        }
        else if (srednia>=80 && srednia<89) {
            System.out.println("Masz 4");
        }
        else if (srednia>=70 && srednia<79) {
            System.out.println("Masz 3");
        }
        else if (srednia>=60&&srednia<69) {
            System.out.println("Masz 2");
        }
        else if (srednia<60) {
            System.out.println("Masz 1");
        }


    }

}

