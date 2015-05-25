/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercitazioni;

import java.util.Scanner;

/**
 *
 * @author davide
 */
public class Esercizi7614 {

    /*public static void stampaArray(int[] daStampare){
     for(int i=0;i<daStampare.length;i++){
     System.out.println(daStampare[i]);
     }
     return ;
     }
    
     public static boolean contiene(int[] S1, int[] S2) {

     for (int i = 0; i <= S1.length - S2.length; i++) {
     boolean contenuto = true;
     for (int j = 0; j < S2.length; j++) {
     if (S1[i + j] != S2[j]) {
     contenuto = false;
     break;
     }
     }
     if (contenuto == true) {
     return true;
     }

     }

     return false;
     }

     public static boolean checkInt() {
     Scanner scanner = new Scanner(System.in);
     int x = scanner.nextInt();
     int y = scanner.nextInt();

     int[] S1 = new int[x];
     for (int i = 0; i < S1.length; i++) {
     S1[i] = scanner.nextInt();
     }
     int[] S2 = new int[y];
     for (int i = 0; i < S2.length; i++) {
     S2[i] = scanner.nextInt();
     }

             

     int[] S3 = new int[S2.length];

     for (int i = 0; i < S2.length; i++) {
            
     S3[i] = S2[S2.length - i - 1];

     }

     stampaArray(S3);
        
        
     if (contiene(S1, S3)) {
     return true;
     } else {
     return false;
     }

     }

     public static void main(String[] args) {
     if (checkInt()) {
     System.out.println("verificato");
     } else {
     System.out.println("NOn verificato");
     }
     }*/
    public static int[][] leggiMatrice(int r, int c) {
        Scanner scanner = new Scanner(System.in);

        int M[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                M[i][j] = scanner.nextInt();
            }
        }
        return M;
    }

    public static void stampaM(int M[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean strisce(int M[][], int r, int c) {

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if ((i % 2 == 0 && M[i][j] == 0) || (i % 2 != 0 && M[i][j] != 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int M[][] = leggiMatrice(r, c);
        stampaM(M, r, c);
        if (strisce(M, r, c)) {
            System.out.println("E' a strisce");
            int maxMatrice = calcolaMassimoRighe(M, r, c);
            System.out.println("Il max è " + maxMatrice);
        } else {
            System.out.println("MI Dispiace non è a strisce.");
        }

    }

    private static int calcolaMassimoRighe(int[][] M, int r, int c) {
        int max = -1000000;
        for (int i = 0; i < r; i++) {
            int somma = 0;
            if (i % 2 == 0) {
                for (int j = 0; j < c; j++) {
                    somma += M[i][j];
                }

                if (somma > max) {
                    max = somma;
                }
            }
        }

        if(max < 0){
            return 0;
        }
        //max > 0
        return max;

    }
}
