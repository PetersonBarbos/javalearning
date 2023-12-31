public abstract class Pessoa {
    protected String nome, sexo, experiencia;
    protected int idade;

    public Pessoa(String no, int id, String sx){
        this.nome = no;
        this.idade = id;
        this.sexo = sx;
    }
    public abstract void ganharExperiencia();
    public String getNome(){
        return nome;
    }
    public void setNome(String no){
        this.nome = no;
    }
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sx){
        this.sexo = sx;
    }
    public String getExperiencia(){
        return experiencia;
    }
    public void setExperiencia(String experian){
        this.experiencia = experian;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int id){
        this.idade = id;
    }
    public String toString() {
        return "Pessoa{Nome: "+this.nome+", idade: "+this.idade+", sexo: "+this.sexo+"}";
    }
}
