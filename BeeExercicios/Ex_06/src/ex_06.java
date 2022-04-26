import java.util.*;

public class ex_06 {
    
    public static void main(String[] args) throws Exception {
        int num;
        Scanner e = new Scanner(System.in);
        System.out.print("Informe um valor para mostrar o dia da semana correspondente: ");
        num = e.nextInt();
        
        //swith para facilitar, visto que já sei a quantidade dos dias da semana
        //e quais serão os números correspondente
        switch(num){
            case 1: 
                System.out.println("1 - Domingo");
                break;
            case 2:
                System.out.println("2 - Segunda-Feira");
                break;
            case 3:
                System.out.println("3 - Terça- feira");
                break;
            case 4:
                System.out.println("4 - Quarta-feira");
                break;
            case 5:
                System.out.println("5 - Quinta-feira");
                break;
            case 6:
                System.out.println("6 - Sexta - feira");
                break;
            case 7:
                System.out.println("7 - Sábado");
                break;
            default:
                System.out.println("Valor inválido");
            
        }



    }
}
