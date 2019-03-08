package Powtorka_Petle;

import java.util.Random;
import java.util.Scanner;

/*
Zadanie 6
Napisz prostą grę - zadaniem użytkownika będzie zgadnięcie liczby, którą
zainicjujemy w programie (przykładowa liczba 600). W przypadku, gdy liczba
będzie za duża lub za mała, użytkownik otrzyma odpowiednią podpowiedź.
Gramy tak długo dopóki użytkownik zgadnie liczbę.
 */
public class Zad6 {

    public static void main(String[] args) {


        Random random = new Random();

        System.out.println("Podaj liczbe: ");
        Scanner scanner = new Scanner(System.in);

        int random1 = random.nextInt(600);
        int n = scanner.nextInt();
        System.out.println("Zgadnij liczbe: ");

        while (n != random1) {

            n = scanner.nextInt();

            if (n > random1) {

                System.out.println("Podałeś zbyt dużą liczbę!");

            } else if (n < random1) {

                System.out.println("Podałeś zbyt małą liczbę!");

            } else {

                System.out.println("Zgadłeś!");

                break;
            }


        }
    }
    }
