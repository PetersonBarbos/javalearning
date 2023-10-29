package javapoo.Aula07RelacionamentoEntreClasses;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private boolean aprovada;
    public Lutador getDesafiado(){
        return desafiado;
    }
    public void setDesafiado(Lutador ado){
        this.desafiado = ado;
    }
    public Lutador getDesafiante(){
        return desafiante;
    }
    public void setDesafiante(Lutador ante){
        this.desafiante = ante;
    }
    public boolean getAprovada(){
        return aprovada;
    }
    public void setAprovada(boolean apv){
        this.aprovada = apv;
    }
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("------------------------------------------");
            System.out.println("Desafiado");
            this.desafiado.apresentar();
            System.out.println("------------------------------------------");
            System.out.println("------------------------------------------");
            System.out.println("Desafiante");
            this.desafiante.apresentar();
            System.out.println("------------------------------------------");
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0: //empate
                    System.out.println("------------------------------------------");
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    System.out.println("------------------------------------------");
                    break;
                case 1: //desafiado vence
                    System.out.println("------------------------------------------");
                    System.out.println(this.desafiado.getNome()+" É o vencedor");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    System.out.println("------------------------------------------");
                    break;
                case 2: //desafiante vence
                    System.out.println("------------------------------------------");
                    System.out.println(this.desafiante.getNome()+" É o vencedor");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    System.out.println("------------------------------------------");
                    break;
            }
        } else{
            System.out.println("Impossível marcar essa luta");
        }
    }
}
