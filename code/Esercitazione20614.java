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
public class Esercitazione20614 {
    
    //aggiungi contatore e inserisci elementi del triangolo in un array che restituiscidalla funzione
    public static void triangoloSuperiore(int M[][], int m, int n){
       
    
        for(int i=0;i<m/2;i++){
            for(int j=i;j<n-i;j++){
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }       
    }
    
    
    
    //trignaolo inferiore
       public static void triangoloInferiore(int M[][], int m, int n){
       
    
        for(int i=m/2;i<m;i++){
            for(int j=(m/2)-(m-i);j<(m/2)+(m-i);j++){
                System.out.println(M[i][j]);
            }
        }       
    }
    
       
       //trignaolo destro e sinistro
    
    
    
    
    public static boolean texture(char[]V1 ,char[]V2){
        boolean verifica=true;
        for(int i=0;i<V1.length;i++){
            if(!(V2[i%4]==V1[i])){
                verifica =false;
            }
        }
        return true;
    }

    public static boolean verificaVettori(int[] v1, int[] v2, int d) {
        boolean verifica = true;

        if (v2[0] > 0 || v2[d - 1] > 0) {
            verifica = false;
            
        }

        
        for (int i = 1; i < d - 1; i++) {
            int media = (v1[i] + v1[i + 1] + v1[i - 1]) / 3;
            if (!(v2[i] == media)) {
              verifica = false;
            }

        }

        return verifica;
    }

    public static int somma(int[] V, int k, int x) {
        int somma = 0;
        for (int i = 0; i < V.length; i++) {

            if (V[i] < (x / 2 - k) || V[i] > (x / 2 + k)) {
                somma = somma + V[i];
            }
        }
        return somma;
    }

    public static boolean check_4(int[] V, int[] W, int k) {
        boolean verifica = true;
        for (int i = 0; i < W.length; i++) {
            if (!(V[i] > somma(W, k, V[i]))) {
                verifica = false;
                break;
            }

        }

        return verifica;

    }

}
