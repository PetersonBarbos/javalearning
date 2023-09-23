//import java.util.Scanner;

public class EntradaESaida {
    public static void main(String[] args) {
        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do Aluno:");
        String nome = teclado.nextLine();
        System.out.println("Digite a nota do Aluno: ");
        Float nota = teclado.nextFloat();
        System.out.printf("A nota de %s é %.3f", nome, nota);
        teclado.close();*/
        //para passar de número para strin ou vice e versa
        int idade = 24;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        int ida = Integer.parseInt(valor);
        System.out.println(ida/2);

    }
    
}
