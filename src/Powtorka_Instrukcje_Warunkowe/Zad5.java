package Powtorka_Instrukcje_Warunkowe;
import java.lang.*;


/*
  Zadanie 5
    Popraw dany kod, aby wypisywał liczbę największą, a nie najmniejszą.
 */

import java.util.Scanner;

public class Zad5 {


        public static void main(String args[])
        {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int min = a>b ? a : b;     //odwrocenie znaku
            System.out.println(min);
        }
    }


