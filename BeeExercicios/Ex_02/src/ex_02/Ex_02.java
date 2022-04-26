package ex_02;

import java.util.Scanner;

public class Ex_02 {


    public static void main(String[] args) {
        
        double m1,m2,cal;
        
        Scanner e = new Scanner(System.in);
        
        System.out.print("Digite a largura: ");
        m1 = e.nextDouble();
        System.out.print("Digite a altura: ");
        m2 = e.nextDouble();
        
        cal = m1*m2;
        System.out.println("Medida: " + cal);
        if(m1 < 1.5){
            System.out.println("Essa cortina será barra/vinco");
        }else if(m1 > 1.5 && m1 < 2.80){
            System.out.println("Essa cortina será lateral");
        }else{
            System.out.println("Essa cortina será barra");
        }
    }
    
}
