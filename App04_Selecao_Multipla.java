/*************************************************************
 * Fundamentos de Programação
 * Prof. Daniel Callegari @ PUCRS
 * 
 * Seleção múltipla (switch)
 *************************************************************/
import java.util.Scanner;

public class App04_Selecao_Multipla
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        Scanner inString = new Scanner(System.in);
        
        int n1, n2;
        String operacao = "";
        
        System.out.println("Informe dois números e uma operação.");
        
        System.out.print("Primeiro número: ");
        n1 = in.nextInt();
        System.out.print("Segundo número: ");
        n2 = in.nextInt();

        System.out.print("Qual operação? (+,-,*): ");
        operacao = inString.nextLine();
        
        switch (operacao)
        {
            case "+":
                System.out.println("Resultado = " + (n1+n2));
                break;

            case "-":
                System.out.println("Resultado = " + (n1-n2));
                break;
            
            case "*":
                System.out.println("Resultado = " + (n1*n2));
                break;
                
            default:
                System.out.println("Operação inválida!");
                break;
        }
        
        System.out.println("FIM");
    }
}
