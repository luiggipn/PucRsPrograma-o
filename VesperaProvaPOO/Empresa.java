/**
 * Escreva a descrição da classe Empresa aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
//contratar, getfolhadepagamento, getMediaSalario
public class Empresa
{
    private String empresa;
    private Funcionario[] funcionario;
    private int nroAtualFuncionarios;
    
    public Empresa(String empresa, int qntFunc)
    {
        this.empresa = empresa;
        this.funcionario = new Funcionario[qntFunc];  
        this.nroAtualFuncionarios = 0;
    }
    
    public void contratar(Funcionario func)
    {
        funcionario[nroAtualFuncionarios] = func;
        nroAtualFuncionarios++;
    }
    
    public double getFolhaDePagamento()
    {
        double soma = 0;
        for(int cont = 0; cont<nroAtualFuncionarios; cont++)
        {
            soma = soma + funcionario[cont].getSalario();
        }
        return soma;
    }
    
    public double getMediaSalario()
    {
        return getFolhaDePagamento()/nroAtualFuncionarios;
    }
}
