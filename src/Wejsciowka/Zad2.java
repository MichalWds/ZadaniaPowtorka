package Wejsciowka;

import java.util.Scanner;

/*
Zadanie2. Napisz program, który odczytuje
wyraz i wypisuje wyraz w odwrotnej kolejności
 */
public class Zad2 {
    public static void main(String[] args) {

        System.out.println("type word");
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().toLowerCase();

        StringBuilder reverse = new StringBuilder(word).reverse();

        System.out.println(reverse);

        for (int i = 0; i <100000 ; i++) {
            System.out.println(reverse);
        }
        }
    }
