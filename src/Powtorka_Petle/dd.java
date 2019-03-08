package Powtorka_Petle;

import java.util.Scanner;

public class dd {
    public static void main(String[] args) {

        System.out.println("Podaj liczbę");

        Scanner odczyt = new Scanner(System.in);

        int digit = odczyt.nextInt();

        for (int i = 1; i <= digit ; i++) {

            if (digit>1 && digit%i ==0 && digit%1 ==0){


                System.out.println("To jest liczba pierwsza");

            }else {

                System.out.println("To nie jest liczba pierwsza");

            }        }    }}

