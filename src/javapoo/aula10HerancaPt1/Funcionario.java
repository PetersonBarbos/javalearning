package javapoo.aula10HerancaPt1;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    public void mudaTrabalhando(){
        this.trabalhando = !this.trabalhando;
    }
    public String getSetor(){
        return setor;
    }
    public void setSetor(String set){
        this.setor = set;
    }
    public boolean getTrabalhando(){
        return trabalhando;
    }
    public void setTrabalhando(boolean trab){
        this.trabalhando = trab;
    }
    //não entendi porque funcionou sem o @override
    public String toString(){
        return "Nome "+nome+"\nIdade "+idade+"\nSexo "+sexo+"\nSetor "+setor+"\nTrabalhando "+trabalhando;
    }
}
