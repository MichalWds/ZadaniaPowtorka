package Powtorka_Petle;

import java.util.Scanner;

public class Zad10_1 {
/*
b) choinkę
   *
  ***
  *****
  *******
 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        StringBuilder stars = new StringBuilder("*");

        for (int i = 0; i <=n; i++) {
            System.out.println(stars);
            stars.append("*");

        }

        System.out.println("choinka");
        StringBuilder spaces = new StringBuilder();

        stars = new StringBuilder("*");
        for (int i = 1; i <=n; i++) {
            spaces.append(" ");

        }

        for (int i = 1; i <=n-1; i++) {
            System.out.print(spaces);
            System.out.println(stars);
            stars.append("**");
            if (spaces.length() != 0)
                spaces.deleteCharAt(0);
    }
}}
