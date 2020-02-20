
/**
 * Escreva a descrição da classe App aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class App
{
    public static void main(String args[])
    {
        Funcionario f1 = new Funcionario("Luiggi",21,1000);
        Funcionario f2 = new Funcionario("Paula",28,1500);
        Funcionario f3 = new Funcionario("Mario Rusch",30,8500);
        Funcionario f4 = new Funcionario("Willian",28,2000);
        Funcionario f5 = new Funcionario("Carlos",18,900);       
        
        Empresa emp = new Empresa("Power Imaging",5);
        emp.contratar(f1);
        emp.contratar(f2);
        emp.contratar(f3);
        emp.contratar(f4);
        emp.contratar(f5);        
        System.out.print("\f");
        
        System.out.println(emp.getFolhaDePagamento());
        System.out.println(emp.getMediaSalario());
        
    }
}
