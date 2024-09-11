/**
 * A classe Main realiza o cálculo da média de quatro notas predefinidas.
 *
 * <p>
 * O programa define quatro notas diretamente no código, calcula a média
 * divindo por 4.
 * </p>
 *
 * @author Lucas Jardim
 */
public class Main {

    /**
     * O método principal {@code main} faz o cálculo da média das quatro notas
     * e exibe o resultado no console.
     *
     * @param args Argumentos da linha de comando (não utilizados neste exemplo).
     */
    public static void main(String[] args) {
        double nota1 = 8.5;
        double nota2 = 7.0;
        double nota3 = 9.2;
        double nota4 = 6.8;

        // Cálculo da média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Exibição da média no console
        System.out.println("Média das notas é: " + media);
    }
}
