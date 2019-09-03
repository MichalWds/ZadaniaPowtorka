package Wejsciowka;
/*
Zadanie1. Napisz program, który wypisuje liczby
od 5 do 2000, które są podzielne przez 3.
 */
public class Zad1 {

    public static void main(String[] args) {
        for (int i = 5; i <2000 ; i++) {
            if(i%3==0){
                System.out.println(i);
            }
        }
    }
}
