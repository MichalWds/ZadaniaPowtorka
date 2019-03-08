package Powtorka_Metody;

/*
Zadanie 6
Napisz metodę sprawdzającą czy liczba jest parzysta
 */


import java.util.Scanner;

public class Zad6 {

public static boolean numberIseven (int a){
    if (a%2 == 0) return true;

return false;

}

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe");

    System.out.println("Czy liczba jest parzysta? : " + numberIseven(scanner.nextInt()) );




    }

}


