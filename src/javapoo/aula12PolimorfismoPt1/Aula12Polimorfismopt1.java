package javapoo.aula12PolimorfismoPt1;

public class Aula12Polimorfismopt1 {
    public static void main(String [] args){
        Mamifero m1 = new Mamifero();
        System.out.println("------------------------------");
        System.out.println("Mamifero");
        m1.locomover();
        m1.alimentar();
        m1.emitirSom();
        System.out.println("------------------------------");
        Canguru cang1 = new Canguru();
        System.out.println("Canguru");
        cang1.locomover();
        cang1.alimentar();
        cang1.emitirSom();
        System.out.println("------------------------------");
        Cachorro cach1 = new Cachorro();
        System.out.println("Cachorro");
        cach1.locomover();
        cach1.alimentar();
        cach1.emitirSom();
        System.out.println("------------------------------");
        Reptil r1 = new Reptil();
        System.out.println("Reptil");
        r1.locomover();
        r1.alimentar();
        r1.emitirSom();
        System.out.println("------------------------------");
        Tartaruga tortuga1 = new Tartaruga();
        System.out.println("Tartaruga");
        tortuga1.locomover();
        tortuga1.alimentar();
        tortuga1.emitirSom();
        System.out.println("------------------------------");
        Cobra cobra1 = new Cobra();
        System.out.println("Cobra");
        cobra1.locomover();
        cobra1.alimentar();
        cobra1.emitirSom();
        System.out.println("------------------------------");
        Peixe p1 = new Peixe();
        System.out.println("Peixe");
        p1.locomover();
        p1.alimentar();
        p1.emitirSom();
        System.out.println("------------------------------");
        GoldFish gold1 = new GoldFish();
        System.out.println("GoldFish");
        gold1.locomover();
        gold1.alimentar();
        gold1.emitirSom();
        System.out.println("------------------------------");
        Ave av1 = new Ave();
        System.out.println("Ave");
        av1.locomover();
        av1.alimentar();
        av1.emitirSom();
        System.out.println("------------------------------");
        Arara ar1 = new Arara();
        System.out.println("Arara");
        ar1.locomover();
        ar1.alimentar();
        ar1.emitirSom();
        System.out.println("------------------------------");

    }
}
