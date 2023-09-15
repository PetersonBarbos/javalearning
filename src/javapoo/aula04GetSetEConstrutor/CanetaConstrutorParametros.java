package javapoo.aula04GetSetEConstrutor;

public class CanetaConstrutorParametros {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    public CanetaConstrutorParametros(String m, float p, String c){
        this.modelo = m;
        this.ponta = p;
        this.cor = c;
        this.tampar();
    }
    public void tampar(){
        this.tampada = true;
    }
    public void estado(){
        System.out.println("cor: "+ this.cor+"; modelo: " + this.modelo + "; ponta: " + this.ponta+ "; tampada: " + this.tampada);
    }
}
