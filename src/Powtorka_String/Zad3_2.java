package Powtorka_String;

import java.util.Scanner;

public class Zad3_2 {


    public static void main(String[] args) {


        String password = "Akademia";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj haslo");
        scanner.next();
        do{             //Do== warunek      Tą pętlę można zapamiętać następująco "wykonuj instrukcje dopóki warunek jest prawdziwy"
            System.out.println("Podaj haslo jeszcze raz: ");
            password = scanner.next();


        }while (!password.equalsIgnoreCase("Akademia"));
        System.out.println("Dobrze podales");    //while == instrukcja
        /*
        czyli jesli byloby equals akademia, to warunek bylby true, wiec petla wykonywana bylaby non stop az do przerwania czyli np wpisania zlego
        hasla. Poprawna werjsa jest taka, ze warunek zaprzeczajacy (czyli u nas porzadany, prawdziwy, [paradolsalnie] przerywa i konczy petle
         */




    }

    }


