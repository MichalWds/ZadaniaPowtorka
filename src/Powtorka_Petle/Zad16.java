package Powtorka_Petle;

/*
Zadanie 16
Stwórz program, który odczytuje dany napis i wypisuje ile razy w danym napisie
występują małe litery. Przykładowo dla napisu: aAaaBssk wynikiem powinno być
6 (małe a występuje 3 razy, s występuje 2 razy, k występuje 1 raz).
 */

import java.util.Scanner;

public class Zad16 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String wyraz  = scanner.nextLine();
int malelitery =0;
int duzelitery = 0;
        for (int i = 0; i <wyraz.length() ; i++) {

            if(Character.isLowerCase(wyraz.charAt(i))) {

                malelitery++;
            }else {
                duzelitery++;
            }

            }
        System.out.println("male litery: " +malelitery);

        }



    }

