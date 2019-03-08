package Powtorka_Petle;

import java.util.Scanner;

/*
Zadanie 8
Napisz program, który prosi o podanie poprawnego hasła( hasło to Polska), tak
długo jak użytkownik nie odgadnie hasła wyświetlany jest komunikat podaj
poprawne hasło.
 */
public class Zad8 {

    public static void main(String[] args) {


        Scanner scanner  = new Scanner(System.in);
     String haslo;
        do {
            System.out.println("podaj haslo: ");
            haslo = scanner.next();

        }while (!haslo.equalsIgnoreCase("Polska"));
                System.out.println("podales poprawne haslo!");
            }




    }

