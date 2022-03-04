package cursojava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

//Dia, meses, anos e semanas 15.10
public class DatasEmJava08 {

		public static void main(String[] args) throws ParseException {
			
			LocalDate localDate = LocalDate.now();
			System.out.println("Data Atual: " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyy")));
			
			System.out.println("Dia da Semana: " + localDate.getDayOfWeek().name());
			
			System.out.println("Dia do Mês: " + localDate.getDayOfMonth());
			
			System.out.println("Dia do Ano: " + localDate.getDayOfYear());
			
			System.out.println("Nome do Mês: " + localDate.getMonth());
			
			System.out.println("Mês: " + localDate.getMonthValue());
			
			System.out.println("Ano: " + localDate.getYear());
			
			
			
			
			
		}
}
