package javapoo.aula13Polimorfismopt2Sobrecarga;

public class Mamifero extends Animal {
    private String corPelo;
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
