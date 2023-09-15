package javapoo.aula04GetSetEConstrutor;

public class Aula04 {
    public static void main (String[] args){
        Caneta c1 = new Caneta();
        c1.setModelo("bic");
        c1.setPonta(1.2f);
        c1.status();
        CanetaConstrutor c2 = new CanetaConstrutor();
        c2.estado();
        CanetaConstrutorParametros c3 = new CanetaConstrutorParametros("Bic", 2.0f, "azul");
        c3.estado();
        CanetaConstrutorParametros c4 = new CanetaConstrutorParametros("Bic dnv", 1.320f, "lilás");
        c4.estado();



    }
}
