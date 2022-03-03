package cursojava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//Gerando parcelas mensais e suas datas 15.7
public class DatasEmJava05 {

		public static void main(String[] args) throws ParseException {
			//Inicializar uma data inicial 
			Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("02/03/2022");
			
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(dataInicial);//Instancia a data inicial criada
			
			//A cada iteração o .add adiciona 1 mês na data inicial
			for(int parcela = 1; parcela <= 12; parcela ++) {
				calendar.add(Calendar.MONTH, 1);
				
				System.out.println("Parcela de nº: " + parcela + " que vence em: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
			}
		}
}
