package Powtorka_Petle;

import java.util.Scanner;

/*
Zadanie 5
Napisz program, który odczytuje n i sumuje liczby od 1 do n.
 */
public class Zad5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        Integer n= scanner.nextInt();

        int result =n*(n-1)/2 + n ;
        System.out.println("twoje liczby to :");
        for (int i = 1; i <=n; i++) {
            System.out.println( i);

        }
        System.out.println("suma liczb od 1 do podanej przez ciebie liczby to: "+ result );



    }
}
