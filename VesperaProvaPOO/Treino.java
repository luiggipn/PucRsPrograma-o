
public class Treino 
{
	private String objetivo;
	private String dataInicio;
	private String dataFim;
	private Exercicios[] exercicios;
	private Alunos[] alunos;
	private int qntEx;
	private int posAluno;
	
	public Treino(String objetivo, String dataInicio, String dataFim, Alunos aluno )
	{		
		this.objetivo = objetivo;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		exercicios = new Exercicios[50];
		alunos = new Alunos[100];
		alunos[posAluno]=aluno;
		posAluno++;
	}
	public boolean adicionaExTreino(Exercicios ex) 
	{		
		exercicios[qntEx]=ex;
		qntEx++;
		return true;
	}
}
