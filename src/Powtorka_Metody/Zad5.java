package Powtorka_Metody;

/*
Zadanie 5
Napisz metodę, która ma trzy parametry formalne a, b, c będące liczbami
całkowitymi. Funkcja zwraca prawdę, jeśli zadane liczby są liczbami
pitagorejskimi oraz fałsz w przeciwnym wypadku. Liczby pitagorejskie spełniają
warunek: a*a+b*b=c*c.
 */

import java.util.Scanner;

public class Zad5 {

    static boolean trzyparametry(int a, int b, int c) {

        if(a*a + b*b ==c*c || a*a+c*c==b*b || c*c + b*b ==a*a)
           return true;
return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 3 liczby");
        int c= scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        System.out.println("czy liczby sa pitagorejskie: "+ trzyparametry(c,d,e));




        }

    }


