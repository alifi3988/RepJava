/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacao_orientada_objeto;

/**
 *
 * @author alifi
 */
public class Caneta {
    
    //Atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada = true;
    
    
    public void status(){
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");

    }
    
    
    
    public void rabiscar(){
        if(tampada){
            System.out.println("Impossivel prossguir. Caneta tampada");
        }else{
            System.out.println("Rabiscndo...");
        }
        
        
    }
    protected void destampada(){
        this.tampada = false;
        
    }
    protected void tampar(){
        this.tampada = true;
    }
    
}
