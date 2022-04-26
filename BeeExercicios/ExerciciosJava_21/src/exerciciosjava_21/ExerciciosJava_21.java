/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosjava_21;

import java.util.Scanner;

/**
 *
 * @author alifi
 */



public class ExerciciosJava_21 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float salario, aumento;
        Scanner ler = new Scanner(System.in);
        
        System.out.printf("Informe o salarío: R$ ");
        salario = ler.nextInt();
        aumento = (salario * 1) / 100;
        salario = salario + aumento;
        System.out.println("O salário foi para R$ " + salario);
    }
    
}
