/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosjava_10;

/**
 *
 * @author alifi
 */
public class ExerciciosJava_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //IMplementação da estrutura de repetição While
        
        int cc = 0;
        
        while(cc < 20){
            cc++;
            if(cc > 5 && cc < 10){
                continue;
            }if(cc == 15){
                break;
            }
            System.out.println("Cambalhota: " + (cc));
        }
        
        
        
    }
    
}
