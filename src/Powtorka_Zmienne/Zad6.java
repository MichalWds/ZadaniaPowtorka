package Powtorka_Zmienne;

import java.util.Random;
import java.util.Scanner;

/*
Zadanie 6 . Napisz program, który losuje 2 liczby z zakresu od 1 do 50.
Dopisz do programu komentarz programistyczny
 */
public class Zad6 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int a = random.nextInt(100);
        int b = random.nextInt(50);
        System.out.println(a + " " + b);

    }

}