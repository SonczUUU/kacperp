package Podstawy;
import java.util.Scanner;

public class Zadanie16 {

    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj nazwe ulubionego miasta");
        String NazwaMiasta;
        NazwaMiasta = klawiatura.nextLine();

        System.out.println("Nazwa miasta: " + NazwaMiasta);

        int LiczbaZnakow;
        LiczbaZnakow = NazwaMiasta.length();
        System.out.println("Liczba znaków miasta: " + LiczbaZnakow);

        String MiastoWielkie;
        MiastoWielkie = NazwaMiasta.toUpperCase();
        System.out.println("Nazwa miasta zapisana wielkimi literami: " + MiastoWielkie);

        String MiastoMale;
        MiastoMale = NazwaMiasta.toLowerCase();
        System.out.println("Nazwa miasta zapisana małymi literami: " + MiastoMale);

        char PierwszyZnak;
        PierwszyZnak = NazwaMiasta.charAt(0);
        System.out.println("Pierwszy znak nazwy miasta: " + PierwszyZnak);

    }
}
