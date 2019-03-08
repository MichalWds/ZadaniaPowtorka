package Powtorka_Instrukcje_Warunkowe;

import java.util.Scanner;

/*
Zadanie 10
Napisz program, który odczytuje słowo i sprawdza czy dany String jest poprawnym
adresem url. Zakładamy, że adres url jest postaci http://www.wp.pl bądź postaci
https://www.wp.pl bądź postaci www.wp.pl
 */
public class Zad10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj adres url");
String URL = scanner.nextLine();
        boolean wyraz = URL.startsWith("http://www") || URL.startsWith("www") || URL.startsWith("https://www");
        System.out.println(wyraz);
        }



    }

