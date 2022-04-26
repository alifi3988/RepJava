
package ex_01;

import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {
        
        double n1, n2, media;
        Scanner e = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        n1 = e.nextDouble();
        System.out.print("Digite a Segunda nota: ");
        n2 = e.nextDouble();
        
        media = (n1+n2)/2;
        
        System.out.println("Nota: " + media);
        if(media >= 6){
            System.out.println("PARABÉNS!  Você  foi aprovado!");
            
        }else{
            System.out.println("Voce foi reprovado!!! Estude mais...");
        }
        
    }
}
