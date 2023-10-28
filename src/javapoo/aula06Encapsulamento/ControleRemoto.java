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
        System.out.println("Está tocando? "+ this.getTocando());
        System.out.println("volume: " + this.getVolume());
        for (int i = 10; i<= this.getVolume(); i+=10){
            System.out.print("|");
        }
    }
    public void fecharMenu(){
        System.out.println("Fechando menu...");
    }
    public void maisVolume(){
        if (this.getLigado() && this.getTocando()){
            this.setVolume(this.getVolume()+5);
        } else{
            System.out.println("Tente ligar o aparelho ou dar play");
        }
    }
    public void menosVolume(){
        if (this.getLigado() && this.getTocando()){
            this.setVolume(this.getVolume()-5);
        } else{
            System.out.println("Tente ligar o aparelho ou dar play");
        }
    }
    public void ligarMudo(){
        if(this.getLigado() && this.getTocando() && this.getVolume()>0){
            this.setVolume(0);
        }
    }
    public void desligarMudo(){
        if(this.getLigado() && this.getTocando() && this.getVolume()==0){
            this.setVolume(50);
        }
    }
    public void play(){
        if(this.getLigado()&& !(this.getTocando())){
            this.setTocando(true);
        }
    }
    public void pause(){
        if(this.getLigado()&& this.getTocando()){
            this.setTocando(false);
        }
    }
}
