public class Aluno extends Pessoa {
 
    private String login;
    private int totAssistido;

    public Aluno(String no, int id, String sx, String log) {
        super(no, id, sx);
        this.login = log;
        this.totAssistido = 0;
    }
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

    public String toString() {
        return super.toString()+"Aluno{Longin: "+this.login+", Total de aulas assistidas: "+ this.totAssistido+"}";
        //não tá retornando o super.toString, não sei se faz sentido mas acredito que seja da IDE
        //já que vscode não é específico para Java
    }
}
