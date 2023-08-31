import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        //operador ternário
        // variavel=(n1>n2)?n1:n2; -> se n1 maior que n2 variavel = n1
        //senao variavel = n2
        // o operador ternário aceita operações dentro dele também, ou seja
        // variavel=(n1>n2)?n1+8:n2-15;
        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n1 = teclado.nextInt();
        System.out.println("Digite outro número:");
        int n2 = teclado.nextInt();
        int menor = (n1<n2)?n1:n2;
        System.out.printf("O menor é %d",menor);
        teclado.close();*/
        // os operadores relacionais são iguais aos de js
        // se declarar variáveis de forma diferente (para objetos) mas que avaliar o mesmo conteúdo, usa-se .equals
        String nome1 = "Peter";
        String nome2 = "Peter";
        String nome3 = new String("Peter");
        String res = (nome1==nome2)?"igual":"diferente";
        String res2 = (nome1==nome3)?"Igual":"Diferente";
        String res3 = (nome1.equals(nome3))?"igual":"diferente";
        System.out.printf("%S \n %S \n %S", res, res2, res3);
        // operadores lógicos
        // && = e
        // || = ou
        // ^ = ou exclusivo - só é true quando um é true e o outro é false
        // ! = não
    }
}
