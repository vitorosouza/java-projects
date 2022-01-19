package cursojava.classes;
//CLASSE FILHA DE PESSOA
public class Diretor extends Pessoa {
	//ATributos
	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;

	//M�todos GETTERS e SETTERS
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	//toString()
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", registroGeral=" + registroGeral
				+ ", dataNascimento=" + dataNascimento + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}
	
	@Override //Identifica m�todo sobrescrito
    public boolean pessoaMaiorIdade() {
    	return idade >= (int) 18;
	}
	
	public String msgMaiorIdade() {
    	return this.pessoaMaiorIdade() ? "Obaaa! O aluno � maior de idade!" : "Poxa... voc� � menor de idade!";
    }
	
	@Override
	public double salario() {
		return 2700.00;
	}
	
	
}
