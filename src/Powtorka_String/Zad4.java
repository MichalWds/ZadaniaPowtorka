package Powtorka_String;

import java.util.Scanner;

public class Zad4 {
/*
Zadanie 4 . Napisz program, który odczytuje wyraz i zamienia go na małe
litery:
Dane:
AKADEMIA
Wynik:
akademia
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wyraz");
        String password = scanner.next();

        System.out.println(" Twoj wyraz z duzych liter to : "+ password.toUpperCase());



    }



}
