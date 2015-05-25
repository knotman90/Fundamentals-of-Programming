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
public class Esercitazione4614 {

    public static boolean contiene(String S1, String S2) {
         
        for (int i = 0; i <= S1.length() - S2.length(); i++) {
       boolean contenuto = true;
            for (int j = 0; j < S2.length(); j++) {
                if (S1.charAt(i + j) != S2.charAt(j)) {
                    contenuto = false;
                    break;
                }
            }
            if(contenuto==true){
                return true;
            }

        }

        return false;
    }

    public static boolean checkstringhe() {
        Scanner scanner = new Scanner(System.in);
        String S1 = new String();
        String S2 = new String();
        S1 = scanner.nextLine();
        S2 = scanner.nextLine();
        String S3 = new String();

        for (int i = 0; i < S2.length(); i++) {
            S3 += S2.charAt(S2.length() - i - 1);

        }

        System.out.println(S3);

        if (contiene(S1, S3)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        if (checkstringhe()) {
            System.out.println("verificato");
        } else {
            System.out.println("NOn verificato");
        }
    }

}
