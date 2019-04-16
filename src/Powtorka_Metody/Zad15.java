package Powtorka_Metody;

import java.util.Scanner;

public class Zad15 {
/*
Zadanie 15
Napisz metodę, która sprawdza czy dany wyraz jako argument jest palindromem.
 */

    static boolean isPalindrome(String word){
        StringBuilder stringBuilder = new StringBuilder(word);
       if( stringBuilder.reverse().toString().equals(word)) {
           return true;
        }else {
           return false;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in );
        System. out .println( "Podaj słowo" );
        String word = scanner.next();
        if ( isPalindrome (word)){
            System. out .println( "Słowo jest palindromem" );
        }
        else {
            System. out .println( "Nie jest palindromem" );
        }
    }
}