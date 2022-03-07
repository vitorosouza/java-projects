package cursojava.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivo {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Ta iniciando um arquivo fisico para a entrada de dados
		FileInputStream entradaArquivo =
				new FileInputStream(new File("C:\\workspace\\java-projects\\ArquivosJava\\src\\cursojava\\arquivos\\arquivo.csv"));
		//Lê o arquivo
		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		
		//Enquanto tiver dados nesse arquivo...
		while(lerArquivo.hasNext()) {
			
			//Vou pegar a minha linha...
			String linha = lerArquivo.nextLine();
			
			//Se a minha linha for válida...
			if(linha != null && !linha.isEmpty()) { 
				
				String[] dados = linha.split("\\;");//Vou quebrar essa minha linha e separar por ";"
				Pessoa pessoa = new Pessoa();//Estanciando um novo objeto (cada linha é um novo objeto) 
				pessoa.setNome(dados[0]);//Setando nome
				pessoa.setEmail(dados[1]);//Setando email
				pessoa.setIdade(Integer.parseInt(dados[2]));//Setando idade
				
				pessoas.add(pessoa); //Adicionando a pessoa na lista pessoas
			}
			
		}
		
		for (Pessoa pessoa : pessoas) { //Poderia gravar no banco de dados, gerar boleto, mandar email
			System.out.println(pessoa);
		}
		
		
	}
	
}
