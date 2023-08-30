public class MathClasse {
    public static void main(String[] args) {
        /*Para operações mais complexas usa-se a classe math */
        System.out.println(Math.PI);// para mostrar pi
        System.out.println(Math.sqrt(25));// para square root
        System.out.println(Math.pow(3, 2));// para exponenciação
        System.out.println(Math.cbrt(27));//para raiz cúbica
        System.out.println(Math.abs(-10));// para valor absoluto
        System.out.println(Math.floor(5.7));// para arredondar para baixo = 5
        System.out.println(Math.ceil(5.1));// para arredondar para cima = 6
        System.out.println(Math.round(5.65));// para arredondar da forma convencional
        System.out.println(Math.random());// para gerar numero aleatório entre 0 e 1
        /*para gerar número aleatório entre 5 e 10 por exemplo tem que calcular: 5+math.random()*(10-5)
        5 vezes qualquer random de zero a 1 nunca vai dar 5, sempre vai dar valores abaixo aí adciona 5
        para ficar entre 5 e 10 porque sempre vai dar valores maiores que 5 e menores que 10 
         * de 20 até 30: 20 + math.random()*(30-20)
        */
        System.out.println(5+Math.random()*(10-5));
    }
}
