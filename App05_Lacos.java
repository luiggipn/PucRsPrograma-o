/*************************************************************
 * Fundamentos de Programação
 * Prof. Daniel Callegari @ PUCRS
 * 
 * Laços/Loops (while, do...while, for)
 *************************************************************/
import java.util.Scanner;

public class App05_Lacos
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        
        //Desenha uma linha ======================
        int x = 1;
        while (x <= 30)
        {
            System.out.print("=");
            x++;
        }
    
        // Repete até que usuário digite valor positivo
        int valor = 0;
        do
        {
            System.out.print("\nDigite um valor positivo: ");
            valor = in.nextInt();
        } while (valor <= 0);
                
        //Desenha outra linha ======================
        for (int i = 1; i <= 30; i++)
        {
            System.out.print("=");
        }
        
    }
}
