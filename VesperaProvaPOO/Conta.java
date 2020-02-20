/**
Defina a classe ContaBancaria. Todas as contas possuem titular, número, agência e saldo. 
Por padrão, ao ser criada, o saldo de uma nova conta é sempre R$ 0,00. 
Defina os atributos da sua classe e os métodos básicos. Além disso, escreva um método que permita sacar e depositar valores na conta. 
Também deverá permitir transferir dinheiro entre contas. Para isso crie um método transferir(ContaBancaria destino, double valor).
Como podemos usar esse método para transferir dinheiro de uma conta para outra? 
Implemente uma classe Principal, contendo um método main, e instancie nela 2 objetos da classe ContaBancaria. 
Realize operações com as contas, como saques, depósitos e transferências. Apresente os dados de ambas as contas ao final. 
 
 */
public class Conta
{
    private String titular;
    private int ag;
    private int numeroConta;
    private double saldo;
    
    public Conta(String titular, int ag, int numeroConta)
    {
        setTitular(titular);
        if(ag>0)this.ag = ag;
        if(numeroConta>0)this.numeroConta = numeroConta;
        this.saldo = 0;
    }
    
    public String getTitular()
    {
        return titular;
    }
    public int getAg()
    {
        return ag;
    }
    public int getNumeroConta()
    {
        return numeroConta;
    }
    public double getSaldo()
    {
        return saldo;
    }
    public void setTitular(String titular)
    {
        if(titular.length()>0)this.titular = titular;
    }
    public boolean sacar(double val)
    {
        if(val<=saldo)
        {
            saldo = saldo - val;
            return true;
        }
        return false;
    }
    public boolean depositar(double val)
    {
        if(val>=0)
        {
            saldo = saldo + val;
            return true;
        }
        return false;
    }
    
}
