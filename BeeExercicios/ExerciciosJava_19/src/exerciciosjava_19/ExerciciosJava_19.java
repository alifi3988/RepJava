/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosjava_19;

import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class ExerciciosJava_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int ano, meses, dia, total;
        Scanner teclado = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("Informe a sua idade (anos - meses - dias): ");
        System.out.println("ANO: ");
        ano = teclado.nextInt();
        System.out.println("MESES: ");
        meses = teclado.nextInt();
        System.out.println("DIA: ");
        dia = teclado.nextInt();
        System.out.println("===========================================");
        total = (ano * 365) + (meses * 30) + dia;
        System.out.println("Ao total, você tem " + total + " dias");

    }
    
}
