package Powtorka_Instrukcje_Warunkowe;

import java.util.Scanner;

public class Zad7 {

/*
Zadanie 7
Odczytaj wyraz i sprawdź czy ostatnia litera to M bądź m.
 */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String wyraz = scanner.next();

      if (wyraz.charAt(wyraz.length()-1)== 'M'){
          System.out.println("konczy sie na M");
        }else if (wyraz.charAt(wyraz.length()-1) =='m'){
          System.out.println("konczy sie na  m");
      }else{
          System.out.println("nie zawiera M na koncu");
      }




    }


}
