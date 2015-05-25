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
public class Esercitazione2_7_14 {
    
    public static void stampaArray(int[] stampare){
        for(int i=0;i<stampare.length;i++){
            System.out.print(" "+stampare[i]);
        }
        System.out.println("");
    }
    
    public static void main(String[] args){
        int C[][]= {
            {10,22,33,4},
            {12,13,14,16},
            {100,112,212,3},
            {100,210,102,3}
        };
        
        stampaArray(canestri_squadra(C));
        stampaArray(favorevoli_sud(C));
       stampaArray( squadre_top(C));
        
        
    }

    public static int [] min_canestri_giornata (int[][]C){
    int n = C.length;
        int m = C[0].length;
        int[] canestri = new int[m];
        for(int j=0; j<m; j++){
           canestri [j] = minimoCanestri(C, j);
        
        }return canestri;
    
    }
    
    public static int minimoCanestri (int [][]C, int giornta){
        int min =10000;
        for(int i=0; i<C.length; i++){
            if (min > C[i][giornta])
                min = C[i][giornta];
            
         
        
        }return min;
    }
    
     public static int [] squadre_migliorate_max (int[][]C){
     }
     
    



public static int massimoSquadraA (int [][]C, int squadra){
    int max=0;
    for(int j=0; j<C[0].length/2; j++){
    if (max< C[squadra][j])
        max = C[squadra][j];
    }return max;
    
    }

    
    public static int massimoSquadraR (int [][]C, int squadra){
    int max=0;
    for(int j=C[0].length; j<C[0].length; j++){
    if (max< C[squadra][j])
        max = C[squadra][j];
    }return max;
    
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static int[] canestri_squadra(int[][] C) {
        int n = C.length;
        int m = C[0].length;
        int[] canestri = new int[n];
        for (int i = 0; i < n; i++) {// per ogni squadra
            for (int j = 0; j < m; j++) {//per ogni giornata
                canestri[i] += C[i][j];
            }
        }

        return canestri;

    }

    public static int[] favorevoli_sud(int[][] C) {
        int[] giornataBuone = new int[C[0].length];
        int cont = 0;
        for (int j = 0; j < C[0].length; j++) {//per ogni giornata
            if ((mediaCanestriNord(C, j)+mediaCanestriNord(C, j)*0.2) < mediaCanestriSud(C, j)) {
                giornataBuone[cont] = j;
                cont++;
            }

        }
        return giornataBuone;
    }

    
    private static boolean gia_presente(int[] topSquadre, int squadra) {
        for(int i=0;i<topSquadre.length;i++){
            if(topSquadre[i]==squadra){
                return true;
            }
        }
        return false;
    }
    
    public static int[] squadre_top(int C[][]){
         int[] topSquadre = new int[C.length];
         int cont=0;
         for (int j = 0; j < C[0].length; j++) {//per ogni giornata
             int squadra = maxGiornata(C, j);
             if(!gia_presente(topSquadre,squadra)){
                 topSquadre[cont] = squadra;
                 cont++;
             }
             
         }
         
         return topSquadre;
    }
    
    
    
    public static int maxGiornata(int[][]C,int giornata){
        int max = 0;
        int squadra=0;
        for(int i=0;i<C.length;i++){
            if(C[i][giornata] > max){
                max=C[i][giornata] ;
                squadra=i;
            }
            
        }
        return squadra;
    }
    
    
    public static double mediaCanestriNord(int[][] C, int giornata) {
        double media = 0.0;
        for (int i = 0; i < C.length / 2; i++) {//per ogni squadra
            media += C[i][giornata];
        }
        media = media / C.length / 2;
        return media;
    }

    public static double mediaCanestriSud(int[][] C, int giornata) {
        double media = 0.0;
        for (int i = C.length / 2; i < C.length; i++) {//per ogni squadra
            media += C[i][giornata];
        }
        media = media / C.length / 2;
        return media;
    }

 

}
