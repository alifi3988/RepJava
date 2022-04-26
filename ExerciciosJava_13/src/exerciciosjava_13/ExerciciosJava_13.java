/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosjava_13;

import javax.swing.JOptionPane;

/**
 *
 * @author alifi
 */
public class ExerciciosJava_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 0, acumulador = 0, pares = 0, impares = 0, acima = 0, contador = 0; 
        double media;
        
        JOptionPane.showMessageDialog(null, "Bem vindo ao programa!\nInforme os valores confome é pedido.", "Inicio", JOptionPane.INFORMATION_MESSAGE);
        do{
            valor = Integer.parseInt(JOptionPane.showInputDialog("<html>Informe um valor. <br>Para encerrar, digite o número <em>0</em>. </html>", "0"));
            if(valor != 0){
                acumulador+=valor;
                contador++;
                if(valor%2 == 0){
                    pares=+1;
                }else{
                    impares+=1;
                }
                
                if(valor > 100){
                    acima=+1;
                }
            }
        }while(valor!=0);
        media = acumulador/contador;
        System.out.println(media);
        JOptionPane.showMessageDialog(null, "<html>Resultado <hr>"
                + "\n* Total de valores: " + acumulador
                + "\n* Total de pares: " + pares
                + "\n* Total de ímpares: " + impares
                + "\n* Acima de 100: " + acima
                + "\n* Média dos valores: " + media, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                
                
        
        
        //JOptionPane.showMessageDialog(null,"Olá Mundo", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);
        
        //int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
        //JOptionPane.showMessageDialog(null, "O valor informado foi " + valor, "Informação", JOptionPane.INFORMATION_MESSAGE);
        
        
    }
    
}
