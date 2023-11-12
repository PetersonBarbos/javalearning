public class Video implements AcoesVideo {
    private String titulo;
    private int views, curtidas, avaliacao;
    private boolean reproduzindo;
    
    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String tit){
        this.titulo = tit;
    }
    public int getAvaliacao(){
        return avaliacao;
    }
    public void setAvaliacao(int avalia){
        this.avaliacao = avalia;
    }
    public int getViews(){
        return views;
    }
    public void setViews(int visto){
        this.views = visto;
    }
    public int getCurtidas(){
        return curtidas;
    }
    public void setCurtidas(int curtiu){
        this.curtidas = curtiu;
    }
    public boolean getReproduzindo(){
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduziu){
        this.reproduzindo = reproduziu;
    }
    @Override
    public String toString() {
        return "Video{Título: "+this.titulo+", views: "+this.views+", avaliação: "
        +this.avaliacao+", curtidas: "+this.curtidas+", reproduzindo: "+this.reproduzindo+"}";
    }
}
