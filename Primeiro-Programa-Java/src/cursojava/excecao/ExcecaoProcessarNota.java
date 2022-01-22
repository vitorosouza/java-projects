package cursojava.excecao;

public class ExcecaoProcessarNota extends Exception {
	
	public ExcecaoProcessarNota(String erro) {
		
		super("Vish... Um erro no processamento das notas do aluno " + erro);
	}
	
	
}
