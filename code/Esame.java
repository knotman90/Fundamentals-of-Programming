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
public class Esame {

    public static boolean check_2(int[] V, int[] W, int k) {

        for (int i = 0; i < V.length; i++) {
            if (!(V[i] > somma(W, W.length, V[i], k))) {
                return false;
            }
        }
        return true;
    }

    public static int somma(int[] V, int n, int x, int k) {
        int somma = 0;
        for (int i = 0; i < n; i++) {
            if (i > (x / 2 - k) && i < (x / 2 + k)) {
                somma = somma + V[i];

            }
        }
        return somma;
    }

    public static boolean verifica(double[] V, int n, int a) {
        double r = V[1] / a;
        for (int i = 0; i < n; i++) {
            if (V[i] != a * Math.pow(r, i)) {
                return false;
            }
        }
        return true;

    }

public static void main (String [] args){
double [] V = {1.0, 2.0, 5.0, 8.0, 16.0, 32.0};
int a= 1;
    System.out.println(""+verifica(V,V.length,a));

}
        
        }