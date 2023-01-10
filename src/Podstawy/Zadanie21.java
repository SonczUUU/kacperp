package Podstawy;
import java.util.Scanner;

public class Zadanie21 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);


        System.out.println("Kwota pieniędzy początkowo zdeponowana na koncie");
        double P = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("Roczna stopa oprocentowania");
        double r = klawiatura.nextDouble()/100;
        klawiatura.nextLine();

        System.out.println("Ile razy w roku odsetki są kapitalizowane");
        double n = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("Liczba lat, przez jakie środki będą znajdować się na koncie i generować odsetki");
        double t = klawiatura.nextInt();

        double A = P*Math.pow((1+r/n),n*t);


        double wynik = Math.round(A * 100) / 100;

        System.out.println("Kwota jaka znajdzie się na koncie po " + t + " latach: " + wynik);
    }
}
