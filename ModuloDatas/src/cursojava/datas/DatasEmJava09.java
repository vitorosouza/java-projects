package cursojava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

//Tempo de processo com Instant 15.11
public class DatasEmJava09 {

		public static void main(String[] args) throws ParseException, InterruptedException {
			
			Instant inicio = Instant.now();
			
			Thread.sleep(2000);//Pode ser um processo com tempo qualquer que n?o conhecemos
			
			Instant ifinal = Instant.now();
			
			Duration duracao = Duration.between(inicio, ifinal);
			
			System.out.println("Dura??o em segundos: " + duracao.toSeconds());
			System.out.println("Dura??o em mili segundos: " + duracao.toMillis());
			System.out.println("Dura??o em nano segundos: " + duracao.toNanos());
			System.out.println("Dura??o em minutos: " + duracao.toMinutes());
			System.out.println("Dura??o em horas: " + duracao.toHours());
			System.out.println("Dura??o em dias: " + duracao.toDays());
			
			
		}
}
