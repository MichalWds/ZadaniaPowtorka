package Powtorka_Instrukcje_Warunkowe;

import java.util.Scanner;

/*
Zadanie 12
Napisz program, który sprawdza czy wprowadzony wyraz jest kodem pocztowym.
Kod pocztowy musi być w formacie 87-630.
 */
public class Zad12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj kod pocztowy");
        String wyraz = scanner.next();

        if (wyraz.charAt(2)=='-' && wyraz.length()==6 ){
            System.out.println("Podales poprawny kod");
        }else {
            System.out.println("podales niepoprawny kod");
        }

        boolean kod = wyraz.charAt(2)=='-' && wyraz.length()==6;
        System.out.println(kod);
    }


}
