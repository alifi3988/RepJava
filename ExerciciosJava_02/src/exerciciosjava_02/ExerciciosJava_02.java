package exerciciosjava_02;

public class ExerciciosJava_02 {

    public static void main(String[] args) {
        
        //CONVERTENDO UMA VARIAVEL DO TIPO INT PARA STRING
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        
        //CONVERTENDO UMA VARIAVEL DO TIPO STRING PARA INT
        String anos = "300";
        int valores = Integer.parseInt(anos);
        System.out.println(valores);
    }
    
}
