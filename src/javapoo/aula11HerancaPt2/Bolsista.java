package javapoo.aula11HerancaPt2;

public final class Bolsista extends Aluno{
    //classe final não tem mais subclasses, é uma folha
    private float bolsa;
    public void renovarBolsa(){
        System.out.println("renovando");
    }
    //era para ter um override aqui. mas ele tá funcionando sem, não entendi pq
    public final void pagarMensal(){
        //um metodo final não pode ser sobreposto
        System.out.println("Pagando especial");
    }
    public float getBolsa(){
        return bolsa;
    }
    public void setBolsa(float bols){
        this.bolsa = bols;
    }

}
