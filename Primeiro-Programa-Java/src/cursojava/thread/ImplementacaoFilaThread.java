package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread{
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();
			
	
	//Método estático para adicionar os objetos do tipo ObjetoFilaThread na lista "pilha.fila"
	public static void add(ObjetoFilaThread objetoFilaThread) {
		
		pilha_fila.add(objetoFilaThread);
		
	}
	
	@Override
	public void run() {
		
		System.out.println("Fila rodando");
		
		while(true) {//Enquanto for verdadeiro
		
		Iterator iteracao = pilha_fila.iterator();//Iterador que ajuda a percorrer a lista 
		synchronized (iteracao) {//Bloquear o acesso a lista por outros processos
			
			while(iteracao.hasNext()) { //Enquanto conter dados na lista irá processar
				
				//Pega o objeto atual
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
				
				/*                      PROCESSA                                  */
				//Aqui seria feito todos os processos concorrentemente por trás dos panos
				//Processar 10 mil notas fiscais
				//Gerar lista enorme de PDF
				
				System.out.println("----------------------------------------");
				
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());
				
				iteracao.remove();//Remove o objeto
				
				//DÁ UM TEMPO PARA DESCARGAR DE MEMORIA
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		//MESMO DE JÁ TER FEITO O PROCESSO ACIMA, ELE PRECISAVA AINDA DE MAIS UM TEMPINHO
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		}
		
	}
	


}

