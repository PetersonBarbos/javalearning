import java.util.Arrays;

public class Vetores{
    public static void main(String[] args) {
    //para declarar vetores:
        /*int n[] = new int[4];
        n[0] = 3;
        n[1] = 5;
        n[2] = 8;
        n[3] = 2;*/
    /*//mas também pode ser assim:
       int n[] = {3,5,8,2};//pode ser int[] ou []int
    //Para mostrar os elementos
        for(int c = 0;c<4;c++){
            System.out.println(n[c]);
        }
    // Para mostrar o temanho do vetor
        System.out.println(n.length);
    // Assim é mais útil usar o for com n.length
        for(int c = 0;c<n.length;c++){
            System.out.println(n[c]);
        }*/
    //Exemplo dos meses e seus dias:
        /*String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int dias[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int c = 0;c<mes.length;c++){
            System.out.println("O mês "+mes[c]+" Tem "+dias[c]+" dias");
        }*/
    //for exclusivo para vetores:
        double v[] = {5.5, 6, 7.8, 2.1, 9.9, 0.6};
        for(double valor:v){
            //a variável valor vai receber os valores do vetor v em cada posição
            System.out.println(valor);
        }
    //Para colocar um vetor em ordem
        Arrays.sort(v);// atenção que lá em cima vai importar a biblioteca java.util.Arrays
        for(double valor: v){
            System.out.println(valor);
        }
    //Para fazer uma busca no vetor
        int pos = Arrays.binarySearch(v,7.8);
        System.out.println(pos);
        //ele vai receber a posição que tá o número 7.8
        //caso ele não encontre o valor ele vai retorna o número que eu digitei negativo,
        //pois não existe posição negativa
    //Para todos elementos do vetor serem preenchidos por um número específico:
        Arrays.fill(v,0);
        for(double valor:v){
            System.out.println(valor);
        }
    }
}