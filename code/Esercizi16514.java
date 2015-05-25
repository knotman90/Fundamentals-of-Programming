/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercitazioni;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author davide
 */
public class Esercizi16514 {

    public static void tuttiPari() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci quanti numeri leggere: ");
        int n = scanner.nextInt();
        System.out.println("Inserisci numeri: ");
        boolean Pari = true;
        for (int i = 0; i < n; i++) {

            int num = scanner.nextInt();
            if ((num % 2 != 0)) {
                Pari = false;
                break;
            }

        }

        if (Pari) {
            System.out.println("I numeri sono pari ");

        }
        if (Pari == false) {
            System.out.println("I numeri sono dispari ");
        }

    }

    public static void tabWhile() {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println("Tabellina");

        int i;
        i = 1;
        while (i <= k) {
            int j = 1;
            while (j <= k) {
                int valore = i * j;
                System.out.print(valore + " ");
                j++;
            }
            System.out.println("");
            i++;
        }

    }

    public static void radiciPolinomio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci i 4 numeri");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        double radice1 = 0, radice2 = 0;
        if (delta > 0) {
            radice1 = (-b + Math.sqrt(delta)) / (2 * a);
            radice2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Le radici sono : " + radice1 + "," + radice2);
        } else if (delta == 0) {
            radice1 = -(b / (2 * a));
            radice2 = radice1;
            System.out.println("Le radici sono : " + radice1 + "," + radice2);
        } else {
            System.out.println("Delta negativo, non le so calcolare!");
        }

    }

    public static void valutaPolinomio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci i 4 numeri");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        int i = -100;
        while (i <= 101) {
            double valore = (a * Math.pow(i, 2) + b * i + c) * Math.cos(i);
            System.out.println("" + i + "," + valore + "");
            i++;
        }

    }

    public static void calcolaMaxMinTreNumeri(boolean maxMin) {
        double a, b, c;
        a = 50;
        b = 687;
        c = 800;
        double temp = a;
        if (maxMin == true) {
            //calcola massimo
            if (b > temp) {
                temp = b;
            }
            if (c > temp) {
                temp = c;
            }

        } else {
            //calcola minimo
            if (b < temp) {
                temp = b;
            }
            if (c < temp) {
                temp = c;
            }
        }

        if (maxMin == true) {
            System.out.println("Il massimo è " + temp);
        }
        if (maxMin == false) {
            System.out.println("Il minimo è " + temp);
        }

    }

    public static void calcolaMaxMinN_Numeri() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Inserisci la dimensione");
        int dim = scanner.nextInt();
        int[] numeri = new int[dim];

        for (int i = 0; i < dim; i++) {
            numeri[i] = random.nextInt() % 100;
            System.out.print(" " + numeri[i]);
        }
        System.out.println("");
        int temp = numeri[0];
        int temp2= numeri[0];
      /*  for (int i = 1; i < numeri.length; i++) {
            if (temp < numeri[i]) {
                temp = numeri[i];
            }
            
             if (temp2 > numeri[i]) {
                temp2 = numeri[i];
            }
            
        }*/
        int i=1;
        while(i < numeri.length){
            if (temp < numeri[i]) {
                temp = numeri[i];
            }
            
             if (temp2 > numeri[i]) {
                temp2 = numeri[i];
            }           
            i++;
        }
        
        System.out.println("Il massimo è "+temp);     
        System.out.println("Il minimo è "+temp2);    
        
    }

    public static void main(String[] args) {
        //tuttiPari();
        //tabWhile();
        //radiciPolinomio();
        //valutaPolinomio();
        //  calcolaMaxMinTreNumeri(true);
        // calcolaMaxMinTreNumeri(false);
        calcolaMaxMinN_Numeri();

    }

}
