package If;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj dzien");
        int Dzien = klawiatura.nextInt();

        System.out.println("Podaj miesiąc");
        int Miesiac = klawiatura.nextInt();

        System.out.println("Podaj dwie ostatnie cyfry roku");
        int Rok = klawiatura.nextInt();

        if(Dzien*Miesiac==Rok)
            System.out.println("Data jest magiczna");
        else
            System.out.println("Data nie jest magiczna");

    }
}
