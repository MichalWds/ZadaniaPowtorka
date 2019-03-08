package Powtorka_String;

import java.util.Scanner;
/*
Zadanie 2 . Napisz program, który odczytuje imię i wypisuje długość
wprowadzonego imienia:
Dane:
Piotr
Na ekran:
 */
public class Zad2 {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        System.out.println("podaj slowo: ");
        String slowo  = scanner.next();

        System.out.println("dlugosc slowa to : " + slowo.length());



    }

}
