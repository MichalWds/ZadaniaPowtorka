package Powtorka_Instrukcje_Warunkowe;


import java.util.Scanner;

/*
Zadanie 4
Napisz program, który odczytuje wyraz i sprawdza czy wprowadzone imię jest
męskie czy żeńskie.
 */
public class Zad4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoje  niezdrobniale imie ");

        String imie = scanner.next().toLowerCase();

        if(imie.endsWith("a")){
            System.out.println("imie zenskie");
        }else {
            System.out.println("imie meskie");
        }





    }

}
