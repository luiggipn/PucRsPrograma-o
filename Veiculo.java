/*************************************************************
 * Fundamentos de Programação
 * Prof. Daniel Callegari @ PUCRS
 * 
 * Classe que representa um veículo (+ pequeno exemplo JavaDoc)
 * 
 * Experimente mudar de "Código Fonte" para "Documentação" no
 * menu no canto superior direito.
 *************************************************************/
 
public class Veiculo
{
    private String marca;   // Ex. Ford
    private int ano;        // Ex. 2018
    private int km;         // Ex. 18525
    
    public Veiculo (String marca, int anoFabricacao)
    {
        this.marca = marca;
        this.ano = anoFabricacao;
        this.km = 0;
    }
    
    public String obterMarca ()
    {
        return this.marca;
    }
    
    public int obterAno ()
    {
        return this.ano;
    }
    
    public int verificarKM ()
    {
        return this.km;
    }
    
    /**
     * Método andar: Faz o veículo "andar" alguns km; aceita somente valores positivos.
     * 
     * @param qtdKM A quantidade de km a andar.
     */
    public void andar (int qtdKM)
    {
        if (qtdKM > 0)
        {
            System.out.printf("%s (%d) andou %d km.\n", this.marca, this.ano, qtdKM);
            this.km = this.km + qtdKM;
        }
    }
    
}
