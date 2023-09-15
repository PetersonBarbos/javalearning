package javapoo.aula04GetSetEConstrutor;

public class CanetaConstrutor {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    public CanetaConstrutor(){//mesmo nome da classe
        this.ponta = 0.5f;
        this.modelo = "Bic";
        this.tampar();
        this.cor = "Azul";
    }
    public void tampar(){
        this.tampada = true;
    }
    public void estado(){
        System.out.println("cor: "+ this.cor+"; modelo: " + this.modelo + "; ponta: " + this.ponta+ "; tampada: " + this.tampada);
    }
}
