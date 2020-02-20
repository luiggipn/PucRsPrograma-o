/*************************************************************
 * Fundamentos de Programação
 * Prof. Daniel Callegari @ PUCRS
 * 
 * Testes de Unidade (testes unitários) com JUnit
 *************************************************************/
 
public class Produto
{
    private int codigo;
    private String nome;
    private double preco;
    private boolean disponivel;
    
    public Produto (int codigo, String nome)
    {
        this.codigo = codigo;
        setNome(nome);
    }
    
    public int getCodigo () { return codigo; }
    public String getNome () { return nome; }
    public double getPreco () { return preco; }
    public boolean estaDisponivel () { return disponivel; }
    
    public void setNome (String nome)
    {
        this.nome = nome;
    }
    
    public void setPreco (double preco)
    {
        this.preco = preco;
    }
    
    public void aplicarDesconto (double percentual)
    {
        double valorDesconto = preco * percentual/100.0;
        preco -= valorDesconto;
    }
    
    public void tornarDisponivel ()
    {
        this.disponivel = true;
    }

    public void tornarIndisponivel ()
    {
        this.disponivel = false;
    }

}
