/*************************************************************
 * Fundamentos de Programação
 * Prof. Daniel Callegari @ PUCRS
 * 
 * Métodos (estáticos): Procedimentos e Funções
 *************************************************************/
import java.util.Scanner;

public class App06_Metodos
{
    public static void desenhaLinha (int qtdCaracteres)
    {
        for (int i = 0; i < qtdCaracteres; i++)
        {
            System.out.print("=");
        }
    }
    
    public static int numeroAoQuadrado (int numero)
    {
        int resultado = numero * numero;
        return resultado;
    }
    
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        
        //Desenha uma linha ======================
        desenhaLinha(30);
    
        // Repete até que usuário digite valor positivo
        int valor = 0;
        do
        {
            System.out.print("\nDigite um valor positivo: ");
            valor = in.nextInt();
        } while (valor <= 0);
        
        // Chama a função
        int quadrado = numeroAoQuadrado(valor);
        
        System.out.print("\nO valor ao quadrado é: " + quadrado);
        
        //Desenha outra linha ======================
        desenhaLinha(30);
        
        
    }
}
