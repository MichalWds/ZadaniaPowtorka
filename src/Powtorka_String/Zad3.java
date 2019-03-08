package Powtorka_String;

import java.util.Scanner;

public class Zad3 {

/*
Zadanie 3. Napisz program, który odczytuje wyraz i sprawdza czy
wprowadzony wyraz to Akademia
Dane:
Akademia
Na ekran:
true
Dane2:
Akademi
Na ekran:
 */
public static void main(String[] args) {

   Scanner scanner = new Scanner(System.in);
   System.out.println("podaj slowo akademia: ");
    String haslo = scanner.next();

    if (haslo.equalsIgnoreCase("akademia")){
        System.out.println("Podales dobre haslo");
    }else{
        System.out.println("Haslo niepoprawne");
    }
}


}
