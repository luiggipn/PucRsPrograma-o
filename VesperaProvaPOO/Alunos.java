
public class Alunos 
{
	private String nome;
	private String dataNascimento;
	private int codigoAluno;
	private boolean matriculaAtiva;

	public Alunos(String nome, String dataNascimento)
	{
		if(nome.length()>0) 
		{
			this.nome = nome;
		}
		else this.nome = "Nome Invalido";
		this.dataNascimento = dataNascimento;
		this.codigoAluno = 0;
		codigoAluno++;
		this.matriculaAtiva = true;
	}
	public String getNome() 
	{
		return nome;
	}
	public String getDataNascimento() 
	{
		return dataNascimento;
	}
	public int getCodigoAluno() 
	{
		return codigoAluno;
	}
	public boolean getMatriculaAtiva()
	{
		return matriculaAtiva;
	}
	public void setNome(String novoNome) 
	{
		nome = novoNome;
	}
	public void setDataNascimento(String novaDataNasc) 
	{
		dataNascimento = novaDataNasc;
	}
	public void matriculaAtiva()
	{
		matriculaAtiva = true;
	}
	public void desativarMatricula() 
	{
		matriculaAtiva = false;
	}
}
