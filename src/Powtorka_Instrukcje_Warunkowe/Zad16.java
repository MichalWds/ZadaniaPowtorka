package Powtorka_Instrukcje_Warunkowe;


import java.util.Scanner;

/*
Zadanie 16
Mówimy, że osoba jest w wieku nastolatka jeśli ma pomiędzy 13 a 18 lat.
Odczytaj 2 liczby oznaczające wiek dwóch osób, wypisz komunikat TAK jeśli 2
osoby są w wieku nastolatka oraz nie jeśli nie są w odpowiednim wieku.
 */
public class Zad16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj wiek 1 osoby");

        int age = scanner.nextInt();

        System.out.println("podaj wiek 2 osoby");
        int age2= scanner.nextInt();

        boolean wynik = age>13 && age<18 && age2>13 && age<18;
        System.out.println("Czy obie osoby sa w wieku nastolenim: "+wynik);



    }




}
