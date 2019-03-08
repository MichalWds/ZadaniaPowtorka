package Powtorka_Instrukcje_Warunkowe;

import java.util.Scanner;

public class Zad1 {

    /*
    Zadanie 1
Napisz program, który sprawdzi czy wprowadzona liczba jest większa od 5.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbe");

        int liczba = sc.nextInt();

        if (liczba>5)
            System.out.println("liczba jesty wieksza od 5");
        else
            System.out.println("liczba jest kurwa mniejsza od 5");

       int a = sc.nextInt();
       boolean bigger = a > 5;
        System.out.println(bigger);




    }


}
