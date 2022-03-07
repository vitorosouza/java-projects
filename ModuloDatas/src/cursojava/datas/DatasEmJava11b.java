package cursojava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

//Data, anos, dias, meses e parcelas com LocalDate 15.13 (2º arquivo)
public class DatasEmJava11b {

		public static void main(String[] args) throws ParseException, InterruptedException {
			
			LocalDate dataBase = LocalDate.parse("2022-03-02");
			
			for (int data = 1; data <= 12; data ++) {
				dataBase = dataBase.plusMonths(1);
				
				System.out.println("Data de vencimento do boleto: " 
				+ dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " do mês " + data);
			}
			
		}
}
