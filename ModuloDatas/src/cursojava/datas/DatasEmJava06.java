package cursojava.datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

//Nova API de Data e Hora do Java (a partir do Java 8) 15.8
//Formatando data e hora com nova API 15.9
public class DatasEmJava06 {

		public static void main(String[] args) throws ParseException {
			
		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data Atual: " + dataAtual);
			
		
		LocalTime tempoAtual = LocalTime.now();
		System.out.println("Hora Atual: " + tempoAtual);
		
		LocalDateTime dataehoraAtual = LocalDateTime.now();
		System.out.println("Data e Hora Atual: " + dataehoraAtual);
			
		}
}
