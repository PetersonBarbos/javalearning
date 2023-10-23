//criando a classe, para implementar os metodos abstratos é na linha de declaração da classe abaixo
public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //Metodos
    public ControleRemoto(){
        this.ligado = false;
        this.tocando = false;
    }
    private int getVolume(){
        return volume;
    }
    private void setVolume(int vol){
        this.volume = vol;
    }
    private boolean getLigado(){
        return ligado;
    }
    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    private boolean getTocando(){
        return tocando;
    }
    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }
    public void ligar(){
        this.setLigado(true);
        this.volume = 50;
    }
    public void desligar(){
        this.setLigado(false);
    }
    public void abrirMenu(){
        System.out.println("O aparelho está ligado? "+this.getLigado());
        //continua...
    }
}
