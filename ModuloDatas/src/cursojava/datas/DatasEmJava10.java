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

//Faixa de tempo com Objeto Period 15.12
public class DatasEmJava10 {

		public static void main(String[] args) throws ParseException, InterruptedException {
			
			LocalDate dataAntiga = LocalDate.of(2020, 10, 10);//Setando uma data Antiga
			LocalDate dataNova = LocalDate.of(2022, 3, 2);//Setando uma data Nova
			
			System.out.println("Data antiga é maior que data nova? " + dataAntiga.isAfter(dataNova));

			
			System.out.println("Data nova é maior que data antiga? " + dataAntiga.isBefore(dataNova));
			
			
			System.out.println("Datas são iguais? " + dataAntiga.isEqual(dataNova));
			
			Period periodo = Period.between(dataAntiga, dataNova);
			
			
			System.out.println("Quantos Anos: " + periodo.getYears());
			System.out.println("Quantos Meses: " + periodo.getMonths());
			System.out.println("Quantos Dias: " + periodo.getDays());
			
			System.out.println("Periodo é de: " + periodo.getYears() + " ano(s), " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias.");
		}
}
