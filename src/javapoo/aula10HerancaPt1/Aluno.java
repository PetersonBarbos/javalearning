package javapoo.aula10HerancaPt1;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    public void cancelarMatricula(){
        System.out.println("Matricula cancelada");
    }
    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int mat){
        this.matricula = mat;
    }
    public String getCurso(){
        return curso;
    }
    public void setCurso(String cs){
        this.curso = cs;
    }
    @Override//serve para sobrepor o toString da classe pessoa, pois esse de agora tem mais 2 atributos
    public String toString() {
        return "Nome "+nome+"\nIdade "+idade+"\nSexo "+sexo+"\nMatricula "+ matricula+"\ncurso "+curso;
    }
}
