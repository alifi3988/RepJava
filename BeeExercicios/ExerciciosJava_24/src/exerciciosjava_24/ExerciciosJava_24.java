/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosjava_24;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author alifi
 */
public class ExerciciosJava_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c, d, m;
        
        DecimalFormatSymbols s  = new DecimalFormatSymbols(Locale.US);
        DecimalFormat f = new DecimalFormat("00.0", s);
        
        Scanner e = new Scanner(System.in);
        
        a = e.nextDouble();
        b = e.nextDouble();
        c = e.nextDouble();
        d = e.nextDouble();
        
        m = ((a * 2) + (b * 3) + (c * 4) + (d * 1))/10;
        
        if(m >= 7){
            System.out.println("Media: " + f.format(m));
            System.out.println("Aluno aprovado.");
        }else if(m < 5){
            System.out.println("Meida: " + f.format(m));
            System.out.println("Aluno reprovado.");
        }else{
            double exame = e.nextDouble();
            m = (exame + m)/2;
            System.out.println("Media: " + f.format(m));
            System.out.println("Aluno em exame.");
            System.out.println("Nota do exame: "+ f.format(exame));
            if(m >= 5){
                System.out.println("Aluno aprovado.");
            }
            System.out.println("");
            
        }
    }
    
}
