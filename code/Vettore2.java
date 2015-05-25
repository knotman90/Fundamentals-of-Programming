package esercitazioni;

import java.util.Scanner;

public class Vettore2 {

    public static int[] copiaArray(int[] v1) {
        Scanner scanner = new Scanner(System.in);
        int[] v2 = new int[v1.length];
        System.out.println("Dammi K:");
        int k = scanner.nextInt();
        for (int i = 0; i < v1.length; i++) {

            v2[i] = k * v1[i];
        }

        return v2;
    }

       public static void stampaArray(int[] daStampare) {
        for (int i = 0; i < daStampare.length; i++) {
            System.out.print(daStampare[i]);

        }
        System.out.println("");
        return;

    }
    
    
    public static void main(String[] args) {
        System.out.println("Dimensione array:");
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int[] v1 = new int[d];
        for (int i = 0; i < d; i++) {
            v1[i] = scanner.nextInt();
        }

        int[] v2 = copiaArray(v1);
        
        stampaArray(v2);
    }
}
