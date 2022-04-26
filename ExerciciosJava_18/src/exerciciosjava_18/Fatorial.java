/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosjava_18;

/**
 *
 * @author alifi
 */
public class Fatorial {

    private int numero = 0;
    private int fat = 1;
    private String func = "";

    public void setValor(int n){
        numero = n;
        
        int f = 1;
        String s = "";
        for(int i = n; i > 1; i--){
            f*=i;
            s += i + " x "; 
        }   
        s += " 1 = ";
        fat = f;
        func = s;
    }
    public int getVatorial(){  
        return fat;
    }
    public String getFormula(){
        return func;
    }


}
