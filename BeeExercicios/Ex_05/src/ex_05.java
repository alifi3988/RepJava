import java.util.*;

public class ex_05 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int valor, menor = 0, maior = 0, i = 1;

        while(true){
            System.out.print("Informe o " + i + "º número: ");
            valor = entrada.nextInt();
            System.out.println("Valor de I: " + i);
            if(i == 1){
                maior = valor;
                menor = valor;
            }else{
                if(valor > maior){
                    maior = valor;
                }
                if(valor < valor){
                    menor = valor;
                }
            }
            if(i == 3){
                break;
            }
            i++; //incrementação do valor de i
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);




    }
}
