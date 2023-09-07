package javapoo.aula02;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta ();
        c1.modelo = "Bic";
        c1.cor = "vermelha";
        c1.ponta = 0.7f;
        c1.carga = 70;
        c1.tampada = true;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        Caneta c2 = new Caneta();
        c2.modelo = "Compactor";
        c2.cor = "Azul";
        c2.ponta = 1.0f;
        c2.carga = 20;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
