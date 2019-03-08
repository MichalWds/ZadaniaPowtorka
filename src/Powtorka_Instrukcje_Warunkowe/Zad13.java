package Powtorka_Instrukcje_Warunkowe;


/*
Zadanie 13
Sprawdź czy liczba wprowadzona jest podzielna przez 3 lub 5.
 */


import java.util.Scanner;

public class Zad13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int a = scanner.nextInt();

        boolean wynik  =  a%5 ==0 || a%3==0;

        System.out.println("Liczba jest podzielna przez 5 lub 3:  "+wynik );


    }



}
