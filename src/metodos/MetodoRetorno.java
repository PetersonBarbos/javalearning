package metodos;

public class MetodoRetorno {
    static int /*int é o tipo que vai ser retornado*/soma(int a, int b){
        int s = a+b;
        return s;
    }

    public static void main(String[] args) {
        int sm = soma(8,9);
        System.out.println("A soma é "+sm);
    }
    
}
