package Wejsciowka;

import java.util.Scanner;

/*
Zadanie2. Napisz program, który odczytuje
wyraz i wypisuje wyraz w odwrotnej kolejności
 */
public class Zad2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wyraz");

        String wyraz = scanner.nextLine().toLowerCase();

        StringBuilder odwrocony = new StringBuilder(wyraz).reverse();
        System.out.println(odwrocony);

    }
}
