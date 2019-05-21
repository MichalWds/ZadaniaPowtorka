package Codility;

import java.util.Scanner;

public class Solution {

    public static int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int i = binary.length()-1;
        while(binary.charAt(i)=='0') {
            i--;                   //deleting last chars = 0
        }
        int gap = 0;
        int counter = 0;

        for(; i>=0; i--) {
            if(binary.charAt(i)=='1') {
                gap = Math.max(gap, counter);
                counter = 0;
            } else {
                counter++;
            }
        }
        gap = Math.max(gap, counter);
        return gap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę : ");
        Integer c = scanner.nextInt();
        System.out.println("liczba " + c + " w postaci binarnet to : " + c.toBinaryString(c));
        System.out.println("najwieksza liczba zer (szczelina) to " + Solution.solution(c));
    }
}

