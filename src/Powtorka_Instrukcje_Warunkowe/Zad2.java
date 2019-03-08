package Powtorka_Instrukcje_Warunkowe;

import java.util.Scanner;

/*
Zadanie 2
Napisz program, który sprawdza czy dana wprowadzona liczba jest podzielna przez 3
 */
public class Zad2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int a = scanner.nextInt();

        if (a%3==0)
            System.out.println("Jest podzielna przez 3");
        else
            System.out.println("jest niepodzielna przez 3");

int b = scanner.nextInt();
boolean liczba = b%3==0;
        System.out.println(liczba);




    }

}
