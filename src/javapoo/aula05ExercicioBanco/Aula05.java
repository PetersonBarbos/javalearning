package javapoo.aula05ExercicioBanco;

import java.util.Scanner;

public class Aula05 {
    public static void main(String[]args){
        Banco p1 = new Banco();
        p1.abrirConta();
        p1.estado();
        System.out.println("Digite: \n1 - para fechar\n2 - para depositar\n3 - para sacar");
        Scanner tecl = new Scanner(System.in);
        int opcao = tecl.nextInt();
        if(opcao == 1){
            p1.fecharConta();
        } else if (opcao == 2){
            p1.depositar();
        } else if (opcao == 3){
            p1.sacar();
        }
        tecl.close();
    }
}
