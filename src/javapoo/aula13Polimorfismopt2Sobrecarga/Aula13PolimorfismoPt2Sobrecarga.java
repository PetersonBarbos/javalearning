package javapoo.aula13Polimorfismopt2Sobrecarga;

public class Aula13PolimorfismoPt2Sobrecarga {
    public static void main(String [] args){
        Cachorro c = new Cachorro();
        c.reagir("olá");
        c.reagir("Sai");
        c.reagir(10, 0);
        c.reagir(14, 0);
        c.reagir(19, 0);
        c.reagir(true);
        c.reagir(false);
        c.reagir(5, 10f);
        c.reagir(15, 03f);
    }
}
