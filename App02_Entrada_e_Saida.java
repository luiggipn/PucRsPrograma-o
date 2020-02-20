/*************************************************************
 * Fundamentos de Programação
 * Prof. Daniel Callegari @ PUCRS
 * 
 * Entrada e saída de dados via Console
 *************************************************************/
import java.util.Scanner;
import java.util.Calendar;

public class App02_Entrada_e_Saida
{
    public static void main (String args[])
    {
        String nomeDoAluno;
        int anoDeNascimento;
        char primeiraLetraDoNome;
        double mediaFinalAluno;
        boolean alunoAprovadoEmG1;
        final double mediaMinimaAprovacaoG1 = 7.0;  // Isso é uma constante!
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nomeDoAluno = teclado.nextLine();
        
        System.out.print("Digite seu ano de nascimento: ");
        anoDeNascimento = teclado.nextInt();
        
        System.out.print("Digite a nota do trabalho: ");
        double notaTrabalho = teclado.nextDouble();
        mediaFinalAluno = (7.3 + 5.6 + notaTrabalho) / 3.0;
        
        alunoAprovadoEmG1 = (mediaFinalAluno >= mediaMinimaAprovacaoG1);
        primeiraLetraDoNome = nomeDoAluno.charAt(0);
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println("Nome do aluno.: " + nomeDoAluno);
        System.out.println("Idade.........: " + (anoAtual - anoDeNascimento) + " anos");
        System.out.println("Primeira letra: " + primeiraLetraDoNome);
        System.out.printf("Média final...: %.2f\n", mediaFinalAluno); // Observar esta linha!
        System.out.println("Aluno aprovado? " + alunoAprovadoEmG1);
    
    }

}
