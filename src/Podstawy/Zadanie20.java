package Podstawy;
import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        double Cukier = 1.5;
        double Maslo = 1;
        double Maka = 2.75;
        int Ciasteczka = 48;

        double CukierNaCiastko;
        CukierNaCiastko = Cukier / Ciasteczka;

        double MasloNaCiastko;
        MasloNaCiastko = Maslo / Ciasteczka;

        double MakaNaCiasko;
        MakaNaCiasko = Maka / Ciasteczka;

        System.out.println("Podaj liczbę oczekiwanych ciastek: ");
        int OczekiwaneCiastka = klawiatura.nextInt();

        double PotrzebnyCukier = CukierNaCiastko * OczekiwaneCiastka;
        System.out.println("Potrzeba " + PotrzebnyCukier + " Szklanek cukru");

        double PotrzebneMaslo = MasloNaCiastko * OczekiwaneCiastka;
        System.out.println("Potrzeba " + PotrzebneMaslo + " Szklanek masla");

        double PotrzebnaMaka = MakaNaCiasko * OczekiwaneCiastka;
        System.out.println("Potrzeba " + PotrzebnaMaka + " Szklanek mąki");
    }
}
