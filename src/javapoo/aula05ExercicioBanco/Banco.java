package javapoo.aula05ExercicioBanco;
import java.util.Scanner;
public class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    Scanner tecl = new Scanner(System.in);
    public Banco(){
        this.setSaldo(0);
        this.setStatus(false);
    }
    public void setNumConta(int num){
        this.numConta = num;
    }
    public void abrirConta(){
        System.out.println("Número da conta: ");
        int conta = tecl.nextInt();
        this.setNumConta(conta);
        System.out.println("Tipo[cc/cp]: ");
        String typ = tecl.next();
        this.setTipo(typ);
        System.out.println("Nome do Dono: ");
        String nomDon = tecl.next();
        this.setDono(nomDon);
        this.setStatus(true);
        if (typ == "cc"){
            this.setSaldo(this.getSaldo()+50);
        } else if (typ == "cp"){
            this.setSaldo(150);
        } else if (typ!="cc"&&typ!="cp") {
            System.out.println("Inválido");
        }
    }
    public void fecharConta(){
        if (this.getSaldo()!=0){
            System.out.println("Certifique-se de que o saldo da conta está zerado");
        } else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    public void depositar(){
        if (this.getStatus()==true){
            System.out.println("Digite o valor que quer depositar: ");
            float depo = tecl.nextFloat();
            this.setSaldo(this.getSaldo()+depo);
        } else {
            System.out.println("Abra uma conta primeiro");
        }
    }
    public void sacar(){
        if (this.getStatus()==true){
            System.out.println("Digite o valor a ser sacado: ");
            float saca = tecl.nextFloat();
            if (saca > this.getSaldo()){
                System.out.println("Você só pode sacar no máximo: "+this.getSaldo());
            } else{
                this.setSaldo(this.getSaldo()-saca);
            }
        } else{
            System.out.println("Abra uma conta primeiro");
        }
    }
    public void estado(){
        System.out.println("----------------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
    }
    public int getNumConta(){
        return numConta;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(){
        return tipo;
    }
    public void setDono(String don){
        this.dono = don;
    }
    public String getDono(){
        return dono;
    }
    public void setSaldo(float sal){
        this.saldo = sal;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setStatus(boolean sta){
        this.status = sta;
    }
    public boolean getStatus(){
        return status;
    }
    
}
