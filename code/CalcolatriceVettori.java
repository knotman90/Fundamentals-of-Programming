
package esercitazioni;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class CalcolatriceVettori {

    
    
    public static double[] scalaVettore(double[] daScalare, double[] fattoriScala){
        double[] risultato =new double[daScalare.length];
        for(int i=0;i<daScalare.length;i++){
            risultato[i] = daScalare[i]*fattoriScala[i];
        }
        return risultato;
    }
    
    public static double prodottoScalare(double[] v1,double[]v2){
        double risultato=0;
        for(int i=0;i<v1.length;i++){
             risultato+=v1[i]*v2[i];
        }
        
        return risultato;
        
    }
    
    public static double[] sommaVettori(double[] k, double[] k2) {
        double[] k3 = new double[k.length];
        for (int i = 0; i < k.length; i++) {
            k3[i] = k[i] + k2[i];
        }
        return k3;
    }

    public static double[] differenzaVettori(double[] k, double[] k2) {
        double[] k4 = new double[k.length];
        for (int i = 0; i < k.length; i++) {
            k4[i] = k[i] - k2[i];
        }
        return k4;
    }
    
    public static void stampaArray(double[] daStampare) {
        for (int i = 0; i < daStampare.length; i++) {
            System.out.print(daStampare[i] + " ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        // parametri dichiarati
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci Vettore: ");
        int k = scanner.nextInt();
        
        double[] v1 = new double[k];
        double[] v2 = new double[k];
        
//lettura primo vettore
        for (int i = 0; i < k; i++) {
            v1[i] = scanner.nextDouble();
        }

        //lettura secondo vettore
        for (int i = 0; i < k; i++) {
            v2[i] = scanner.nextDouble();
        }

        //Comando per eseguire la funzione sommaVettori
        double[] somma = sommaVettori(v1, v2);
        //Comando per eseguire la funzione differenzaVettori
        System.out.println("La somma è: ");
             
        stampaArray(somma);
        double[] differenza = differenzaVettori(v1, v2);
        stampaArray(differenza);
        
        double risultato = prodottoScalare(v1,v2);
        System.out.println("Il prodotto Scalare è :"+risultato);
        
        double[] scalato = scalaVettore(v1,somma);
        stampaArray(scalato);
        
       
        
    }
}
