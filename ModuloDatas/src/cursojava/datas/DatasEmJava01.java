package cursojava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//Conhecendo o Objeto Calendar 15.3
public class DatasEmJava01 {

	@SuppressWarnings("deprecation")//Apenas pra sup
	public static void main(String[] args) throws ParseException {
		
		
		Calendar calendario = Calendar.getInstance();
		
		
		
		Date date = new Date();
		
		System.out.println("Data em milissegundos: " + date.getTime());
		System.out.println("Calendar em milissegundos: " + calendario.getTimeInMillis());
		System.out.println("----------------------------------");
		
		System.out.println("Dia do Mês: " + date.getDate()); //DIA DO MÊS
		System.out.println("Dia do Mês Calendar: " + calendario.get(Calendar.DAY_OF_MONTH)); //DIA DO MÊS
		System.out.println("----------------------------------");
		
		System.out.println("Dia da Semana: " + date.getDay()); //DIA DA SEMANA COMEÇANDO COM 0
		System.out.println("Dia da Semana Calendar: " + calendario.get(Calendar.DAY_OF_WEEK)); //DIA DA SEMANA COMEÇANDO COM 1
		System.out.println("----------------------------------");
		
		System.out.println("Hora do dia: " + date.getHours()); //HORA DO DIA
		System.out.println("Hora do dia Calendar: " + calendario.get(Calendar.HOUR_OF_DAY)); //HORA DO DIA
		System.out.println("----------------------------------");
		
		System.out.println("Minuto do dia: " + date.getMinutes()); //MINUTO DO DIA
		System.out.println("Minuto do dia Calendar: " + calendario.get(Calendar.MINUTE)); //MINUTO DO DIA
		System.out.println("----------------------------------");
		
		System.out.println("Mês do ano: " + date.getMonth()); //MÊS DO ANO
		System.out.println("Mês do ano Calendar: " + calendario.get(Calendar.MONTH));
		System.out.println("----------------------------------");
		
		
		System.out.println("Segundo da hora: " + date.getSeconds()); //SEGUNDO DA HORA
		System.out.println("Segundo da hora Calendar: " + calendario.get(Calendar.SECOND));
		System.out.println("----------------------------------");
		
		System.out.println("Ano: " + (date.getYear()+1900)); //ANO
		System.out.println("Ano do Calendar: " + calendario.get(Calendar.YEAR));
		System.out.println("----------------------------------");
		
		
		
		//-----------Simple Date Format-------------
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Data em formato padrão e String: " + simpleDateFormat.format(date));
		System.out.println("Calendar Data em formato padrão e String: " + simpleDateFormat.format(Calendar.getInstance().getTime()));
		System.out.println("----------------------------------");
		
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); //Formato tipo bando de dados
		System.out.println("Data em formato para banco de dados: " + simpleDateFormat.format(date));
		System.out.println("Calendar em formato para banco de dados: " + simpleDateFormat.format(Calendar.getInstance().getTime()));
		System.out.println("----------------------------------");
		
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//Objeto Date
		System.out.println("Objeto Date: " + simpleDateFormat.parse("1995-10-10"));
		System.out.println("----------------------------------");
		
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");//Objeto Date 2
		System.out.println("Objeto Date: " + simpleDateFormat.parse("18/10/1995"));
		System.out.println("----------------------------------");
		
		
		
		
		
	}
}
