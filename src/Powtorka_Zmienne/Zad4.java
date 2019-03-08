package Powtorka_Zmienne;

import java.util.Scanner;

/*
Zadanie 4. Napisz program, który odczytuje liczbę i pokazuje na ekran
ostatnią cyfrę danej liczby.
 */
public class Zad4
{

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.println("podaj liczbe: ");

        String liczba  = sc.next();

        System.out.println("ostatnia cyfra twojej liczby to : " + liczba.charAt(liczba.length()-1) );



    }


}
