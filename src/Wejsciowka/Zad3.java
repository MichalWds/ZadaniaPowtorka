package Wejsciowka;

import java.util.Scanner;

/*
Zadanie3. Napisz program, który odczytuje linię
tekstu i wypisuje wszystkie litery z (małe i duże).
 */
public class Zad3 {
    public static void main(String[] args) {
        System.out.println("type word");
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == 'z' || word.charAt(i) == 'Z') {
                System.out.print(word.charAt(i));
            }
        }
    }
}




