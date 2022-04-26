/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_aula_02;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class Ex_aula_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double c,f;
        
        Scanner e = new Scanner(System.in);
        DecimalFormatSymbols s = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("00", s);
        
        System.out.println("Informe a temperatura em Fº");
        f = e.nextDouble();
        
        c = ((f-32) * 5/9);
        
        System.out.println("Fahrenheit: " + df.format(f));
        System.out.println("Graus Celsius: " + df.format(c));
        
        
        
        
        
    }
    
}
