
/**
 * Escreva a descrição da classe Banco aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Banco
{
    private String nomeBanco;
    private Conta[] conta;
    private int contasCadastradas;
    
    public Banco(String nomeBanco)
    {
        this.nomeBanco = nomeBanco;
        this.conta = new Conta[1000];
        contasCadastradas = 0;
    }
    public void abrirConta(Conta cont)
    {
        conta[contasCadastradas] = cont;
        contasCadastradas++;       
    }
    public boolean transferir(int contaInicial, int contaDestinoTrans, double valor)
    {
        int aux=0;
        for(int i = 0; i<contasCadastradas; i++)
        {
            if(contaInicial==conta[i].getNumeroConta())
            {
                conta[i].sacar(valor); 
                aux = i;
            }
        }
        if(valor<=conta[aux].getSaldo())
        {
            for(int i = 0; i<contasCadastradas; i++)
            {
                if(contaDestinoTrans==conta[i].getNumeroConta())
                {
                    conta[i].depositar(valor);      
                    return true;
                }
            }
        }
        return false;
    }
}
