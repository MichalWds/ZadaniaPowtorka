package Powtorka_Metody;
/*
Zadanie 10
Napisz metodę, która zwraca maksymalną długość 2 stringów.
maxStringLength(“aaaa”,”sad”) zwróci 4.
maxStringLength(“aaksadui”,”aaa”) zwróci 8.
 */


import java.util.Scanner;

public class Zad10 {


    public static int maxStringLength(String a, String b) {


        if (a.length() > b.length())
            return a.length();
        return b.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wpisz 2 wyrazy, podam ci liczbe znakow w dluzszym");
        System.out.println(maxStringLength(scanner.next(), scanner.next()));
    }
}