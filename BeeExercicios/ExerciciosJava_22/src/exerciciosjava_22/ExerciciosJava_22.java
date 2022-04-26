/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosjava_22;

import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class ExerciciosJava_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float IPI, v1, v2, total;
        int c1, c2, q1, q2;
        Scanner t = new Scanner(System.in);
        System.out.println("Informe o valor do IPI (%): ");
        IPI = t.nextFloat();
        System.out.println("======= PEÇA 01 ======= ");
        System.out.println("Informe o código: ");        
        c1 = t.nextInt();
        System.out.println("Informe o valor: ");
        v1 = t.nextFloat();
        System.out.println("Informe a quantidade: ");
        q1 = t.nextInt();
        System.out.println("======= PEÇA 02 ======= ");
        System.out.println("Inform o código: ");
        c2 = t.nextInt();
        System.out.println("Informe o valor: ");
        v2 = t.nextFloat();
        System.out.println("Informe a quantidade: ");
        q2 = t.nextInt();
        System.out.println("======================");
        total = (v1*q1 + v2*q2) / (IPI /100 + 1);
        System.out.println("O valor total será de R$ "+ total);

        
        
    }
    
}
