package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Thread processando em paralelo do envio de email
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		//Thread processando em paralelo do envio de nota fiscal	
		Thread threadNota = new Thread(thread2);
		threadNota.start();
		
				
		/*Código do sistema do usuário continua o fluxo de trabalho*/
		System.out.println("ACABOU O TEMPO DE EXECUÇÃO!");
		//Fluxo do sistema, cadastro de venda, uma emissão de NF, algo do tipo...
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário!");
	} 
	
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() { //Método próprio da Thread; executa o que nós queremos
			//Código da rotina que quero executar em paralelo =======================================
			for (int pos = 0; pos < 10; pos ++) {
				
				//Quero executar esse envio com um tempo de parada (.sleep acima), ou com tempo determinado
				System.out.println((pos+1) +" Executando rotina de envio email");
				
				//Try/catch, pois o .sleep tem uma exceção no seu código+++++++++++++++++++++++++++++
				try { 
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//FIM DO TRY/CATCH ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			}
			//FIM DO CÓDIGO DE EXECUÇÃO PARALELA =====================================================
			
		}
	};
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() { //Método próprio da Thread; executa o que nós queremos
			//Código da rotina que quero executar em paralelo =======================================
			for (int pos = 0; pos < 10; pos ++) {
				
				//Quero executar esse envio com um tempo de parada (.sleep acima), ou com tempo determinado
				System.out.println((pos+1) +" Executando rotina de envio de nota fiscal");
				
				//Try/catch, pois o .sleep tem uma exceção no seu código+++++++++++++++++++++++++++++
				try { 
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//FIM DO TRY/CATCH ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
			}
			//FIM DO CÓDIGO DE EXECUÇÃO PARALELA =====================================================
			
		}
	};
	
}
