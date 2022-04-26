    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_salario;

import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class Ex_Salario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float salario;
         Scanner teclado = new Scanner(System.in);      
         Integer numero = teclado.nextInt();
         Integer horas = teclado.nextInt();
         
         salario = numero * horas;
         
         System.out.println("NUMBER = " + numero);
         System.out.printf("SALARY = U$ %.2f", salario);
        
  
    }
    
}
