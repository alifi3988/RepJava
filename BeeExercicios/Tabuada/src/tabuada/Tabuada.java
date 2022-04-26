package tabuada;
import java.util.*;

public class Tabuada {

    public static void main() {
        
        Scanner e = new Scanner(System.in);
        int valor;
        int res;
        
        while(true){
            System.out.println("---------------------------");
            System.out.println(" * ** TABUADA * * * ");
            System.out.println("---------------------------");
            System.out.print("Informe um valor: ");
            valor = e.nextInt();
            System.out.println("---------------------------");
            for(int i = 0; i < 11; i++){
                System.out.printf("%d x %d = %d\n", i, valor, (i*valor));
            }
            System.out.println("---------------------------");
            System.out.print("Deseja Continuar [0/1]: ");
            res = e.nextInt();
            if(res == 0){
                break;
            }
                
        }
    }    
}
