/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_aula_03;

import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class Ex_aula_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double c, l, a, v;
        Scanner e = new Scanner(System.in);
        System.out.println("Informe as medidas: ");
        System.out.println("Comprimento: ");
        c = e.nextDouble();
        System.out.println("Largura: ");
        l = e.nextDouble();
        System.out.println("Altura: ");
        a = e.nextDouble();
        System.out.println("=========================");
        v = c * l * a;
        System.out.println("O volume é: " + v);
        
        
        
        
    }
    
}
