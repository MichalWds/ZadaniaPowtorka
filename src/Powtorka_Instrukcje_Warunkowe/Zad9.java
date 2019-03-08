package Powtorka_Instrukcje_Warunkowe;

import java.util.Scanner;

/*
Zadanie 9
Odczytaj 2 wyrazy i sprawdź czy wprowadzone wyrazy są równe.
 */
public class Zad9 {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        System.out.println("podaj wyraz 1");
      String a = scanner.next();
        System.out.println("podaj wyraz 2 ");
        String b = scanner.next();

        boolean porownanie = a.equalsIgnoreCase(b);
        System.out.println("czy wyrazy sa rowne:  " + porownanie);

    }
}
