package Powtorka_Petle;

import java.util.Scanner;

/*
Zadanie 12
Napisz program, który odczytuje wyraz i sprawdza czy wyraz jest palindromem.
 */
public class Zad12 {

    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);


     System.out.println("podaj wyraz");

       String wyraz = scanner.nextLine().toLowerCase();

       String odwrocony = new StringBuilder(wyraz).reverse().toString();

        if(odwrocony.equals(wyraz)){
            System.out.println("jest palindromem");
        }else {
            System.out.println("nie jest palindromem");
        }


    }

}
