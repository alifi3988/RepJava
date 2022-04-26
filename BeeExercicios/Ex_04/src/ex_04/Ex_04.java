
package ex_04;

import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {
        
        int p =0, i = 0, m = 0, v1, v2, cont = 0;
        
        Scanner e = new Scanner(System.in);
        
        System.out.print("Informe o início do intervalo:");
        v1 = e.nextInt();
        System.out.print("Informe o fim do intervalo: ");
        v2 = e.nextInt();
        while(true){
            if(v1 > v2){

                System.out.println("--------------------------------------------");
                System.out.println("Número de ínicio maior que o de término");
                System.out.print("Informe um novo valor pata ínicio: ");
                v1 = e.nextInt();
                System.out.print("Informe um novo valor pata término: ");
                v2 = e.nextInt();
            }else{
                break;
            }
        }
            while(v1 != (v2+1)){
                if(v1%2 == 0){
                    p++;
                    cont = cont + v1;
                }else{
                    i++;
                }
                v1++;
            }
            System.out.println("IMPARES: " + i);
            System.out.println("PARES: " + p);
            System.out.println("MÉDIA PARES: " + (cont/p));
        
    }
}
