package javapoo.aula12PolimorfismoPt1;

public class Mamifero extends Animal {
    private String corPelo;
    @Override//polimorfismo de sobreposição pois tem a mesma assinatura(mesma quantidade e tipo de parâmetros)
    public void locomover() {
        System.out.println("Correndo");
    }

    /*Em Java, a anotação @Override não é estritamente necessária para fazer a sobreposição de métodos, mas é uma prática recomendada. */
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
    public String getCorPelo(){
        return corPelo;
    }
    public void setCorPelo(String corP){
        this.corPelo = corP;
    }
}
