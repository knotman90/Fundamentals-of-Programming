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
import java.util.Random;
import java.util.Scanner;

public class Esercizi20514 {

    public static void stampaPolinomi() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Random random = new Random();
        int K = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            double a = (random.nextDouble() * 2 * K) - K;
            double b = (random.nextDouble() * 2 * K) - K;
            double c = (random.nextDouble() * 2 * K) - K;
            System.out.println(a + "x^2 + " + b + "+ x + " + c);
        }
    }

    public static void massimoPolinomi() {
        Random random = new Random();
        double[] F = new double[11];
        double a = random.nextDouble();
        double b = random.nextDouble();
        double c = random.nextDouble();
        double d = random.nextDouble();
        for (int i = 0; i <= 10; i++) {
            int x = -10 + i * 2;
            double Fx = a * Math.pow(x, 3) + b * Math.pow(x, 2) + c * x + d;
            F[i] = Fx * Math.cos(x);
            System.out.println("Il varore in" + x + " é: " + F[i]);
        }

        double temp = F[0];
        for (int i = 1; i < F.length; i++) {
            if (F[i] > temp) {
                temp = F[i];

            }

        }
        System.out.println("Il massimo è" + temp);

    }

    public static void polinomioNgrado() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int N = random.nextInt() % 10;
        N = Math.abs(N);
                System.out.println("Polinomio di "+ N+" grado");
        
        double[] C = new double[N + 1];
        for (int i = 0; i <= N; i++) {
            double R = random.nextDouble();
            C[i] = R;
        }
        double Fx = 0;
        int x = scanner.nextInt();
        for (int i = 0; i <= N; i++) {
            Fx = Fx + C[i] * Math.pow(x, i);

        }
        System.out.println("Il valore in" + x + "é:" + Fx);
    }

    public static void main(String[] args) {
        //stampaPolinomi();
        //massimoPolinomi();
        polinomioNgrado();
    }

}
