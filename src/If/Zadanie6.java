package If;

import java.util.Scanner;

public class Zadanie6{

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Napisz liczbe sekund");
        double sekundy = klawiatura.nextDouble();
        klawiatura.close();
        double Minuty = 0;
        double Godziny = 0;
        double Dni = 0;

        if (sekundy>=86400) {
            Dni = sekundy / 86400;
            System.out.println(sekundy+ " sekund to "+ Dni +" dni" );
        }
        else if (sekundy>=3600) {
            Godziny = sekundy / 3600;
            System.out.println(sekundy+" sekund to "+ Godziny +" godzin");
        }
        else if(sekundy>=60) {
            Minuty = sekundy / 60;
            System.out.println(sekundy+" sekund to "+ Minuty +" minuty");
        }
        else if (sekundy<60) {
            System.out.println(sekundy+" sekund");
        }

        System.out.println(Minuty + Godziny + Dni);

    }

}