package Powtorka_Petle;

import java.util.Scanner;

/*
Napisz program który wygeneruje za pomocą (wielkość wieżyczki podaje
użytkownik)
a )wieżyczkę
*
**
***
****
b) choinkę
*
***
*****
*******
Zadanie 11
 */
public class Zad10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder gwiazdka = new StringBuilder("*");
            int n = scanner.nextInt();

        for (int i = 0; i <n; i++) {

            System.out.println(gwiazdka);
                gwiazdka.append('*');

        }
            /*

            opcja append dodaje znaki w string builderzer, nie musimy wypisywac wszystkich
             */
        String some = "some";
        String space = " ";
        String random = "random";
        String string = "string";
        StringBuilder someSttringBuilder = new StringBuilder();
        someSttringBuilder.append(some);
        someSttringBuilder.append(space);
        someSttringBuilder.append(random);
        someSttringBuilder.append(space);
        someSttringBuilder.append(string);

        String someString = someSttringBuilder.toString();
        System.out.println(someString);

    }
}
