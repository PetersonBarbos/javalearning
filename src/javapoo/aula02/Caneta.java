package javapoo.aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("modelo: "+this.modelo+"; cor: "+this.cor+"; ponta: "+this.ponta+"mm; carga: "+this.carga+"% tampada: "+this.tampada);
    }
    void tampar(){
        this.tampada=true;
    }
    void destampar(){
        this.tampada = false;
    }
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro, não posso rabiscar com a caneta tampada.");
        }else{
            System.out.println("Rabicando");
        }
    }
}
