import java.util.Scanner;

public class Aula09Exercicio {
    public static void main(String []args){
        Pessoa p[] = new Pessoa[3];
        Livro l[] = new Livro[3];
        String nome[] = new String[3];
        int idade[] = new int[3];
        String sexo[] = new String[3];
        String titulo[] = new String[3];
        String autor[] = new String[3];
        int qtpag[] = new int[3];
        int cod[] = new int[3];

        Scanner tecl = new Scanner(System.in);
        for (int i = 0;i<3;i++){
            System.out.println("Digite o nome da "+(i+1)+"ª pessoa");
            nome[i] = tecl.next();
            System.out.println("Digite a idade da "+(i+1)+"ª pessoa");
            idade[i] = tecl.nextInt();
            System.out.println("Digite o sexo da "+(i+1)+"ª pessoa");
            sexo[i] = tecl.next();
        }
        for(int i = 0;i<3;i++){
            p[i] = new Pessoa(nome[i],idade[i],sexo[i]);
        }
        System.out.println("Agora vamos cadastrar os livros");
        for(int i=0;i<3;i++){
            System.out.println("Digite o titulo do "+(i+1)+"º livro");
            titulo[i] = tecl.next();
            System.out.println("Digite o autor do " +(i+1)+"º livro");
            autor[i] = tecl.next();
            System.out.println("Digite a quantidade de páginas do "+(i+1)+"º livro");
            qtpag[i] = tecl.nextInt();
            System.out.println("Digite o número do leitor do "+(i+1)+"º livro");
            cod[i] = tecl.nextInt();
        }
        //criar os livros, e aplicar os metodos
        tecl.close();
    }
}
