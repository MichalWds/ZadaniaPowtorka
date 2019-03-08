package Powtorka_Zmienne;


import java.util.Scanner;

/*
Zadanie 5. Napisz program, który odczytuje liczbę i na ekran wypisuje
odwrotność danej liczby.
 */
public class Zad5 {

/*
the step
1. num =325 != 0
2. reversenum = 0*10=0
3. reversenum = 0+(325%10) = 0+5=5
4. num = 325/10 = 32
5. num =32 !=0
6. reversenum = 5 *10 = 50
7. reversenum = 50 + (32 % 10) = 50+2=52
8. num=32/10 = 3
9 num = 3 != 0
10. reversenum = 52 *10 =520
11. reversenum = 520 + (3 % 10) = 520+3 = 523
12. num = 3/10 =0
final num =0 return false, so we get the reverse number 523.
 */

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe : ");
        int num = scanner.nextInt();
        int Reverse =0;
        while( num != 0 )
        {
            Reverse = Reverse * 10;
            Reverse = Reverse + num%10;
            num = num/10;
        }

        System.out.println("Reverse of specified number is: "+Reverse);
    }
}

