package cursojava.datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//Faixa de tempo ChronoUnit 15.6
public class DatasEmJava04 {
	public static void main(String[] args) throws ParseException {
		//Não precisa instanciar assim pois o .between já permite dessa forma abaixo
		//Date dataPassada = new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2021"); 
		
		//Quantos dias existe num periodo de data?
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("1995-10-10"), LocalDate.now());
		
		System.out.println("Possui " + dias + " dias a partir da faixa de data de hoje, " + LocalDate.now());
		
		
		
		
		
		
	}
}
