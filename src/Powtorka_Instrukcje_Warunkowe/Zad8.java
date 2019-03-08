package Powtorka_Instrukcje_Warunkowe;


/*
Zadanie 8
Odczytaj wprowadzony wyraz przez użytkownika i sprawdź czy pierwsza litera
wyrazu jest taka sama jak ostatnia. Wpisz odpowiedni komunikat
 */

import java.util.Scanner;

public class Zad8 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");

        String wyraz = scanner.next().toLowerCase();

        if (wyraz.charAt(0) == wyraz.charAt(wyraz.length() - 1)) {
            System.out.println("pierwsza i ostatnia litera sa takie same");
        } else {
            System.out.println("pierwsza i ostatnia sa rozne");
        }

        String wyraz2 = scanner.next().toLowerCase();
        boolean rowne = (wyraz2.charAt(0) == wyraz2.charAt(wyraz2.length() - 1));
        System.out.println(rowne);

    }
}
