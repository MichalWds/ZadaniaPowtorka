package Powtorka_Instrukcje_Warunkowe;

import java.util.Scanner;

//Zadanie 6
//Napisz kod, który odczytuje 3 liczby i wypisuje na ekran najmniejszą z nich.
public class Zad6 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        if (a<c && a<b) {
            System.out.println("najmniejsza liczba to " + a);

        } else if (b<c && b<a) {
            System.out.println("najmniejsza to " + b);

        } else {
            System.out.println("najmniejsza to  " + c);


        }
    }}








