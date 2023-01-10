package Podstawy;

import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        int LiczbaCiasteczek;
        LiczbaCiasteczek = 40;

        int LiczbaPorcji;
        LiczbaPorcji = 10;

        int LiczbaKalorii;
        LiczbaKalorii = 300;

        double LiczbaCiastekwPorcji = (double)LiczbaCiasteczek / LiczbaPorcji;

        double KalorycznoscCiastka;
        KalorycznoscCiastka = (double)LiczbaKalorii / LiczbaCiastekwPorcji;

        System.out.println("Podaj liczbę zjedzonych ciastek: ");
        int IloscCiastek = klawiatura.nextInt();
        klawiatura.nextLine();
        double SkonsumowaneKalorie = (double)IloscCiastek * KalorycznoscCiastka;

        System.out.println("Liczba skonsumowanych kalorii: " + SkonsumowaneKalorie);
    }
}
