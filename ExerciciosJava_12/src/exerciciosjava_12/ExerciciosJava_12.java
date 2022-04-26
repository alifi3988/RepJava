/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosjava_12;

import java.text.Format;
import java.text.MessageFormat;
import java.util.Scanner;


/**
 *
 * @author alifi
 */
public class ExerciciosJava_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int valor, soma = 0;
        String resposta;

        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("Informe um valor: "
                    + "Infome um numero");
            valor = teclado.nextInt();
            soma=+valor;
            System.out.println("Deseja continuar [S/N]? ");
            resposta = teclado.next();
        }while(resposta.equals("S"));
        System.out.println("O valor da soma é " + soma);;

    }

}
