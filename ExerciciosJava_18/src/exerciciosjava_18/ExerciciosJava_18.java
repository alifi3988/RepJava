/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosjava_18;

/**
 *
 * @author alifi
 */
public class ExerciciosJava_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Object[] str = {"a", "b", "c"};
        Fatorial f = new Fatorial();
        f.setValor(5);
        System.out.println(f.getFormula());
        System.out.println(f.getVatorial());
        System.out.println(str[1]);  
        
        for (int i = 1; i < 5; i++) {
	if (i==2) continue;
	System.out.print("i =  "+ i); 
        
        
        }
        System.out.println("\n\n");
        int total = 0;
        int c[] = new int[13];
        for (int i = 0; i<c.length; i++) {
                c[i] = i + i;
        }
        for (int i = 0; i<c.length; i++) {
                total += c[i];
        }
        System.out.println(total);
 
    }
    
}
