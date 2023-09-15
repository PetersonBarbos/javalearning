package javapoo.aula04GetSetEConstrutor;

public class Caneta {
    private String modelo;
    private float ponta;
    public void status(){
        System.out.println("modelo: " + this.getModelo() + "; ponta: " + this.getPonta());
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
}
