package Powtorka_Petle;

import java.util.Scanner;

/*
Zadanie 18
Napisz program, który oblicza największy wspólny dzielnik dwóch liczb.
 */
public class Zad18 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj  1 liczbe");
        int a = scanner.nextInt();
        System.out.println("Podaj 2 liczbe");
        int b = scanner.nextInt();
        int max = 0;
        if (a == b) {
            System.out.println(b);
        }
            for (int i = 1; i <= a && i <= b; i++) {
                if (a % i == b % i) {
                    System.out.println(i);
max = i;
                }

            }   System.out.println("najwiekszy wpsolny dzielnik to: "+max);

    }

}