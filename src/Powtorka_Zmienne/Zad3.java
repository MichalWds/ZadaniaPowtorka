package Powtorka_Zmienne;

import java.util.Scanner;

/*
Zadanie 3. Napisz program, który odczytuje liczbę i oblicza pierwiastek
danej liczby.
 */
public class Zad3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int liczba = scanner.nextInt();


        System.out.println("Pierwiastek z twojej liczby to : " + Math.sqrt(liczba) );


    }
}
