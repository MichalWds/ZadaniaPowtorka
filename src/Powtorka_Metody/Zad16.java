package Powtorka_Metody;
/*

 */
public class Zad16 {

    static boolean isPesel(String pesel) {
        if (pesel.length() != 11 )
            return false ;
        for ( int i = 0 ; i < pesel.length(); i++) {
            if (!Character. isDigit (pesel.charAt(i)))
                return false ;
        }
        return true ;
    }
    public static void main(String[] args) {
        System . out .println( isPesel ( "87125080669" ));
    }
}
