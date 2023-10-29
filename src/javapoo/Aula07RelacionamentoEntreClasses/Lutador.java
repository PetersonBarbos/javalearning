package javapoo.Aula07RelacionamentoEntreClasses;
//Exemplo do curso de um combate entre lutadores
public class Lutador {
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);//para atualizar a categoria tem que chamar pelo setPeso que por sua vez vai chamar o setCategoria
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String no){
        this.nome = no;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int id){
        this.idade = id;
    }
    public float getAltura(){
        return altura;
    }
    public void setAltura(int al){
        this.altura = al;
    }
    public float getPeso(){
        return peso;
    }
    public void setPeso(float pe){
        this.peso = pe;
        this.setCategoria();
    }
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(){
        if(this.peso <52.2){
            this.categoria = "inválido";
        } else if (this.peso <=70.3){
            this.categoria = "leve";
        } else if (this.peso <= 83.9){
            this.categoria = "Médio";
        } else if (this.peso< 120.2){
            this.categoria = "pesado";
        } else{
            this.categoria = "inválido";
        }
    }
    public int getVitorias(){
        return vitorias;
    }
    public void setVitorias(int vi){
        this.vitorias = vi;
    }
    public int getEmpates(){
        return empates;
    }
    public void setEmpates(int em){
        this.empates = em;
    }
    public int getDerrotas(){
        return derrotas;
    }
    public void setDerrotas(int de){
        this.derrotas = de;
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void apresentar(){
        System.out.println("Apresentamos "+this.getNome());
        System.out.println("Diretamente de "+this.getNacionalidade());
        System.out.println("com "+ this.getIdade()+" Anos e "+this.getAltura()+"M");
        System.out.println("Pesando "+this.getPeso()+"kg");
        System.out.println(this.getVitorias()+" Vitórias");
        System.out.println(this.getEmpates()+" empates e");
        System.out.println(this.getDerrotas()+" derrotas");
    }
    public void status(){
        System.out.println(this.getNome()+" é um peso "+this.getCategoria());
        System.out.println("Ganhou "+this.getVitorias()+" vezes");
        System.out.println("Empatou "+this.getEmpates()+" vezes e");
        System.out.println("Perdeu "+this.getDerrotas()+" vezes");
    }
}
//agora é só criar os objetos na clase princial