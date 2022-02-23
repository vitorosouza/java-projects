package cursojava.datas;

import java.util.Date;

public class DatasEmJava {

	@SuppressWarnings("deprecation")//Apenas pra sup
	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println("Data em milissegundos: " + date.getTime());
		
		System.out.println("Dia do Mês: " + date.getDate()); //DIA DO MÊS
		
		System.out.println("Dia da Semana: " + date.getDay()); //DIA DA SEMANA
		
		System.out.println("Hora do dia: " + date.getHours()); //HORA DO DIA
		
		System.out.println("Minuto do dia: " + date.getMinutes()); //MINUTO DO DIA
		
		System.out.println("Mês do ano: " + date.getMonth()); //MÊS DO ANO
		
		System.out.println("Segundo da hora: " + date.getSeconds()); //SEGUNDO DA HORA
		
		System.out.println("Ano: " + (date.getYear()+1900)); //ANO
		
	}
}
