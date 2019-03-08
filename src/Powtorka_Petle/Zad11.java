package Powtorka_Petle;

/*
Zadanie 11
Odczytaj wyraz i wypisz wszystkie cyfry występujące w wyrazie.
 */

import java.util.Scanner;

public class Zad11 {

    public static void main(String[] args) {


        Scanner scanner  = new Scanner(System.in);

        System.out.println("Podaj wyraz ");

        String wyraz = scanner.nextLine();

        for (int i = 0; i <wyraz.length() ; i++) {

            if(Character.isDigit(wyraz.charAt(i))){
                System.out.println(wyraz.charAt(i));

            }else {
                continue;
            }



        }





    }


}
