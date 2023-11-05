package javapoo.aula11HerancaPt2;

public final class Tecnico extends Aluno{
    private int registroProf;
    public void praticar(){
        System.out.println("Praticando");

    }
    public int getRegistroProf(){
        return registroProf;
    }
    public void setRegistroProf(int reg){
        this.registroProf = reg;
    }
}
