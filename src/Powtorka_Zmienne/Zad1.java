package Powtorka_Zmienne;

import java.util.Scanner;

/*
Zadanie 1 . Napisz program, który odczytuje 2 liczby i oblicza średnią z liczb.
 */
public class Zad1 {


    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

      System.out.println("podaj liczbe a: ");
     int a  = scanner.nextInt();

        System.out.println("podaj liczbe b: ");

        int b =  scanner.nextInt();

        System.out.println("srednia z twoich liczb to: "+ (a+b)/2.0);







    }
}
