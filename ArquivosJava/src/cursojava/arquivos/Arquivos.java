package cursojava.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Arquivos {

	public static void main(String[] args) throws IOException {

		//LISTA DE PESSOAS
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setEmail("vitorosouza@gmail.com");
		pessoa1.setIdade(26);
		pessoa1.setNome("Vitor Souza");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setEmail("vos10@hotmail.com");
		pessoa2.setIdade(29);
		pessoa2.setNome("Alcindo Lobo");
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setEmail("moinho@gmail.com");
		pessoa3.setIdade(39);
		pessoa3.setNome("Maria do Rosario");
		//FIM DA LISTA DE PESSOAS
		
		//COLOCA NUMA LISTA
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		//Estancia um arquivo
		File arquivo = new File("C:\\workspace\\java-projects\\ArquivosJava\\src\\cursojava\\arquivos\\arquivo.csv");

		//Condição: "Se o arquivo NÃO existir, cria-se um novo arquivo
		if(!arquivo.exists()) { 
			arquivo.createNewFile();
		}
		
		//Estancia o objeto que escreve no arquivo
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		
		//Varre a lista escrevendo
		for (Pessoa p : pessoas) {
			escrever_no_arquivo.write(p.getNome() + ";" + p.getEmail() + ";" + p.getIdade() + "\n");
		}
		
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();
	}

}
