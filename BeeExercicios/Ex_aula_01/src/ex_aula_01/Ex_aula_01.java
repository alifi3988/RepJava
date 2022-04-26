/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_aula_01;

import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class Ex_aula_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double g, f;
        
        Scanner e = new Scanner(System.in);
        System.out.println("Informe a temperatura em Cº.");
        g = e.nextDouble();
        
        f = (9*g + 160)/5;
        
        System.out.println("Graus Celsius: " + g);
        System.out.println("Fahrenheit: " + f); 
        
    }
    
}
