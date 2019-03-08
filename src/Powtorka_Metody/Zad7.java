package Powtorka_Metody;
/*
Zadanie 7
Napisz funkcję, która wyznacza sumę cyfr liczby całkowitej.
 */
public class Zad7 {

     static int sumofDigits(int n){

     String digits = new Integer(n).toString();

     int sum = 0;
     for ( char number : digits.toCharArray())
     sum = sum + number - '0' ;

    return  sum;

    }
    public static void main(String[] args) {
        System.out.println("suma cyfr liczby to : "+sumofDigits(32) );

    }

}

    /*
           int sum = 0;
//  1245 % 10 , /10  124/10  12

        while (a != 0) {
            sum = sum + (a % 10);
            a /= 10;
        }
        return sum < 0 ? - sum : sum ;

     */