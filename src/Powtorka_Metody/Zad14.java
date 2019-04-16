package Powtorka_Metody;
/*
Zadanie 14
Skorzystaj z wcześniejszej funkcji (zad.11.) do znalezienia liczby od 2 do 10000,
która ma największą liczbę dzielników.
 */
public class Zad14 {


    public static int isDivide(int a) {

        for (int i = 2; i < 10000; i++) {
            if (a % i == 0)
                System.out.printf(" %d ", i);
        }
        return a;

    }

    public static void main(String[] args) {


    }
}
