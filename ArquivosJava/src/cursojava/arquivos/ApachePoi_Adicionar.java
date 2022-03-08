package cursojava.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


public class ApachePoi_Adicionar {

	public static void main(String[] args) throws Exception {
		
		File file = new File("C:\\workspace\\java-projects\\ArquivosJava\\src\\cursojava\\arquivos\\arquivo.xls"); //Deixa o arquivo em stand-by
		FileInputStream entrada = new FileInputStream(file); //Estancia o objeto "entrada"
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); //Prepara a entrada do arquivo Excel
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0); //Pegando a planilha a partir do �ndice 0 (1� p�gina de trabalho)
		
		Iterator<Row> linhaIterator = planilha.iterator();//Iterator para correr nas linhas
		
		while(linhaIterator.hasNext()) { //Enquanto tiver linhas no arquivo
			Row linha = linhaIterator.next(); //Dados da pessoa na linha
			
			int numeroCelulas = linha.getPhysicalNumberOfCells(); //Pega a quantidade de c�lulas 
			
			Cell cell = linha.createCell(numeroCelulas); //Criar uma nova c�lula na linha 
			cell.setCellValue("5.487,27"); //Seta o valor da nova c�lula
			
		}
		
		entrada.close(); //Fecha esse input stream e libera qualquer recurso de sistema que esteja associado com ele
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);
		saida.flush();
		saida.close();
		
		System.out.println("Planilha Atualizada");
		
	}
	
}
