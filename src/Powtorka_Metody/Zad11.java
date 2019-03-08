package Powtorka_Metody;

/*
Zadanie 11
Napisz funkcję, która odczytuje jako argument liczbę i wypisuje liczbę dzielników.
 */
public class Zad11 {

    public static int allDividers(int a) {

        for (int i = 1; i <= a; i++)
            if (a % i == 0)                         // f("%d) funkcja wydrukuj dzielniki
                System.out.printf("%d ",i );

        return a;
    }

    public static void main(String[] args) {
        System.out.println(allDividers(21));

    }


}
