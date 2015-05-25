package esercitazioni;

import java.util.Scanner;

public class SimmetriaEInversione {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dimensione vettore:");
        int d = scanner.nextInt();
        int[] v1 = new int[d];
        for (int i = 0; i < d; i++) {
            v1[i] = scanner.nextInt();

        }

        boolean simmetrico = true;
        for (int j = 0; j < v1.length; j++) {
            if (v1[j] != v1[v1.length - j - 1]) {
                simmetrico = false;

            }
        }

        
        
        
        stampaArray(v1);
        if (simmetrico == true) {
            System.out.println("Il vettore è simmetrico");
        } else {
            System.out.println("Il vettore nonè  simmetrico");
            System.out.println("Il vettore invertito è:");
            for (int i = 0; i < v1.length/2; i++) {
                int temp = v1[i];

                v1[i] = v1[v1.length - i - 1];

                v1[v1.length - i - 1] = temp;

            }
            
            stampaArray(v1);

        }
        
        
        
        
    }
    
    
       public static void stampaArray(int[] daStampare) {
        for (int i = 0; i < daStampare.length; i++) {
            System.out.print(daStampare[i]);

        }
        System.out.println("");
        return;

    }

}
