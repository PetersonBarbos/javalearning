import java.util.Scanner;

public class Aula06 {
    public static void main(String [] args){
        Scanner tecl = new Scanner(System.in);
        ControleRemoto c = new ControleRemoto();
        int i = 0;
        while(i != 10){
            c.abrirMenu();
            System.out.println("Pressione:\n1 para ligar\n2 para tocar\n3 para fechar menu\n4 para aumentar");
            System.out.println("5 para diminuir\n6 para ligar o mudo\n7 para desligar o mudo\n8 para pausar");
            System.out.println("9 para desligar\n10 para fechar o controle");
            i = tecl.nextInt();
            if(i==1){
                c.ligar();
            } else if(i == 2){
                c.play();
            } else if(i==3){
                c.fecharMenu();
            } else if(i==4){
                c.maisVolume();
            } else if (i==5){
                c.menosVolume();
            } else if(i == 6){
                c.ligarMudo();
            } else if(i==7){
                c.desligarMudo();
            } else if (i==8){
                c.pause();
            } else if(i == 9){
                c.desligar();
            }
        }
    }
}
