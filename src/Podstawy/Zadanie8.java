package Podstawy;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj długość pokoju nr1: ");
        int Dlugosc1 = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Podaj szerokość pokoju nr1: ");
        int Szerokosc1 = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("Podaj długość pokoju nr2: ");
        int Dlugosc2 = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Podaj szerokość pokoju nr2: ");
        int Szerokosc2 = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("Podaj długość pokoju nr3: ");
        int Dlugosc3 = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Podaj szerokość pokoju nr3: ");
        int Szerokosc3 = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("Podaj długość pokoju nr4: ");
        int Dlugosc4 = klawiatura.nextInt();
        klawiatura.nextLine();
        System.out.println("Podaj szerokość pokoju nr4: ");
        int Szerokosc4 = klawiatura.nextInt();
        klawiatura.nextLine();


        int Pomieszczenie1;
        Pomieszczenie1 = Dlugosc1 * Szerokosc1;
        System.out.println("Pomieszczenie 1 ma wymiary: " + Pomieszczenie1 + " metrów");
        int Pomieszczenie2;
        Pomieszczenie2 = Dlugosc2 * Szerokosc2;
        System.out.println("Pomieszczenie 2 ma wymiary: " + Pomieszczenie2 + " metrów");
        int Pomieszczenie3;
        Pomieszczenie3 = Dlugosc3 * Szerokosc3;
        System.out.println("Pomieszczenie 3 ma wymiary: " + Pomieszczenie3 + " metrów");
        int Pomieszczenie4;
        Pomieszczenie4 = Dlugosc4 * Szerokosc4;
        System.out.println("Pomieszczenie 4 ma wymiary: " + Pomieszczenie4 + " metrów");

        int PowierzchniaCalkowita;
        PowierzchniaCalkowita = Pomieszczenie1 + Pomieszczenie2 + Pomieszczenie3 + Pomieszczenie4;
        System.out.println("Powierzchnia całkowita mieszkania wynosi: " + PowierzchniaCalkowita + " metrów");

        int LiczbaOsob;
        LiczbaOsob = 4;
        int PowierzchniaPrzypadajaca;
        PowierzchniaPrzypadajaca = PowierzchniaCalkowita / LiczbaOsob;
        System.out.println("Powierzchnia przypadająca na jedną z 4 osób, to: " + PowierzchniaPrzypadajaca + " metrów");


    }
}
