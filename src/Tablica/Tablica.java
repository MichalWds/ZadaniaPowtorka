package Tablica;

public class Tablica {

    String[] Tab1 = new String[10];

    public static void main(String[] args) {
        int[] tablica = new int[10];
        tablica[0] = 7;
        System.out.println(tablica[0]);


        int tab2[] = {1, 2, 3, 4, 222, 6, 7, 8};
        System.out.println(tab2[5]);

/*
wielowymiarowa
 [0][0] [0][1]
 [1][0] [1][1]
 */

        int[][] tab3 = new int[4][2];
        tab3[2][1] = 222;
        System.out.println(tab3);


        int[][] tab4 = new int[][]{
                {1, 3, 4},
                {5, 7, 8},
                {222, 313, 44}
        };
        System.out.println(tab4[2][0]);

        String[] as = {
                "ass",
                "klass",
                "dupa"
        };

        int i = 0;
        while (i < as.length) {

            System.out.println(as[i]);
            i++;
        }

        i = 0;
        do {
            System.out.println("lubie placuszki");
            i++;
        }
        while (i < 4);


//        int tabl[] = new int[10];
//
//
//        i=0;
//        tabl[0] = 10;
//
//
//        while (tabl[0]==10){
//            i= i +1;
//            System.out.println(tabl.length-1);
//            System.out.println(tabl[i]);
    }

}
