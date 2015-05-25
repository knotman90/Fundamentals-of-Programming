/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercitazioni;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Calcolatrice {
    
    
    public static double areaRett(double base,double  altezza){
        return base*altezza;
    }
    
    public static boolean primo(double a){

        for(int cont=2;cont<=a-1;cont++){
            double resto = a%cont;
            if(resto==0){
                System.out.println("NOn è primo perchè divisibil per "+ cont);
                return false;
            }
            
        }
        return true;
        
    }
    
    public static double sommaDueNumeri(double num1, double num2){
        double somma= num1+num2;
    
        return somma;
   
    
    }

   
    
    public static double potenza(double base, double esp){
        double risultato =1;
        for(int cont=0;cont<esp;cont++){
            risultato=base*risultato;
        }
        return risultato;
    }
    
    public static void main(String[] args){

        System.out.println("area retta = "+ areaRett(12, 45));
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Che operazione vuoi fare?");
        String operazione = scanner.nextLine();
        
        double a=0,b=0,c=0;
        
        a=scanner.nextDouble();
        b=scanner.nextDouble();
         
        
        
        if(operazione.equals("+") == true){
            //fare somma
            c=sommaDueNumeri(a,b);
            
        }else if(operazione.equals("*") == true){
            //fare moltiplicazione
            c=a*b;
        }else if(operazione.equals("-") == true){
            //fare sottrazione
           c=a-b;
        }
        else if(operazione.equals("^") == true){
            //fare potenza
           c=potenza(a,b);
        }
        else if(operazione.equals("p") == true){
            //fare potenza
           boolean isPrimo=false;
           isPrimo=primo(a);
           System.out.println("il numero è primo "+isPrimo);
        }
        
        System.out.println("Il risultato è : " + c);
        
    }
    
}
