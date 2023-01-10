package Podstawy;

public class Zadanie7 {
    public static void main(String[] args) {
        double ProcentSprzedazyMazowsza;
        ProcentSprzedazyMazowsza = 0.62;

        double SprzedazProduktow;
        SprzedazProduktow = 4.6;

        double SprzedazMazowsza;
        SprzedazMazowsza = SprzedazProduktow * ProcentSprzedazyMazowsza;
        System.out.println("Sprzedaż regionu mazowieckiego w firmie w ciągu roku wyniosła: " + SprzedazMazowsza + " mln złotych");


    }
}
