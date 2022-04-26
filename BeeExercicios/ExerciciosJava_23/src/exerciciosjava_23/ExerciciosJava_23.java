/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosjava_23;

import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class ExerciciosJava_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nomes[] = new String[10];
        Scanner entrada= new Scanner(System.in);
        for(int i = 0; i<10;i++){
            System.out.println("Informe o " + (i+1) + "º nome: ");
            nomes[i] = entrada.next();
        }
        
        for(int i = 0; i < 10; i++){
            System.out.println((i+1) + "º nome: " + nomes[i]);
            
        }
        
    }
    
}
