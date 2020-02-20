/*************************************************************
 * Fundamentos de Programação
 * Prof. Daniel Callegari @ PUCRS
 * 
 * Exceções (sobre entrada de dados)
 *************************************************************/
 
import java.util.Scanner;

public class App09_Excecoes
{
    public static void main (String args[])
    {
        boolean valorValido = false;
        int valor = 0;
        
        // Experimente entrar com dados inválidos, como:
        // * um valor com vírgula
        // * letras ou outros símbolos
        
        do
        {
            System.out.println("Digite um número inteiro:");
            
            try
            {
                Scanner in = new Scanner(System.in);
                valor = in.nextInt();
                valorValido = true;
            }
            catch(Exception e)
            {
                System.out.println("Oops! O que você digitou parece ser inválido!");
                System.out.println("O erro foi: " + e);
                System.out.println("Vamos reiniciar:\n");
                valorValido = false;
            }
        
        } while (!valorValido);
        
        System.out.println("Obrigado!");
        System.out.printf("Você informou o valor %d.", valor);
        
        
    }
}
