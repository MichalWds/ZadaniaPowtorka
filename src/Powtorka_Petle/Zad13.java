package Powtorka_Petle;

import java.util.Scanner;

public class Zad13 {

/*
Zadanie 13
Napisz program drukujący na ekranie 19 gwiazdek
 */
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    StringBuilder  star = new StringBuilder("*");

    for (int i = 0; i <19; i++) {
        star.append("*");
    }
    System.out.println(star);

}
}
