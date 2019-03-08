package Powtorka_Instrukcje_Warunkowe;

import java.util.Scanner;

/*
Zadanie 3
Napisz program, który odczytuje wyraz i sprawdza czy wprowadzony wyraz to
Akademia.
 */
public class Zad3 {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz akademia");
        String wyraz = scanner.next();

        boolean sprawdz = wyraz.equalsIgnoreCase("Akademia");

        System.out.println(sprawdz);


        System.out.println("-------------------------------------------");
        System.out.println("Podaj wyraz akademia");
    String wyraz2 = scanner.next();
    if (wyraz2.equalsIgnoreCase("akademia")){
        System.out.println("Dobrze podajes slowo akademia");
    }else {
        System.out.println("zle podajes wyraz");
    }


    }


}
