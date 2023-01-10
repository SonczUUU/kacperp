package If;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj masę obiektu");
        double Masa = klawiatura.nextDouble();

        double Ciezar = Masa * 9.8;

        if(Ciezar>1000)
            System.out.println("Obiekt jest zbyt ciężki i jego ciezar wynosi: " + Ciezar + " niutonów");
        else if(Ciezar<10)
            System.out.println("Obiekt jest zbyt lekki i jego ciezar wynosi: " + Ciezar + " niutonów");
        else
            System.out.println("Cieżar obiektu wynosi: " + Ciezar + " niutonów");
    }
}
