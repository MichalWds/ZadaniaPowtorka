package Powtorka_Petle;

import java.util.Scanner;

/*
Zadanie 15
Napisz program, który odczytuje wyraz i wypisuje go w odwrotnej kolejności.
 */
public class Zad15 {

    public static void main(String[] args) {


       Scanner scanner = new Scanner(System.in);
        System.out.println("podaj wyraz");
        String wyraz = scanner.nextLine();
        StringBuilder reverse  = new StringBuilder(wyraz).reverse();


        System.out.println(reverse);
    }
}
