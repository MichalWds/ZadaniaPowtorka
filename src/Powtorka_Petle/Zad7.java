package Powtorka_Petle;

import java.util.Random;

/*
Zadanie 7
Napisz program, który losuje 6 liczb z Dużego Lotka.
 */
public class Zad7 {

    public static void main(String[] args) {

        Random random = new Random();

        int a = random.nextInt(49);

        for (int i = 1; i < 7; i++) {

        System.out.println(random.nextInt(49));



    }

}


}
