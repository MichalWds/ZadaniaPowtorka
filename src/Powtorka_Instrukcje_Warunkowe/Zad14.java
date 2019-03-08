package Powtorka_Instrukcje_Warunkowe;

import java.util.Scanner;

/*
Zadanie 14
Odczytaj wiek osoby i sprawdź czy osoba jest pełnoletnia czy niepełnoletnia.
 */
public class Zad14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek");
        int age = scanner.nextInt();

        if(age>= 18){
            System.out.println("jestes pelnoletni");
        }else if (age<=0 ){
            System.out.println("Zle  podales ");
        }else if(age<18&& age>0){
            System.out.println("jestes nieletni");
        }



    }



}
