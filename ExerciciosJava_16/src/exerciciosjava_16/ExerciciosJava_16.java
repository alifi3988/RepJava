/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosjava_16;

/**
 *
 * @author alifi
 */
public class ExerciciosJava_16 {

    /**
     * @param args the command line arguments
     */
    static void soma(int a, int b){
        int s = a + b;
        System.out.println("A soma é: " + s);
             
    }
    
    static int somaDois(int a, int b){
        int s = a + b;
        
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        soma(1, 5);
        int s = somaDois(1,5);
        System.out.println("O resultado da soma: "+s);
    }
    
}
