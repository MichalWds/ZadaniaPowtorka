package Powtorka_Instrukcje_Warunkowe;

import java.util.Scanner;

/*
Zadanie 11
Odczytaj dane słowo sprawdź czy słowo zawiera wyraz kajak.
 */
public class Zad11 {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        System.out.println("podaj wyraz");
       String wyraz = scanner.next().toLowerCase();

       if(wyraz.contains("kajak")){
           System.out.println("wyraz zwiera slowo kajak");
       }else {
           System.out.println("wyraz nie zawiera slowa kajak");
       }


    }
}
