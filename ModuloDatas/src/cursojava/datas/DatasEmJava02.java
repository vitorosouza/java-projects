package cursojava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//After e Before, comparando datas menores e maiores 15.4
public class DatasEmJava02 {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("10/04/2021");//Dia do vencimento
		
		Date dataAtualHoje = simpleDateFormat.parse("07/04/2021");//Data atual
		
		//Se a data 1 é maior que a data 2?
		if(dataVencimentoBoleto.after(dataAtualHoje)) {//Posterior ou maior ou depois da data atual
			System.out.println("Boleto não vencido!");
		} else {
			System.out.println("Boleto vencido! - URGENTE");
		}
	}
}
