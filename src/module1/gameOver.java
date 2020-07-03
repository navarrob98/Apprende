package module1;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class gameOver extends Apprende implements ActionListener{
	
		private static final long serialVersionUID = 1L;
		JLabel etiqueta, etiqueta_2, leader, etiqueta_3;
		JButton btnExit;
		
		public gameOver(String opc, String imgSel, int height, int width, int aciertos) {
			super(opc, imgSel, height, width);
			
			frame.setTitle(opc);
	        contentPane.setBackground(Color.CYAN);
	        
	        btnExit = new JButton("Menu principal");
	        btnExit.setBounds(320, 400, 130, 50);
	        btnExit.addActionListener(this);
	        
	        leader = new JLabel();
	        leader.setBounds(270, 200, 200, 75);
	        leader.setFont(new Font(Font.SANS_SERIF, Font.BOLD,24));
	        
	        etiqueta_3 = new JLabel();
	        etiqueta_3.setBounds(420, 200, 100, 75);
	        etiqueta_3.setFont(new Font(Font.SANS_SERIF, Font.BOLD,24));
	        
	        etiqueta = new JLabel();
	        etiqueta.setBounds(555, 50, 200, 200);
	        etiqueta.setFont(new Font(Font.SANS_SERIF, Font.BOLD,30));
	        etiqueta.setText(String.valueOf(aciertos));
	        
	        etiqueta_2 = new JLabel();
	        etiqueta_2.setBounds(145, 50, 700, 200);
	        etiqueta_2.setFont(new Font(Font.SANS_SERIF, Font.BOLD,30));
	        etiqueta_2.setText("Termino el Juego!!  Aciertos: ");
	        
	        contentPane.add(etiqueta_3);
	        contentPane.add(leader);
	        contentPane.add(btnExit);
	        contentPane.add(etiqueta);
	        contentPane.add(etiqueta_2);
	        leaderBoard(aciertos);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			String str = e.getActionCommand();	// to know which Java button user clicked
		     
		     if(str.equals("Menu principal")) {
		    	 frame.setVisible(false);
		    	 new Main();
		     }
		}
		
		public void leaderBoard(int aciertos) {
			int newRecord = aciertos;
			if(newRecord>record) {
				setRecord(newRecord);
				etiqueta_3.setText(String.valueOf(getRecord()));
				
			}
			else 
				etiqueta_3.setText(String.valueOf(getRecord()));
				leader.setText("El record es: ");
		}
			
	}