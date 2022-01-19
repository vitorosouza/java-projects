package cursojava.classes;

//CLASSE PAI/MASTER/SUPERCLASSE/
public abstract class Pessoa {

	//Atributos
	protected String nome;
	protected int idade;
	protected String registroGeral;
	protected String dataNascimento;
	protected String numeroCPF;
	protected String nomeMae;
	protected String nomePai;
	
	//Método Abstrato (método tem que ser declarado por todas as classes filhas)
	public abstract double salario();
	
	//Métodos GETTERS e SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade()  {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNumeroCPF() {
		return numeroCPF;
	}
	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	public boolean pessoaMaiorIdade() {
		return idade >= (int) 18;
	}
	
	public String msgMaiorIdade() {
    	return this.pessoaMaiorIdade() ? "Obaaa! O aluno é maior de idade!" : "Poxa... você é menor de idade!";
    }
	
	
}
