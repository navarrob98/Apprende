package module1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Explorar extends Apprende implements ActionListener{
	private static final long serialVersionUID = 1L;
	JLabel labelInfo;
	JButton btnExit;
	public Explorar(String opc, String imgSel, int height, int width) {
		super(opc, imgSel, height, width);
		
		btnExit = new JButton("Salir al menu principal");
		btnExit.setBounds(275, 490, 200, 50);
		labelInfo = new JLabel("Esta es una vista previa del mundo, dale un vistazo y sigue al reto!!");
		labelInfo.setFont(new Font(Font.SANS_SERIF, Font.BOLD,22));
		labelInfo.setBounds(40, 365, 800, 200);
		contentPane.add(btnExit);
		contentPane.add(labelInfo);
		
		btnExit.addActionListener(this);
		imageLoader(imgSel);
		contentPane.setBackground(Color.LIGHT_GRAY);
	}
	public void actionPerformed(ActionEvent e) {
	     //**    DETECTING EVENT SOURCES ***// 
		
	     String str = e.getActionCommand();	// to 
	     if(str.equals("Salir al menu principal")) {
	    	 frame.setVisible(false);
	    	 new Main();
	     }
	}
}
