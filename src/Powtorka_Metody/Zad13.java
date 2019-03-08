package Powtorka_Metody;
/*
Zadanie 13
Napisz funkcję, która stwierdza, czy zadana jako parametr liczba całkowita jest
liczbą pierwszą.
 */
public class Zad13 {


    public static boolean isPrime(long num){

        double limit = Math.sqrt(num) + 1;

        for (long i = 2; i < limit; i++)

            if( num !=2 && num!=1&& num%i == 0 )

                return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
}
