/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercitazioni;

/**
 *
 * @author davide
 */
public class MatriceEsame {

    public static double[] city_valutation(int[][] A, int n, int m) {
        double[] ris = new double[m];
        int somma;
        int cont;
        for (int j = 0; j < m; j++) {
            somma = 0;
            cont = 0;
            for (int i = 0; i < n; i++) {
                if (A[i][j] > -1) {
                    somma = somma + A[i][j];
                    cont++;
                }
            }
            ris[j] = somma / cont;
        }
        return ris;
    }

    public static int[] more_frequent_clients(int[][] A, int n, int m, int c) {
        int numRisp = 0;
        int[] ris = new int[n];
        // conto  il numero di citt� visitate da c
        int contC = 0;
        for (int j = 0; j < m; j++) {
            if (A[c][j] > -1) {
                contC++;
            }
        }
// conto  il numero di città visitate da gnerici
        int cont;
        int cont1 = 0;
        for (int i = 0; i < n; i++) {
            cont = 0;
            for (int j = 0; j < m; j++) {
                if (A[i][j] > -1) {
                    cont++;
                }
            }
            //qui hai in cont il numero di città visitata d i(generico turista)

            if (cont > contC) {
                ris[cont1] = i;
                cont1++;
            }

        }

        return ris;
    }

    public static int[] more_frequent_cities(int[][] A, int c, int n, int m) {
        int[] città = new int[m];
        int contC = 0;
        int contT = 0;
        for (int i = 0; i < n; i++) {
            if (A[i][c] > -1) {
                contC++;
            }
        }
        int contG = 0;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (A[j][i] > -1) {
                    contG++;
                }
            }
            if (contC < contG) {
                città[contT] = j;
                contT++;
            }
        }
        return città;
    }

    public static int[] city_popolarity(int A[][], int n, int m) {
        int[] clienti = new int[n];

        for (int i = 0; i < n; i++) {
            int cont = 0;

            for (int j = 0; j < m; j++) {
                if (A[i][j] > -1) {

                    cont++;
                }
            }
            clienti[i] = cont;
        }
        return clienti;

    }

    public static void main(String[] args) {
        int A[][] = {
            {-1, 0, -1, -1, 2, -1},
            {2, -1, 5, -1, 1, -1},
            {4, -1, 0, 0, -1, 2},
            {-1, 2, -1, -1, 0, 0}

        };
        
        int n = A.length;
        int m = A[0].length;
        stampa(city_popolarity(A, n, m));
        System.out.println("");
        stampa(more_generous_clients(A,0,n,m));
    }

    public static int[] more_generous_clients(int A[][], int c, int n, int m) {
        double mediaC = media(A, c, n, m);
        int[] votoM = new int[n];
        int cont = 0;
        for (int i = 0; i < n; i++) {
            if (mediaC < media(A, i, n, m)) {
                votoM[cont] = i;
                cont++;
            }
        }
        return votoM;

    }

    public static double media(int A[][], int c, int n, int m) {
        int somma = 0;
        int cont = 1;
        int media = 0;
        for (int i = 0; i < m; i++) {
            if (A[c][i] > -1) {
                somma += A[c][i];
            }

        }
        media = somma / cont;
        return media;
    }

    public static void stampa(int[] daStampare) {
        for (int i = 0; i < daStampare.length; i++) {
            System.out.print(daStampare[i] + " ");
        }
    }
}
