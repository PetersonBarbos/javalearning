public class Livro implements InterfaceLivro {
    private String titulo;
    private String autor;
    private int totPags;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String tit){
        this.titulo = tit;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String aut){
        this.autor = aut;
    }
    public int getTotPags(){
        return totPags;
    }
    public void setTotPags(int tot){
        this.totPags = tot;
    }
    public int getPagAtual(){
        return pagAtual;
    }
    public void setPagAtual(int atual){
        this.pagAtual = atual;
    }
    public boolean getAberto(){
        return aberto;
    }
    public void setAberto(boolean abr){
        this.aberto = abr;
    }
    public Pessoa getLeitor(){
        return leitor;
    }
    public void setLeitor(Pessoa l){
        this.leitor = l;
    }
    public void detalhes(){
        System.out.println("Livro: "+this.getTitulo());
        System.out.println("Autor: "+this.getAutor());
        System.out.println("Total de páginas: "+this.getTotPags());
        System.out.println("Página atual: "+this.getPagAtual());
        System.out.println("leitor: "+this.leitor.getNome()+", idade: "+this.getLeitor().getIdade()+"Sexo: "+this.leitor.getSexo());

    }
    public Livro (){
        this.setAberto(false);
        this.setPagAtual(0);
    }
    public void abrir(){
        if(!(this.getAberto())){
            this.setAberto(true);
            System.out.println("Seu livro agora está aberto");
        } else {
            System.out.println("O livro já está aberto");
        }
    }
    public void  fechar(){
        if(this.getAberto()){
            this.setAberto(false);
            System.out.println("Seu livro agora está fechado");
        } else{
            System.out.println("O Livro já está fechado");
        }
    }
    public void folhear(){
        if (this.getAberto()) {
            System.out.println("Folheado livro");
        } else{
            System.out.println("Para folhear precisa do livro aberto");
        }
    }
    public void avancaPag(){
        if(this.getAberto() && this.getPagAtual()<this.getTotPags()){
            this.setPagAtual(this.getPagAtual()+1);
            System.out.println("Página avançada");
            System.out.println("Nova página atual: "+this.getPagAtual());
        } else if(this.getPagAtual() == this.getTotPags()){
            System.out.println("Esta é a ultima página");
        } else {
            System.out.println("Tente abrir o livro antes");
        }
    }
    public void voltaPag(){
        if (this.getAberto() && this.getPagAtual()>1){
            this.setPagAtual(this.getPagAtual()-1);
            System.out.println("Página retrocedida");
            System.out.println("Nova página atual: "+this.getPagAtual());
        } else if (this.getPagAtual()==1){
            System.out.println("Você está na primeira página");
        } else {
            System.out.println("Tente abrir o livro");
        }
    }
}
