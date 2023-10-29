package javapoo.Aula07RelacionamentoEntreClasses;

import java.util.Scanner;

public class RelacionamentoEntreClasses {
    public static void main(String [] args){
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "França", 31,1.75f,68.9f,11,2,1);
        l[1] = new Lutador("PutScript", "Brasil",29,1.68f,57.8f,14,2,2);
        l[2] = new Lutador("Snapshadow","EUA",35,1.65f,80.9f,12,2,1);
        l[3] = new Lutador("Dead Code","Austrália",28,1.93f,81.6f,13,0,2);
        l[4] = new Lutador("Ufo Cobol","Brasil",37,1.7f,119.3f,5,4,3);
        l[5] = new Lutador("Nerdaard","EUA",30,1.81f,105.7f,12,2,4);
        Scanner tecl = new Scanner(System.in);
        int i = 0;
        System.out.println("Qual lutador você deseja ver?: ");
        int numDeLut = tecl.nextInt();
        if(numDeLut < 0 || numDeLut > 5){
            System.out.println("Por favor selecione de 0 a 5");
            numDeLut = tecl.nextInt();
        }
        while (i!=5){
            System.out.println("Pressione 1 para ver a apresentação do lutador");
            System.out.println("Pressione 2 para ver o status do lutador");
            System.out.println("Pressione 5 para finalizar");
            i = tecl.nextInt();
            if (i == 1){
                l[numDeLut].apresentar();
            } else if(i==2){
                l[numDeLut].status();
            }
        }
        tecl.close();
    }
}
