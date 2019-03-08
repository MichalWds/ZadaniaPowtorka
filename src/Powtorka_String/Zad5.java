package Powtorka_String;

import java.util.Scanner;

public class Zad5 {
/*
Zadanie 5. Napisz program, który odczytuje wyraz i sprawdza czy pierwsza
litera to A
Dane:
Adam
Wynik:
true
Dane2:
Piotr
Wynik:
false
 */
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.println("podaj haslo");
    String password = scanner.next().toLowerCase();

    if (password.toLowerCase().charAt(0)=='a'){
        System.out.println("zaczynasie na a:     " + true);
    }else {
        System.out.println("nie zaczyna sie na a:    " + false);
    }




    }

}
