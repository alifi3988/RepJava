package programacao_orientada_objeto_04;
public class Caneta {
    public String modelo;
    private float ponta;
    
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String m){
        this. modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void Status(){
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
    }
    
    
}
