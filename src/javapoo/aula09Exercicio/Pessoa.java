public class Pessoa{
    private String nome;
    private int idade;
    private char sexo;
    public Pessoa(String no, int id, char sx){
        this.nome = no;
        this.idade = id;
        this.sexo = sx;
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
    public char getSexo(){
        return sexo;
    }
    public void setSexo(char sx){
        this.sexo = sx;
    }
    public void fazerAniversario(){
        this.setIdade(this.getIdade()+1);
    }
}