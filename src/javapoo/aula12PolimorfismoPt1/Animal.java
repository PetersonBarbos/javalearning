package javapoo.aula12PolimorfismoPt1;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    public float getPeso(){
        return peso;
    }
    public void setPeso(float pe){
        this.peso = pe;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int id){
        this.idade = id;
    }
    public int getMembros(){
        return membros;
    }
    public void setMembros(int mbrs){
        this.membros = mbrs;
    }
}
