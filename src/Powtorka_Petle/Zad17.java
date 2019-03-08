package Powtorka_Petle;

import java.util.Scanner;

/*
Zadanie 17
Napisz program, który wypisuje co drugą literę imienia.

 */
public class Zad17 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("poda wyraz");
        String wyraz = scanner.nextLine();
        StringBuilder  wyraz2 = new StringBuilder(wyraz);

        for (int i = 1; i <wyraz.length() ; i+=2) {
            System.out.println(wyraz.charAt(i));
        }




    }
}
