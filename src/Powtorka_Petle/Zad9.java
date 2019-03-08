package Powtorka_Petle;

import java.util.Scanner;

/*
Zadanie 9
Napisz program, który odczytuje n i oblicza n!.
 */
public class Zad9 {


    private static int silnia(int i)
    {
        if (i < 1)
            return 1;
        else
            return i * silnia(i - 1);
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(n*silnia(n-1));



    }
}
