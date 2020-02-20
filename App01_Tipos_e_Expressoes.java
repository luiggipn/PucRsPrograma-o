/*************************************************************
 * Fundamentos de Programação
 * Prof. Daniel Callegari @ PUCRS
 * 
 * Tipos de Dados mais comuns e Expressões (aritméticas e lógicas)
 *************************************************************/

public class App01_Tipos_e_Expressoes
{
    public static void main (String args[])
    {
        String nomeDoAluno;
        int anoDeNascimento;
        char primeiraLetraDoNome;
        double mediaFinalAluno;
        boolean alunoAprovadoEmG1;
        final double mediaMinimaAprovacaoG1 = 7.0;  // Isso é uma constante!
        
        nomeDoAluno = "Fulano de Tal";
        anoDeNascimento = 2000;
        primeiraLetraDoNome = nomeDoAluno.charAt(0);
        mediaFinalAluno = (7.3 + 5.6 + 8.7) / 3.0;
        alunoAprovadoEmG1 = (mediaFinalAluno >= mediaMinimaAprovacaoG1);
        
        int anoAtual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        System.out.println("Nome do aluno.: " + nomeDoAluno);
        System.out.println("Idade.........: " + (anoAtual - anoDeNascimento) + " anos");
        System.out.println("Primeira letra: " + primeiraLetraDoNome);
        System.out.println("Média final...: " + mediaFinalAluno);
        System.out.println("Aluno aprovado? " + alunoAprovadoEmG1);
    
    }
}
