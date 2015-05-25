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
public class Esercitazione12614 {

    /**
     * Metodo che restituisce un array di interi letti da tastiera(al massimo
     * 100 numeri) : l'utente inserisce i valori e la sequenza termina quando
     * viene inserito un numero negativo
     */
    public static int sottosequenza(int[] V, int k) {
        int cont = 1;
        int max = 0;
        int finish =0;
        for (int i = 1; i < k; i++) {
            if ((V[i] >= V[i - 1])) {
                cont++;
            } else {
                cont = 1;
                
            }
            if (cont > max) {
                max = cont;
                finish=i;
            }
           
        }
        
        
        System.out.println(""+ finish);
        System.out.println(""+ max);

         for (int i = finish  - max+1 ; i < finish+1 ; i++) {
            System.out.print(V[i] + " ");
        }
        
        
        return max;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] V = new int[100];
        int cont = 0;
        for (int i = 0; i < V.length; i++) {
            V[i] = scanner.nextInt();
            if (V[i] < 0) {
                break;
            } else {
                cont++;
            }
        }
        //qui abbiamo V riempito con cont numeri positivi
        int M = sottosequenza(V, cont);
        System.out.println("seq     "+M);
        

        System.out.println("Ho letto " + cont + " numeri prima del negativo");
       

    }

    /*public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Dimensione ");
     int righe = scanner.nextInt();
     int colonne = scanner.nextInt();

     int[][] M1 = new int[righe][colonne];
     for (int i = 0; i < righe; i++) {
     for (int j = 0; j < colonne; j++) {
     M1[i][j] = scanner.nextInt();
     }
     }
     int[][] M2 = new int[colonne][righe];
     for (int i = 0; i < colonne; i++) {
     for (int j = 0; j < righe; j++) {
     M2[i][j] = scanner.nextInt();
     }
     }
     int[][] M3 = MoltiplicazioneMatriciale(M1, M2, righe, colonne);

     for (int i = 0; i < righe; i++) {
     for (int j = 0; j < colonne; j++) {
     System.out.print(M3[i][j] + " ");
     }
     System.out.println("");
     }

     }*/
    public static int[][] MoltiplicazioneMatriciale(int[][] M1, int[][] M2, int righe, int colonne) {
        int[][] M3 = new int[righe][colonne];
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                for (int z = 0; z < colonne; z++) {
                    M3[i][j] += M1[i][z] * M2[z][j];
                }
            }

        }
        return M3;
    }

    public static boolean verificavett(int[] V) {
        boolean verificato = true;
        for (int i = 2; i < V.length; i++) {
            if (!(V[i] >= V[i - 1] + V[i - 2])) {
                verificato = false;
            }
        }

        return verificato;
    }

}
