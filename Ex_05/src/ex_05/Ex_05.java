package ex_05;

import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {
    
        Scanner e = new Scanner(System.in);
        int n1, maior = 0, i = 0;
        
        System.out.println("------------------------------");
        System.out.println("informe os números pedido: ");
        while(i < 3){
            System.out.print("Número " + i + ": ");
            n1 = e.nextInt();
            if(n1 > maior){
                maior = n1;
            }
        }
        System.out.println("------------------------------");
    }
    
}
