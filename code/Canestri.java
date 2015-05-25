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
public class Canestri {

    public static void stampaArray(int[] daStampare){
        for (int i = 0; i < daStampare.length; i++) {
            System.out.print (daStampare[i] +" ");
            
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int[] V = {4, 1, 2, 7, 2};
        stampaArray(V);
        V=potenze(V);
        stampaArray(V);
        System.out.println("La varianza è " + varianza(V));
        System.out.println(verifica_var_pari(V));

    }

    public static int[] potenze(int[] V) {
        for (int i = 0; i < V.length-1; i++) {
            int vi=V[i];
            for (int j = 0; j < V[i+1]; j++) {
                V[i] *= vi;
            }

        }

        return V;
    }

    public static boolean verifica_var_pari(int[] V) {
        double varianza = varianza(V);
        for (int i = 0; i < V.length; i++) {
            if (V[i] > varianza) {
                if (!(V[i] % 2 == 0)) {
                    return false;
                }
            }

        }
        return true;
    }

    public static double varianza(int[] V) {
        double varianza = 0;
        int[] V2 = new int[V.length];
        for (int i = 0; i < V.length; i++) {
            V2[i] = V[i] * V[i];

        }
        //v2 è il quadrato di V
        varianza = media(V2) - (media(V) * media(V));
        return varianza;
    }

    public static double media(int[] V) {
        double media = 0;
        int cont = 0;
        for (int i = 0; i < V.length; i++) {
            if (!(V[i] % 2 == 0)) {
                if (i % 2 == 0) {
                    media += V[i];
                    cont++;
                }
            }
        }
        return (media / cont);

    }

    public static int[] min_canestri_squadra(int[][] C, int n, int m) {//ok
        int[] V = new int[n];
        int min = 0;
        for (int i = 0; i < n; i++) {
            min = C[i][0];
            for (int j = 1; j < m; j++) {
                if (min > C[i][j]) {
                    min = C[i][j];
                    V[i] = min;
                }
            }
        }
        return V;
    }

    public static int[] favorevoli_sud_max(int[][] C) {
        int[] giornataBuone = new int[C[0].length];
        int cont = 0;
        for (int j = 0; j < C[0].length; j++) {
            if ((mediaCanestriNord(C, j) + mediaCanestriNord(C, j) * 0.2) < mediaCanestriSud(C, j)) {
                giornataBuone[cont] = j;
                cont++;
            }

        }
        return giornataBuone;
    }

    public static double mediaCanestriNord(int[][] C, int giornata) {
        double media = 0.0;
        for (int i = 0; i < C.length / 2; i++) {
            media += C[i][giornata];
        }
        media = media / C.length / 2;
        return media;
    }

    public static double mediaCanestriSud(int[][] C, int giornata) {
        double media = 0.0;
        for (int i = C.length / 2; i < C.length; i++) {
            media += C[i][giornata];
        }
        media = media / C.length / 2;
        return media;
    }

    private static boolean esiste(int[] top_mean_squadre, int squadra) {
        for (int i = 0; i < top_mean_squadre.length; i++) {
            if (top_mean_squadre[i] == squadra) {
                return true;
            }
        }
        return false;
    }

    public static int[] top_mean_squadre(int C[][]) {
        int[] top_mean_squadre = new int[C.length];
        int cont = 0;
        for (int j = 0; j < C[0].length; j++) {//per ogni giornata
            int squadra = maxGiornata(C, j);
            if (!esiste(top_mean_squadre, squadra)) {
                top_mean_squadre[cont] = squadra;
                cont++;
            }

        }

        return top_mean_squadre;
    }

    public static int maxGiornata(int[][] C, int giornata) {
        int max = 0;
        int squadra = 0;
        for (int i = 0; i < C.length; i++) {
            if (C[i][giornata] > max) {
                max = C[i][giornata];
                squadra = i;
            }

        }
        return squadra;
    }

}
