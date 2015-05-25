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
public class FattorialeArray {

    public static int fattoriale(int num){
        if(num<0){
            System.out.println("Fattoriale NON esiste");
            System.exit(-1);
        }else{
            //num >=0
            int fatt=1;
            for(int i=1;i<=num;i++)
                fatt*=i;
            
            return fatt;
        }
        
        return 0;//questa riga non viene mai eseguita
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Immetti la dimensione dell'array");
        int k = scanner.nextInt();
        int[] array1 = new int[k];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Inserisci l'"+i+" numero");
            array1[i]=scanner.nextInt();
        }
        
        //il meno uno nella condizione del for è dovuto al fatto che c'è il <= e non il < stretto.
        //gli indici dell'ìarray vanno sempre da 0 a k-1 dove k è la dimensione dell'array
        for(int i=0;i<=array1.length-1;i++){
            System.out.println("il fatt di "+array1[i]+" è "+fattoriale(array1[i]));
        }
        
        

    }

}
