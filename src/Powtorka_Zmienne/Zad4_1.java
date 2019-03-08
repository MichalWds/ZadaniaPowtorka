package Powtorka_Zmienne;

import java.util.Scanner;

public class Zad4_1 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("podaj liczbe: ");

        int i  = sc.nextInt();
        int last = i%10;
/*
Modulo, system dziesiatkowy.   bo  141  to 1x 10^2 + 4x10  1x10^0 czli modulo 13455 % 10  to 5

 */

        System.out.println(last);


    }
}

