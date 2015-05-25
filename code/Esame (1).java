/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercitazioni;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Esame {

    public static int sommaDiagonaleP(int M[][], int n) {
        int sommaP = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sommaP += M[i][j];
                }
            }
        }
        return sommaP;
    }

    public static int sommaDiagonaleS(int M[][], int n) {
        int sommaS = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) == n - 1) {
                    sommaS += M[i][j];
                }
            }
        }
        return sommaS;
    }

    public static int sommaDiagonali(int M[][], int n) {
        int sommaG = 0;
        sommaG = sommaDiagonaleP(M, n) + sommaDiagonaleS(M, n) - M[(n - 1) / 2][(n - 1) / 2];
        return sommaG;
    }

    public static int sommacornice(int M[][], int n) {
        int somma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    somma += M[i][j];
                }
            }
        }
        return somma;
    }

    public static boolean cornice(int M[][], int n) {

        if (!(sommacornice(M, n) == M[(n - 1) / 2][(n - 1) / 2])) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int n = 5;
        int[][] M = {
            {1, 2, 3, 4, 5},
            {0, 7, 2, 3, 2,},
            {2, 5, 40, 6, 1},
            {1, 1, 8, 3, 7},
            {4, 0, 2, 0, 5}

        };
        cornice(M, n);
        System.out.println((sommaDiagonali(M, n)));

        System.out.println(sommacornice(M, n));
        System.out.println(cornice(M, n));

        int V[] = {1, 4, 2, 6, 3, 5, 34, 6, 32, 123, 44};
        stampa(V);
        stampa(preferite(M, n, n, 4));
    }

    public static int[] sommaColonne(int[][] M, int n, int m) {
        int[] somme = new int[m];

        for (int j = 0; j < m; j++) {
            int somma = 0;
            for (int i = 0; i < n; i++) {

                somma += M[i][j];
            }
            somme[j] = somma;

        }
        return somme;

    }

    public static int[] preferite(int[][] G, int n, int m, int s) {
        int[] sports = new int[m];
        for (int i = 0; i < m; i++) {
            sports[i] = i;
        }
        int[] voti = new int[m];
        for (int i = 0; i < m; i++) {
            voti[i] = G[s][i];
        }

        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {

                if (voti[i] < voti[j]) {
                    //inverti V[i] con V[j]
                    int K = voti[j];
                    voti[j] = voti[i];
                    voti[i] = K;

                    int K1 = sports[j];
                    sports[j] = sports[i];
                    sports[i] = K1;

                }

            }

        }
        return sports;
    }

    public static boolean ciao(int[] V, boolean[] W) {
        for (int i = 0; i < V.length; i++) {
            if (W[i] == true) {
                for (int j = 0; j < V.length; j++) {

                    if (!(V[i] > V[j])) {
                        return false;
                    }
                }
            }else{
                for (int j = 0; j < V.length; j++) {

                    if (!(V[i] < V[j])) {
                        return false;
                    }
                }
            }
        }
        return true;

    }

    public static int bestSport(int[] V) {
        int max = 0;
        int best = 0;
        for (int i = 0; i < V.length; i++) {
            if (V[i] > max) {
                max = V[i];
                best = i;
            }
        }
        return best;

    }

    public static void stampa(int[] daStampare) {
        for (int i = 0; i < daStampare.length; i++) {
            System.out.print(daStampare[i] + " ");

        }
        System.out.println("");

    }

}
