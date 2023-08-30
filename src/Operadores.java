public class Operadores {
    public static void main(String[] args) {
        /*int n1 = 3;
        int n2 = 42;
        float med = (n1+n2)/2.0f;
        //obs: Nunca esquecer o f depois de declarar float para não truncar e mostrar somente a parte inteira
        System.out.printf("A média é %.4f \n", med);
        System.out.printf("O resto da divisão é \n" + ((n1+n2)%2)); */
        /*pré incremento e pós incremento */
        int x = 9;
        int y = 5 + x++;
        // Aqui ele vai somar x com y e depois vai incrementar o x, o resultado que vai aparecer é sem o incremento
        int num = 9;
        int valor = 5 + ++num;
        // aqui o resultado que vai aparecer já é com incremento, pois ele vai incrementar para depois somar
        //o mesmo serve para --
        System.out.printf("%d \n %d \n", y, valor);// para inteiros não é %i lol
        x += 2;// = x = x+2
        x %= 2;// = x = x%2 a mesma coisa para os demais operadores
        
    }
}
