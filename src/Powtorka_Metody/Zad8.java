package Powtorka_Metody;

import java.util.Scanner;

/*
Zadanie 8
Napisz funkcję, która stwierdza, czy zadana jako parametr liczba całkowita jest
kwadratem pewnej liczby całkowitej. Liczby będące kwadratami liczb całkowitych
to 1, 4, 9, 16 itd. Wartością funkcji ma być prawda, jeśli liczba spełnia warunek oraz
fałsz w przeciwnym wypadku.
 */
public class Zad8 {


 static boolean  isSquare(int a){
     if (Math.sqrt(a) %1 == 0 && a!=0)
         return  true;
     else
         return false;
}

    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe");

        System.out.println("czy liczba jest kwadratem liczb calkowitych? : " + isSquare(scanner.nextInt()));
    }
}
