package exerciciosjava;

import java.util.Scanner;

public class ExerciciosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("--------------------------------------\n");
        System.out.print("Digite o nome do Aluno: "); String nome = teclado.nextLine();
        System.out.print("Digite a nota do Aluno: "); Float nota = teclado.nextFloat();
        System.out.print("--------------------------------------\n");
        System.out.format(">> A nota de %s, foi %.1f \n", nome, nota); //Lembra a formatação de Python
    }
    
}
