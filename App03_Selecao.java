/*************************************************************
 * Fundamentos de Programação
 * Prof. Daniel Callegari @ PUCRS
 * 
 * Seleção simples e composta (if...else)
 *************************************************************/
import java.util.Scanner;

public class App03_Selecao
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        double media = 0.0;
        String situacao = "";
        
        System.out.print("Informe a média do aluno: ");
        media = in.nextDouble();
        
        if (media >= 7.0)
        {
            situacao = "APROVADO";
        }
        else
        {
            if ((media >= 4.0) && (media < 7.0))
            {
                situacao = "EM G2";
            }
            else
            {
                situacao = "REPROVADO";
            }
        }
        
        System.out.println("Situação do aluno: " + situacao);
        
    }
}
