public class Video implements AcoesVideo {
    private String titulo, avaliacao;
    private int views, curtidas;
    private boolean reproduzindo;
    @Override
    public void play() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'play'");
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pause'");
    }

    @Override
    public void like() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'like'");
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String tit){
        this.titulo = tit;
    }
    public String getAvaliacao(){
        return avaliacao;
    }
    public void setAvaliacao(String avalia){
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
    
}
