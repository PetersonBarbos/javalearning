package javapoo.aula11HerancaPt2;

public abstract class Pessoa {
    //classes abstratas não podem ser instanciadas, só servem como progenitoras
    protected String nome;
    protected int idade;
    protected String sexo;
    public void fazerAniversario(){
        this.idade++;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String no){
        this.nome = no;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int id){
        this.idade = id;
    }
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sx){
        this.sexo = sx;
    }
    @Override
    public String toString() {
        return "Nome "+nome+"\nIdade "+idade+"\nSexo "+sexo;
    }
}
