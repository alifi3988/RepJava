import java.util.*;

public class Ex_07 {
    public static void main(String[] args) throws Exception {
        
        int num;
        char resp;
         //no caso como eu quero pegar somente um valor, 
        //é mais fácil utilizar o char

        Scanner e = new Scanner(System.in);

        while(true){
            System.out.println(" * * * TABUADA * * *");
            System.out.print("Informe um número: ");
            num = e.nextInt();
            System.out.println( "* * * TABUADA * * *");
            for(int i = 0; i < 10; i++){
                System.out.println(num + " x " + i + " = " + (i*num));
            }
            System.out.println( "* * * TABUADA INVERTIDA * * *");
            for(int i = 10; i >= 0; i--){
                System.out.println(num + " x " + i + " = " + (i*num));
            }
            System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
            System.out.print("Deseja continuar? [s/n]");

            resp = (char)System.in.read(); 
            //o modo de ler o valor é modificado
            //No caso utilizei para realizar a leitura de somente uma litra,
            //nessa situação o char acaba sendo mais viável
            



            if(resp == 'n' || resp == 'N'){
                break;
            }
        }
        System.out.println("Fim da tabuada!");
    }
}
