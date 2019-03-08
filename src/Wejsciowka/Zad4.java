package Wejsciowka;
/*
Zadanie4. Napisz program, który wypisuje
wszystkie liczby od 5 do 100*1000, które mają
dokładnie 4 dzielniki.
 */
public class Zad4 {

    static int numberOfDivisors(int n) {

        int score = 0;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0)

                score++;

        }

        return score;

    }

    public static void main(String[] args) {

        for (int i = 5; i <= 100 * 1000; i++) {

            if (numberOfDivisors(i) == 4) {

                System.out.println(i);

            }

        }

    }
}

