/**
 * Escreva a descrição da classe Funcionario aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Funcionario
{
    private String nome;
    private int idade;
    private double salario;
    
    public Funcionario(String nome, int idade, double sal)
    {
        setNome(nome);
        setIdade(idade);
        setSalario(sal);
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public int getIdade()
    {
        return idade;
    }
    
    public double getSalario()
    {
        return salario;
    }
    
    public void setNome(String nome)
    {
        if(nome.length()>0)this.nome = nome;
    }
    
    public void setIdade(int idade)
    {
        if(idade>0 && idade<=150)this.idade = idade;
    }
    
    public void setSalario(double sal)
    {
        if(sal>0)this.salario = sal;
    }
}
