package javapoo.aula10HerancaPt1;

public class Aula10HerancaPt1 {
    public static void main (String[] args){
        Pessoa p1 = new Pessoa();
        p1.setIdade(12);
        p1.setNome("joe");
        p1.setSexo("masc");
        System.out.println("---------------------");
        System.out.println(p1.toString());
        System.out.println("---------------------");
        Aluno a1 = new Aluno();
        a1.setNome("Enzo");
        a1.setIdade(22);
        a1.setCurso("ADS");
        a1.setMatricula(1);
        a1.setSexo("masc");
        System.out.println(a1.toString());
        System.out.println("---------------------");
        Funcionario f1 = new Funcionario();
        f1.setNome("Carlos");
        f1.setIdade(42);
        f1.setSexo("masc");
        f1.setSetor("admin");
        f1.setTrabalhando(true);
        System.out.println(f1.toString());
        System.out.println("---------------------");
        Professor pr1 = new Professor();
        pr1.setNome("Marcia");
        pr1.setEspecialidade("Geografia");
        pr1.setIdade(34);
        pr1.setSalario(5000f);
        pr1.setSexo("fem");
        System.out.println(pr1.toString());
        System.out.println("---------------------");
    }
}
