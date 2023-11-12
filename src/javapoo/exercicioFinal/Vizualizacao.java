public class Vizualizacao {
    private Aluno espectador;
    private Video filme;
    public void avaliar(){

    }
    public void avaliar(float nota){

    }
    public void avaliar(int porcent){

    }
    public Vizualizacao(Aluno espec, Video film){
        this.espectador = espec;
        this.filme = film;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }
    public Aluno getEspectador(){
        return espectador;
    }
    public void setEspectador(Aluno espec){
        this.espectador = espec;
    }
    public Video getFilme(){
        return filme;
    }
    public void setFilme(Video film){
        this.filme = film;
    }
    @Override
    public String toString() {
        return "Vizualização{Espectador: "+espectador+", Video: "+filme+"}";
    }
}
