package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {
	//******************************************CRIAÇÃO DOS COMPONENTES ***************************************************
	private JPanel jPanel = new JPanel(new GridBagLayout()); //Cria um Painel de componentes
	
	private JLabel descricaoHora = new JLabel("Nome");//Cria o Label 1
	private JTextField mostraTempo = new JTextField();//Cria o TextField 1
	
	private JLabel descricaoHora2 = new JLabel("E-mail");//Cria o Label 2
	private JTextField mostraTempo2 = new JTextField();//Cria o TextField 2
	
	private JButton jButtonStart = new JButton("Gerar Lote");//Cria o Button 1 
	private JButton jButtonStop = new JButton("Stop");//Cria o Button 2
	
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
	
	//Executa oque tiver dentro, no momento da abertura/execução
	public TelaTimeThread() {
		setTitle("Tela Time Thread 1.0v");//Seta o titulo
		setSize(new Dimension(240,240));//Seta o tamanho da janela
		setLocationRelativeTo(null);//Seta a centralização da tela, porém nesse caso, não tem nenhum componente (null)
		setResizable(false);//Seta que não permite que aumente a dimensão da tela
		/*Primeira parte concluida*/
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints(); //Controlador de posicionamento de botões da tela
		gridBagConstraints.gridx = 0; //Inicia na linha 0
		gridBagConstraints.gridy = 0; //Inicia na coluna 0
		gridBagConstraints.gridwidth = 2;//Faz com que os 4 primeiros elementos tomem o lugar de 2 espaços
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		
		descricaoHora.setPreferredSize(new Dimension(200,25)); //Seta o tamanho do Label 1
		jPanel.add(descricaoHora,gridBagConstraints); //Add o Label 1 no Painel
		
		mostraTempo.setPreferredSize(new Dimension(200,25));//Seta o tamanho do TextField 1
		gridBagConstraints.gridy ++; //Soma mais 1 posição para ir para a 2ª posição do Y
		jPanel.add(mostraTempo, gridBagConstraints); //Add o TextField 1 no Painel
		
		descricaoHora2.setPreferredSize(new Dimension(200,25)); //Seta o tamanho do Label 2
		gridBagConstraints.gridy ++;//Soma mais 1 posição para ir para a 3ª posição do Y
		jPanel.add(descricaoHora2, gridBagConstraints);//Add o Label 2 no painel
		
		mostraTempo2.setPreferredSize(new Dimension(200,25));//Seta o tamanho do TextField 2
		gridBagConstraints.gridy ++;//Soma mais 1 posição para ir para a 4ª posição do Y
		jPanel.add(mostraTempo2, gridBagConstraints);//Add o TextField 2 no Painel
		
		//***********************************************************************************
		
		gridBagConstraints.gridwidth = 1;//Faz com que os dois botões ocupem 2 espaços 
		
		jButtonStart.setPreferredSize(new Dimension(92,25));//Seta o tamanho do Button 1 (START)
		gridBagConstraints.gridy ++;//Soma mais 1 posição para ir para a 5ª posição do Y
		jPanel.add(jButtonStart, gridBagConstraints);//Add o Button 1 no painel
		
		jButtonStop.setPreferredSize(new Dimension(92,25));//Seta o tamanho do Button 2 (STOP)
		gridBagConstraints.gridx ++;//Soma mais 1 posição para ir para a 2ª posição do X
		jPanel.add(jButtonStop, gridBagConstraints);//Add o Button 1 no painel
		
		
		
		//***********************************************************************************
		
		
		//Realizando a ação dos botões
		jButtonStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//Executa o clique no botão
				if(fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}
				
				
				for(int qtd = 0; qtd < 100; qtd++) {//Simulando 100 envios em massa
					
					ObjetoFilaThread filaThread = new ObjetoFilaThread();
					filaThread.setNome(mostraTempo.getText());
					filaThread.setEmail(mostraTempo.getText() + " - " + (qtd + 1));
					
					fila.add(filaThread);
				}
			}
		});
		
		jButtonStop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				fila.stop();
				fila = null;
			}
		});
		
		fila.start();
		add(jPanel, BorderLayout.WEST);//Add o Painel e executa que o painel fique centralizado
		/*Sempre será o ultimo comando à executar*/
		setVisible(true);//Torna a tela visível para o usuário
		
	}
	

}
