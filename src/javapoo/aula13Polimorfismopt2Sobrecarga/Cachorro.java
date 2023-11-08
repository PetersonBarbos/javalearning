package javapoo.aula13Polimorfismopt2Sobrecarga;

public class Cachorro extends Lobo {
    @Override
    public void emitirSom() {
        System.out.println("Latido de cachorro");
    }
    public void reagir(String frase){
        //não posso mais criar um metodo rosnar com a mesma assinatura, isso é 1 parâmetro String
        if(frase.equals("toma comida") || frase.equals("olá")){
            System.out.println("Abanar rabo");
        } else{
            System.out.println("rosnar");
        }
    }
    public void reagir(int hora, int minuto){
        if(hora<12){
            System.out.println("Abana rabo");
        } else if(hora > 18){
            System.out.println("Rosnar");
        } else{
            System.out.println("Ignorar");
        }
    }
    public void reagir(boolean dono){
        if(dono){
            System.out.println("abanar o rabo");
        } else{
            System.out.println("rosnar");
        }
    }
    public void reagir(int idade, float peso){
        //não posso mais ter um reagir com a mesma assinatura, isso é 1 parâmetro int e 1 float 
        //nessa ordem, mas posso ter um float e 1 int nessa outra ordem
        if (idade<5) {
            if (peso<10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso<10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("ignorar");
            }
        }
    }
}
