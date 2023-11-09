public class Aluno extends Pessoa {
    private String login;
    private int totAssistido;
    public void viuMaisUm(){
        totAssistido++;
    }
    @Override
    public void ganharExperiencia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ganharExperiencia'");
    }
    public String getLogin(){
        return login;
    }
    public void setLogin(String log){
        this.login = log;
    }
    public int getTotAssistido(){
        return totAssistido;
    }
    public void setTotAssistido(int tot){
        this.totAssistido = tot;
    }
    
}
