package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {
	//Atributos
	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	//CONTRATO DE AUTENTICA��O
	//Retorna TRUE caso login e senha seja admin, sen�o FALSO
		@Override
		public boolean autenticar(String login, String senha) {
			return login.equals("admin") && senha.equals("admin");
		}
	
	//M�todos GETTERS e SETTERS
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	//toString()
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", registroGeral=" + registroGeral + ", dataNascimento="
				+ dataNascimento + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	
	@Override //Identifica m�todo sobrescrito
    public boolean pessoaMaiorIdade() {
    	return idade >= (int) 18;
	}
	
	//Retorna uma resposta de acordo com a idade
	public String msgMaiorIdade() {
    	return this.pessoaMaiorIdade() ? "Obaaa! O aluno � maior de idade!" : "Poxa... voc� � menor de idade!";
    }
	
	//Sobreescreve o m�todo do sal�rio, j� que cada um pega a heran�a de Pessoa
	@Override
	public double salario() {
		return 1800.68 * 0.9;
	}
	
	
	
}
