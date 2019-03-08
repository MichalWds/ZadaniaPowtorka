package Powtorka_Metody;

import java.util.Scanner;

/*
Zadanie 4
Napisz metodę divide wyznaczającą iloraz dwóch zadanych liczb całkowitych.
Działanie funkcji sprawdź pisząc odpowiedni program. Dla chętnych *- Napisz
metodę z obsługą błędów.
 */
public class Zad4 {

    public static double dzielenie(double a,double b){

            if(b<=0){
                System.out.println("Nie dzielimy przez 0");
            }

        return a/b;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe a");
        double c =scanner.nextInt();
        System.out.println("podaj liczbe b");
        double d = scanner.nextInt();
if (d==0) {
    System.out.println("Nie dzilimy przez 0!");

}else {
    System.out.println("iloraz z liczb a i b to : " + dzielenie(c,d));
}

    }



}
