package javapoo.aula11HerancaPt2;
public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    public void receberAumento(float aum){
        this.salario+=aum;
    }
    public String getEspecialidade(){
        return especialidade;
    }
    public void setEspecialidade(String espec){
        this.especialidade = espec;
    }    
    public float getSalario(){
        return salario;
    }
    public void setSalario(float sal){
        this.salario = sal;
    }
    public String toString(){
        return "Nome "+nome+"\nIdade "+idade+"\nSexo "+sexo+"\nEspecialidade "+especialidade+"\nSalário "+salario;
    }
}