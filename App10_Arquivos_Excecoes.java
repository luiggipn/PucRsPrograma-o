/*************************************************************
 * Fundamentos de Programação
 * Prof. Daniel Callegari @ PUCRS
 * 
 * Manipulação de arquivos texto e Tratamento de Exceções
 *************************************************************/
 
import java.io.*;
import java.util.*;

public class App10_Arquivos_Excecoes
{
    public static final String NOMEARQ = "NomeApp09.txt";
    
    public static void lerNome()
    {
        String nomeLido = "";
        System.out.println("Carregando nome...");
        
        try
        {
            nomeLido = carregarArquivo();
            System.out.printf("Nome '%s' carregado.\n", nomeLido);
        }
        catch (Exception e)
        {
            System.out.println("Erro ao carregar o arquivo: " + e);
        }
        
    }
    
    public static void gravarNome()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o nome a gravar: ");
        String nomeAGravar = in.nextLine();
        
        System.out.printf("Gravando nome '%s'...\n", nomeAGravar);
        
        try
        {
            gravarArquivo(nomeAGravar);
            System.out.printf("Nome gravado no arquivo '%s'.\n", NOMEARQ);
        }
        catch (Exception e)
        {
            System.out.println("Erro ao gravar o arquivo: " + e);
        }
        
    }
       
    public static void main (String args[])
    {
        System.out.println("Este programa permite ler ou gravar um nome em um arquivo texto.");
        System.out.println("O que você deseja?");
        System.out.println("\tDigite 1 para LER o nome do arquivo.");
        System.out.println("\tDigite 2 para GRAVAR um nome no arquivo.");
        System.out.print("Sua opção: ");
        Scanner in = new Scanner(System.in);
        int opcao = in.nextInt();
        
        switch (opcao)
        {
            case 1:
                lerNome();
                break;

            case 2:
                gravarNome();
                break;
                
            default:
                System.out.println("Opção inválida, finalizando.");
                break;
        }
        
        System.out.println("FIM.");
    }
    
    // ===== Métodos para carregar e gravar um arquivo texto:
    public static String carregarArquivo () throws Exception
    {
        FileReader fileReader = new FileReader(NOMEARQ);
        BufferedReader entrada = new BufferedReader(fileReader);
        String nome = entrada.readLine();
        entrada.close();
        return nome;        
    }
   
    public static void gravarArquivo (String nome) throws Exception
    {
        FileWriter fileWriter = new FileWriter(NOMEARQ);
        PrintWriter saida = new PrintWriter(fileWriter);
        saida.println(nome);
        saida.close();
    }
    
}
