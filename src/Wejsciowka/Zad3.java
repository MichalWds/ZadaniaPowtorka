package Wejsciowka;

import java.util.Scanner;

/*
Zadanie3. Napisz program, który odczytuje linię
tekstu i wypisuje wszystkie litery z (małe i duże).
 */
public class Zad3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj zdanie");
    String zdanie = scanner.nextLine().toLowerCase();
StringBuilder stringBuilder = new StringBuilder(zdanie);

        for (int i = 0; i <zdanie.length() ; i++) {
            if (zdanie.charAt(i) == 'z') {
                System.out.println(zdanie.charAt(i));

            }
        }
        }



    }

