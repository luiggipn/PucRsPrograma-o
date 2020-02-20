/*************************************************************
 * Fundamentos de Programação
 * Prof. Daniel Callegari @ PUCRS
 * 
 * Matrizes (arranjos bidimensionais)
 *************************************************************/
 
public class App08_Matrizes
{
    public static void main (String args[])
    {
        char[][] tabuleiro = {
            {'X','O','X'},
            {'X',' ',' '},
            {' ',' ','O'}
        };
    
        int linhas = tabuleiro.length;
        int colunas = tabuleiro[0].length;

        int casasVazias = 0;
        
        for (int lin=0; lin<linhas; lin++)
        {
            for (int col=0; col<colunas; col++)
            {
                if (tabuleiro[lin][col] == ' ')
                {
                    casasVazias++;
                }
            }
        }
        
        System.out.printf("Existem %d casas livres no tabuleiro.\n", casasVazias);
        
    }
}
