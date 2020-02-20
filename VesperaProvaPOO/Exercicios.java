
public class Exercicios 
{
	private String nomeExercicio;	
	private int qntSeries;
	private int qntRepeticoes;
	private double cargaKg;
	
	public Exercicios(String nomeEx, int qntSeries, int qntRep, double carga) 
	{
		this.nomeExercicio = nomeEx;
		
		if(qntSeries>0) 
		{
			this.qntSeries = qntSeries;
		}
		else qntSeries = 3;
		
		if(qntRep>0) 
		{
			this.qntRepeticoes = qntRep;
		}
		else qntRepeticoes = 10;
		
		if(carga>0) 
		{			
			this.cargaKg = carga;
		}
		else this.cargaKg = 0;
	}
	
	public String getNomeExercicios() 
	{
		return nomeExercicio;
	}
	public int getQntSeries() 
	{
		return qntSeries;
	}
	public int getQntRepeticoes() 
	{
		return qntRepeticoes;
	}
	public double getCargaKg() 
	{
		return cargaKg;
	}
	public void setNomeExercicio(String novoNome) 
	{
		nomeExercicio = novoNome;
	} 
	public void setQntSeries(int novoQnt) 
	{
		qntSeries = novoQnt;
	} 
	public void setQntRepeticoes(int novoQnt) 
	{
		qntRepeticoes = novoQnt;
	} 
	public void setCargaKg(double novoCarga) 
	{
		cargaKg = novoCarga;
	} 
	
}
