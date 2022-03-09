package cursojava.arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


public class ApachePoi_Escrever01 {

	public static void main(String[] args) throws Exception {
		//Cria o arquivo
		File file = new File("C:\\workspace\\java-projects\\ArquivosJava\\src\\cursojava\\arquivos\\arquivo_excel.xls");
		//Se não existe...
		if(!file.exists()) {
			file.createNewFile();//... irá criar um novo arquivo.
		}
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
				pessoa3.setEmail("moinhoge@gmail.com");
				pessoa3.setIdade(39);
				pessoa3.setNome("Maria do Rosario");
				//FIM DA LISTA DE PESSOAS
				
				//COLOCA NUMA LISTA
				List<Pessoa> pessoas = new ArrayList<Pessoa>();
				pessoas.add(pessoa1);
				pessoas.add(pessoa2);
				pessoas.add(pessoa3);
				
				//INICIO DA CRIAÇÃO DA PLANILHA
				HSSFWorkbook hssfWorkbook = new HSSFWorkbook(); //Obejto usado para escrever na planilha
				HSSFSheet linhasPessoa = hssfWorkbook.createSheet("Planilha Pessoas"); //Cria a planilha/aba
				
				//Controle para adicionar linhas na planilha, pois no For Each ele resetaria a linha
				int numeroLinha = 0;
				
				/* Pra cada pessoa eu vou criar uma linha e pra cada atributo de uma pessoa
				 * vou criar uma célula */
				for (Pessoa p : pessoas) {
					Row linha = linhasPessoa.createRow(numeroLinha ++); //Criando a linha na planilha
					
					int celula = 0;
					Cell celNome = linha.createCell(celula ++);//Celula 1
					celNome.setCellValue(p.getNome());
					
					Cell celEmail = linha.createCell(celula ++);//Celula 2
					celEmail.setCellValue(p.getEmail());
					
					Cell celIdade = linha.createCell(celula ++);//Celula 3
					celIdade.setCellValue(p.getIdade());
				}//FIM DA CRIAÇÃO DA PLANILHA
				
				FileOutputStream saida = new FileOutputStream(file);
				hssfWorkbook.write(saida);//Escreve a planilha em arquivo
				saida.flush();
				saida.close();
				
				System.out.println("A planilha foi criada!");
				
	}
}
