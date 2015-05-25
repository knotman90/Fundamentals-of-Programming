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
public class SommaKNumeri {

    public static double sommaNumeri(int dim, double[] nums) {
        //dim è la dimensione di nums
        double somma = 0;
       
        for (int i = 0; i < dim; i++) {
            if (nums[i] % 2 != 0) {
                somma = somma + nums[i];
            }
        }
        
        return somma;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dammi la dimensione:");
        int k = scanner.nextInt();
        double[] numeri = new double[k];
int i=3;
        for (i=0; i < k; i++) {

            System.out.println("Dammi il " + i + "esimo numero");
            numeri[i] = scanner.nextDouble();
        }

        System.out.println("LA somma è :" + sommaNumeri(k, numeri));

    }

}
