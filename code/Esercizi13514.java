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
public class Esercizi13514 {

    public static double calcolaMedia(double[] numeri) {
        double risultato = 0;
        for (int i = 0; i < numeri.length; i++) {
            risultato += numeri[i];
        }
        //risultato è la somma dell'array numeri
        risultato = risultato / numeri.length;//questa è la media e posso ritornarla
        return risultato;
    }

    public static void tabelline(int k) {
        for (int i = 1; i <= k; i++) {
            
            for (int j = 1; j <= k; j++) {
                
                int valore = i * j;
                System.out.print(valore+" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        tabelline(3);
        
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        double[] m1 = new double[k];
        double media = 0;

        for (int i = 0; i < k; i++) {
            m1[i] = scanner.nextDouble();
        }

        media = calcolaMedia(m1);
        System.out.println("La media è " + media);

    }

}
