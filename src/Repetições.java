//import java.util.Scanner;

public class Repetições {
    public static void main(String[]args){
    /*Estrutura de repetição com teste no ínicio */
    // mudando o fluxo de um laço
    // continue vai fazer com que interrompa onde ele está e volta para a analise da condição, assim pulando passos
    // break vai parar o programa
        /*int cc = 0;
        while(cc<=10){
            cc++;
            if(cc==3 || cc == 7){
                continue;
            } else if (cc==9){
                break;
            }
            System.out.println("passo "+ cc); 
        }*/
    //Estrutura de repetição com teste no ínicio
        /*int cc = 0;
        do{
            System.out.println("passo " + cc);
            cc++;
        } while(cc<=10);*/
           /* int n, s = 0;
            String resp;
            Scanner tecl = new Scanner(System.in);
            do{
                System.out.println("Digite um número: ");
                n = tecl.nextInt();
                s+= n;
                System.out.println("Quer continuar? [S/N]");
                resp = tecl.next(); // não entendi porque dá erro quando coloco nextLine
            } while (resp.equals("S"));
            System.out.printf("A soma dos valores é %d", s);
            tecl.close();*/
    //Estrutura de repetição com variável de controle
            for(int cc = 0;cc<=10;cc+=2){
                System.out.println("Passo "+cc);
            }
    //Laços aninhados
            for(int i = 0;i<=5;i++){
                for (int j = 1; j<=6;j++){
                    System.out.printf("%d , %d \n", i, j);
                }
            }
    }
}
