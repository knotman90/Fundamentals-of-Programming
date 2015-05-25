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
public class Arrayl {
    
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Dammi dimensione array");
int dimensione=scanner.nextInt();        
        String[] numeri = new String[dimensione];
        
        
        
        for(int i=0;i<dimensione;i++){
            System.out.println("Dammi il "+i + " esimo numero");
            numeri[i]= scanner.nextLine();
        }
   
        for(int i=0;i<dimensione;i++){
            System.out.println("il "+i+"esimo numero è"+numeri[i]);
        }
        
        
    }
    
}
