public class ExercicioFinal {
    public static void main(String[]args){
        Video v[]= new Video[3];
        v[0] = new Video("Aula de Java");
        v[1] = new Video("Aula de react");
        v[2] = new Video("Aula de C#");
        System.out.println(v[0].toString());
        Aluno a[] = new Aluno[2];
        a[0] = new Aluno("Peter", 25,"M", "P04");
        a[1] = new Aluno("Quiqui", 21, "F","qui02");
        System.out.println(a[0].toString());
        Vizualizacao vis[] = new Vizualizacao[3];
        vis[0] = new Vizualizacao(a[0],v[0]);
        System.out.println(vis[0].toString());
        vis[1] = new Vizualizacao(a[0], v[0]);
        System.out.println(vis[0].toString());

    }
}
