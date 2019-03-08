package Powtorka_String;

import java.util.Scanner;

public class Zad6 {

/*
Zadanie 6. Odczytaj wyraz i wypisz na ekran wartość true lub false w
zależności od tego czy wyraz zawiera w sobie napis kot.
 */


public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("podaj wyraz");

    String haslo  = scanner.next().toLowerCase();

    boolean JesliZawieraKOT = true;
    System.out.println(haslo.contains("kot"));
/*
  boolean JesliZawieraKOT = haslo.contains("kot");
    System.out.println(JesliZawieraKOT);
 */

}

}
