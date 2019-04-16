package Powtorka_Metody;

import java.util.Scanner;

public class Zad1 {
    private static Scanner scanner;

    /*
    Zadanie 1
Napisz metodę add wyznaczającą sumę dwóch zadanych liczb całkowitych.
Napisz program wykorzystujący funkcję add.
     */


    public static int suma(int a, int b){

        Scanner scanner = new Scanner(System.in);

     return a+b;
    }

    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

        System.out.println("podaj liczbe");
        int c = scanner.nextInt();
        System.out.println("podaj druga liczbe");
        int d =scanner.nextInt();
        System.out.println("suma liczb to: "+ suma(c,d));


    }


}
