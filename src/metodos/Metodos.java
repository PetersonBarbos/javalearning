package metodos;
//metodo que não retorna valor
public class Metodos {
    static void /*void não retorna valor*/soma(int a, int b){
        //se vou chamar um método de um método static o método chamado tem que ser static também
        System.out.println(a+b);
    }
    
    public static void main(String[] args) {
        System.out.println("somando");
        soma(6,8);
    }
}
