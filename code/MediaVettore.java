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
public class MediaVettore {

    public static boolean multiplo(int a, int k) {
        return (a % k) == 0;
    }

    public static int[] componiVett(int[] v1) {
        int v2[] = new int[v1.length];

        for (int i = 0; i < v2.length; i++) {

            boolean inseriamo = true;
            for (int j = 0; j <= i; j++) {

                if (!multiplo(v1[i], v1[j])) {
                    inseriamo = false;

                }
            }
            if (inseriamo == true) {
                v2[i] = v1[i];
            }

        }
        return v2;
    }

    public static double[] costrusciVettore1(double[] v1, int k) {
        double[] W = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            double a = sommaVettore(v1, 0, i);
            double b = moltiplicaVettore(v1, i+1, v1.length);
            if (k < a + b) {
                W[i] = a + b;
            } else {
                W[i] = a;
            }
        }
        return W;

    }

    public static double moltiplicaVettore(double[] v1, int start, int end) {

        double totale = 1;
        for (int i = start; i < end; i++) {
            totale *= v1[i];
        }
        return totale;
    }

    public static double sommaVettore(double[] v1, int start, int end) {

        double totale = 0;
        for (int i = start; i < end; i++) {
            totale += v1[i];
        }
        return totale;
    }

    public static double mediaVettore(double[] v1, int start, int end) {

        double totale = 0;

        for (int i = start; i < end; i++) {
            totale += v1[i];
        }
        double media = totale / (end - start);
        System.out.println("La media è:" + media + "," + start + " " + end);
        return media;
    }

    public static double[] generaVettore(double[] v1) {
        double[] v2 = new double[v1.length];

        for (int i = 0; i < v2.length; i++) {

            if (mediaVettore(v1, 0, i + 1) <= v1[i]) {
                v2[i] = mediaVettore(v1, 0, i + 1);
            } else {

                v2[i] = sommaVettore(v1, i + 1, v1.length) - sommaVettore(v1, 0, i);
            }

        }
        return v2;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int k=10;

        double[] v1 = new double[d];
        for (int i = 0; i < d; i++) {
            v1[i] = scanner.nextInt();
        }

        double[] generato = costrusciVettore1(v1,k);
        for (int i = 0; i < generato.length; i++) {
            System.out.print(generato[i] + " ");
        }

    }

}
