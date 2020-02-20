/*************************************************************
 * Fundamentos de Programação
 * Prof. Daniel Callegari @ PUCRS
 * 
 * TAD que representa um jogo entre dois times (+ um método)
 *************************************************************/
 
public class Jogo
{
    public String arbitro;
    public Time timeA;
    public Time timeB;
    
    public void mostrarDetalhes()
    {
        System.out.println("============================");
        System.out.println("            JOGO            ");
        System.out.printf(" %s vs. %s\n", timeA.nome, timeB.nome);
        System.out.printf(" Árbitro: %s\n", arbitro);
        System.out.println("============================");
    }
    
}
