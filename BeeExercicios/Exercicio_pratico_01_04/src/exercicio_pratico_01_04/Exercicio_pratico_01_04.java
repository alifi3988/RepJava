/*
Ex.:
- Digite o intervlo de numeros, inteiros, e calcule quantos nmeros pares e impares tem nesse intevalo.

*/

package exercicio_pratico_01_04;

import java.util.*;
import javax.sound.midi.Soundbank;

public class Exercicio_pratico_01_04 {


    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int a, b, maior = 0, menor = 0;
        System.out.println("----------------------------------");
        System.out.print("Informe um número inteiro: ");
        a = e.nextInt();
        System.out.print("Informe outro número inteiro: ");
        b = e.nextInt();
        System.out.println("----------------------------------");

        if(a > b){
            System.out.print("Intervalo[ ");
            for(int i = a; i >= b; i-- ){
                if(i == b){
                    System.out.println(i + "]");
                    break;
                }
                System.out.print(i + ", ");
            }
            System.out.println("Fim do Intervado!");
        }else if(a < b){
            System.out.print("Intervalo[ ");
            for(int i = a; i <=b; i++ ){
                if(i == b){
                    System.out.println(i + "]");
                    break;
                }
                System.out.print(i + ", ");
            }
            System.out.println("Fim do Intervado!");
        }
        else{
            System.out.println("Intervalo inválido!");
        }
    }
}
