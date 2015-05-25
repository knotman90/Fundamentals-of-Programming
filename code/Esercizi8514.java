package esercitazioni;

import java.util.Scanner;

/**
 *
 * @author davide
 */
public class Esercizi8514 {

    public static void stampaArray(double[] daStampare){
        for(int i=0;i<daStampare.length;i++){
            System.out.println(daStampare[i]);
        }
         return ;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // creare due array di dimensione K (array1 e array2).
        int k = scanner.nextInt();
        double[] array1 = new double[k];
        double[] array2 = new double[k];

        //Leggi K numeri da tastiera e assegnali ad array1
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Inserisci l'"+i+" numero");
            array1[i]=scanner.nextDouble();
        }
        //in questo punto array1 ha tutte le celle riempite con valori che l'utewnte ha inserito da tastiera
        for(int i=0;i<array1.length;i++){
            /*(k-i) e non k soltanto perchè altrimenti utilizzo un indice non 
            valido alla prima iterazione quando i vale 0 -> (k-0)=k che non è un indice buono in un array di dimensione k.*/
            //array2[i]=array1[i]; 
        array2[i]=array1[(k-i)-1];//copia in ordine inverso
        }
        //array2 ha le celle riempite con gli stessi valori di array1
       
//Comando per eseguire la funzione stampaArray
        System.out.println("Array1: ");
        stampaArray(array1);
        System.out.println("Array 2:");
        stampaArray(array2);
        
    }

}
