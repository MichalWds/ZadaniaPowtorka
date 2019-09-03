package Powtorka_Zmienne;

/*

 */
public class Zad8 {

    public static void main(String[] args) {

        int a = 10;
        int b = 12;
        double c = 14.2;
        double d = 15.1;
        System.out.println(a / (double) b);

        a -= 2;
        System.out.println(a);

        System.out.println(b++);
        System.out.println(b);


        boolean isTrue = 4 == 2;
        System.out.println(isTrue);

        int z = 2000;
        switch (z) {

            case 1000:
                System.out.println("a= 1000 ");
                break;
            case 2000:
                System.out.println("a= 2000");
                break;
            default:
                System.out.println("a = ani 1000 ani 2000" + z);

        }

    }
}





