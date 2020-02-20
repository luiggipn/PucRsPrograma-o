/*************************************************************
 * Fundamentos de Programação
 * Prof. Daniel Callegari @ PUCRS
 * 
 * Vetores (arranjos unidimensionais)
 *************************************************************/

public class App07_Vetores
{
    public static void main (String args[])
    {
        int[] vetor = {22, 38, 19, 49, 59, 38, 58};
        
        int tamanhoVetor = vetor.length;
        
        System.out.println("Valores do vetor:");
        for (int posicao = 0; posicao < tamanhoVetor; posicao++)
        {
            int valorDaPosicao = vetor[posicao];
            System.out.printf("Posicao %d, valor = %d\n", posicao, valorDaPosicao);
        }

        // Descobre o maior valor
        int maiorValor = 0;
        for (int posicao = 0; posicao < tamanhoVetor; posicao++)
        {
            int valorDaPosicao = vetor[posicao];
            if (valorDaPosicao > maiorValor)
            {
                maiorValor = valorDaPosicao;
            }
        }
        System.out.printf("Maior valor = %d\n", maiorValor);
        
    }
}
