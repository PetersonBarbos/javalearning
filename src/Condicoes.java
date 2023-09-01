import java.util.Scanner;

public class Condicoes {
    public static void main(String[] args) {
    //estrutura condicional simples
        Scanner tecl = new Scanner(System.in);
        /*System.out.println("Digite a primeira nota");
        float n1 = tecl.nextFloat();
        System.out.println("Digita a segunda nota");
        float n2 = tecl.nextFloat();
        float med = (n1 + n2)/2;
        System.out.println(med);
        if  (med>=7){
            System.out.println("Parabéns");
        }*/
    //condições compostas
        /*System.out.println("Digite seu anos de nascimento: ");
        int nasc = tecl.nextInt();
        int id = 2023 - nasc;
        System.out.println(id);
        if (id>=18){
            System.out.println("Maior de idade");
        } else{
            System.out.println("Menor de idade");
        }*/
    // estruturas condicionais encadeadas
        /*System.out.println("Vamos saber se você é obrigado a votar...");
        if (id<16){
            System.out.printf("%d anos, não pode votar", id);
        } else if ((id>= 16 && id<18) || (id>=70)){
            System.out.printf("%d anos, voto opcional", id);
        } else{
            System.out.printf("%d anos, voto obrigatório \n", id);
        }*/
    //switch case, exemplo das pernas
        System.out.println("Digite a quantidade de pernas:");
        int pernas = tecl.nextInt();
        String tipo;
        switch (pernas){
            case 1:
                tipo = "saci";
                break;
            case 2:
                tipo = "bípede";
                break;
            case 4:
                tipo = "quadrúpede";
                break;
            case 8:
                tipo = "aranha";
                break;
            default:
                tipo = "et";
        }
        System.out.println(tipo);
        tecl.close();
    }

}
