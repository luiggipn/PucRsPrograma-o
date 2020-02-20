/*************************************************************
 * Fundamentos de Programação
 * Prof. Daniel Callegari @ PUCRS
 * 
 * Tipos Abstratos de Dados (simplificação)
 *************************************************************/
 
public class App11_TADs
{
    public static void main (String[] args)
    {
        Time t1 = new Time();
        t1.nome = "Grêmio";
        t1.totalPontos = 12;
        
        Time t2 = new Time();
        t2.nome = "Internacional";
        t2.totalPontos = 8;
        
        Jogo j = new Jogo();
        j.arbitro = "João Carlos";
        j.timeA = t1;
        j.timeB = t2;
        
        System.out.printf("O time %s tem %d pontos.\n", t1.nome, t1.totalPontos);
        System.out.printf("O time %s tem %d pontos.\n", j.timeB.nome, j.timeB.totalPontos);
        j.mostrarDetalhes();
    }
}
