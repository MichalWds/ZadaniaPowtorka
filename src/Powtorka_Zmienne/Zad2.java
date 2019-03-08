package Powtorka_Zmienne;

import java.util.Scanner;

/*
Zadanie 2 . Napisz program, który odczytuje wyraz i wypisuje 2 pierwsze
litery.
 */
public class Zad2 {

    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

String password = scanner.next();

        System.out.println(password.charAt(0) +""+ password.charAt(1));




    }
}
