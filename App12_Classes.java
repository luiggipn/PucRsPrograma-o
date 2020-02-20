/*************************************************************
 * Fundamentos de Programação
 * Prof. Daniel Callegari @ PUCRS
 * 
 * Classes e Orientação a Objetos
 *************************************************************/
 
public class App12_Classes
{
    
    public static void main (String args[])
    {
        Veiculo v1 = new Veiculo("Ferrari", 1990);
        int km;
        
        System.out.printf("Veículo: %s (%d)\n\n", v1.obterMarca(), v1.obterAno());
        
        km = v1.verificarKM();
        System.out.println("Km atual = " + km);
        
        v1.andar(100);
        km = v1.verificarKM();
        System.out.println("Km atual = " + km);
        
        v1.andar(150);
        km = v1.verificarKM();
        System.out.println("Km atual = " + km);

    }
    
}
