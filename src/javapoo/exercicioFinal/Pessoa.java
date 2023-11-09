public abstract class Pessoa {
    protected String nome, sexo, experiencia;
    protected int idade;

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

}
