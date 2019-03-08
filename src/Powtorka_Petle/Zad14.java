package Powtorka_Petle;

import java.util.Scanner;

public class Zad14 {

/*
Zadanie 14
Napisz program, który odczytuje liczbę i sprawdza czy liczba jest pierwsza czy
złożona.
 */
    public static void main(String[] args) {


        System.out.println("Podaj liczbe");
        Scanner scanner = new Scanner(System.in);


        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        boolean liczba = true;



        for (int i = 2; i <= Math.sqrt(number); i++) {

            if (number % i == 0) {

                liczba = false;

            }

        }

        System.out.println("Liczba pierwsza: " + liczba);

    }

}


