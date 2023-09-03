package metodos;

public class MetodoChamado {
    public /* <-para ele conseguir ser usado em outra classe */ static String contador(int i, int f){
        String s = " ";
        for (int c = i; c<= f;c++){
            s+= (c+" ");
        }
        return s;
    }
}
