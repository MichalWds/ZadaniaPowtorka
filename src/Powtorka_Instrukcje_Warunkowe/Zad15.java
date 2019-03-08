package Powtorka_Instrukcje_Warunkowe;

import java.util.Scanner;

/*
Zadanie 15
Odczytaj 3 liczby i sprawdź czy jest możliwe otrzymanie z dwóch liczb trzeciej (jako
suma).
 */
public class Zad15 {


    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a =scanner.nextInt();
    int b =scanner.nextInt();
    int c = scanner.nextInt();

    boolean wynik = a+b==c || a+c==b || b+c==a;
        System.out.println("dwie dodane do siebie liczby daja trzecia: " + wynik);





    }


}
