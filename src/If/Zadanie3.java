package If;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);


        System.out.println("Podaj wagę w kilogramach");
        double Waga = klawiatura.nextDouble();

        System.out.println("Podaj wzrost w metrach");
        double Wzrost = klawiatura.nextDouble();

        double BMI =  Waga/Math.pow((Wzrost),2);

                if(BMI>=18.5&&BMI<=25)
                    System.out.println("Wskaźnik BMI jest w normie i wynosi: " + BMI);
                else if(BMI<18.5)
                    System.out.println("Wskaźnik BMI wynosi: " + BMI + " i wskazuje na niedowagę");
                else if(BMI>25)
                    System.out.println("Wskaźnik BMI wynosi: " + BMI + " i wskazuje na nadwagę");
    }
}
