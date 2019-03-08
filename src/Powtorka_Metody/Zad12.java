package Powtorka_Metody;
/*
Zadanie 12
Napisz funkcję, która stwierdza, czy zadana jako parametr liczba całkowita jest
sześcianem pewnej liczby naturalnej.
 */
public class Zad12 {

   public static boolean isCube(double a){

       for (int i = 1; i <a ; i++) {
           if(Math.cbrt(a)%1==0)
               return true;
       }


      return false;
   }

    public static void main(String[] args) {
        System.out.println(isCube(1000));
    }

}
