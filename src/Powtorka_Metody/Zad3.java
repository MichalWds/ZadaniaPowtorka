package Powtorka_Metody;

import java.util.Scanner;

public class Zad3 {
    /*
    Zadanie 3
Napisz metodę multiply wyznaczającą iloczyn dwóch zadanych liczb całkowitych.
Działanie funkcji sprawdź pisząc odpowiedni program.
     */

public static int iloczyn (int a, int b){
    return a*b;
}

    public static void main(String[] args) {
        System.out.println("podaj liczbe");
    Scanner scanner = new Scanner(System.in);
    int c = scanner.nextInt();
        System.out.println("podaj liczbe b");
    int d = scanner.nextInt();
        System.out.println("iloczyn licz a i b to: "+ iloczyn(c,d));
    }



}
