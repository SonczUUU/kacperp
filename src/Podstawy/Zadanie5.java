package Podstawy;

public class Zadanie5 {
    public static void main(String[] args) {

        int Bok1 = 3;
        int Bok2 = 4;
        int Bok3 = 2;
        int Bok4 = 2;


        int Pomieszczenie1;
        Pomieszczenie1 = Bok1 * Bok2;
        System.out.println("Pomieszczenie 1 ma wymiary: " + Pomieszczenie1 + " metrów");
        int Pomieszczenie2;
        Pomieszczenie2 = Bok1 * Bok2;
        System.out.println("Pomieszczenie 2 ma wymiary: " + Pomieszczenie2 + " metrów");
        int Pomieszczenie3;
        Pomieszczenie3 = Bok3 * Bok1;
        System.out.println("Pomieszczenie 3 ma wymiary: " + Pomieszczenie3 + " metrów");
        int Pomieszczenie4;
        Pomieszczenie4 = Bok3 * Bok4;
        System.out.println("Pomieszczenie 4 ma wymiary: " + Pomieszczenie4 + " metrów");

        int PowierzchniaCalkowita;
        PowierzchniaCalkowita = Pomieszczenie1 + Pomieszczenie2 + Pomieszczenie3 + Pomieszczenie4;
        System.out.println("Powierzchnia całkowita mieszkania wynosi: " + PowierzchniaCalkowita + " metrów");
    }
}
