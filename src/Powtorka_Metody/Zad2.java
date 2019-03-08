package Powtorka_Metody;

import java.util.Scanner;

public class Zad2 {
    /*
    Zadanie 2
Napisz funkcję substract wyznaczającą różnicę dwóch zadanych liczb
całkowitych. Działanie funkcji sprawdź pisząc odpowiedni program.
     */


public static int roznica(int a, int b){

    return a-b;

}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe");
        int c  = scanner.nextInt();
        System.out.println("");
        int d = scanner.nextInt();

        System.out.println("roznica liczb a i b to : " +roznica(c,d));
    }



}
