package ex_03;

import java.util.Scanner;


public class Ex_03 {

    public static void main(String[] args) {
        
        double m1,m2, m3, cal;
        
        Scanner e = new Scanner(System.in);
        
        System.out.print("Digite a 1º medida: ");
        m1 = e.nextDouble();
        System.out.print("Digite a 2º medida: ");
        m2 = e.nextDouble();
        System.out.print("Digite a 3º medida: ");
        m3 = e.nextDouble();
        
        if(m1 == m2 && m2 == m3){
            System.out.println("Perímetro: " + (m1*m2*m3));
        }else if(m1 != m2 && m3 != m1 && m3 != m2){
            System.out.println("Não é um triângulo!");
        }else{
            System.out.println("Perímetro: " + (m1*m2*m3));
        }
    }
    
}
