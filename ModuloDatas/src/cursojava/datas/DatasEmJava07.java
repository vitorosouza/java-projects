package cursojava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

//Formatando data e hora com nova API 15.9
public class DatasEmJava07 {

		public static void main(String[] args) throws ParseException {
			
		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data Atual: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			
		
		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora Atual: " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		
		LocalDateTime dataehoraAtual = LocalDateTime.now();
		System.out.println("Data e Hora Atual: " + dataehoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
			
		}
}
