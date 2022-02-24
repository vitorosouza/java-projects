package cursojava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//Calculo de dia, ano e mês com Calendar 15.5
public class DatasEmJava03 {
	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();//Pega a data atual
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2022"));//Definindo o dia "atual"
	
		calendar.add(Calendar.DAY_OF_MONTH, -40);//Data de hoje mais 40 dias
		System.out.println("Somando dia do mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 1);//Data de hoje mais 1 mês
		System.out.println("Somando o mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.YEAR, 1);//Data de hoje mais 1 mês
		System.out.println("Somando o ano: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
	}
}
