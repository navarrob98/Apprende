package module1;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Apprende extends JPanel {
	private static final long serialVersionUID = 1L;
	JLabel labelImg;
	JPanel contentPane;
	JFrame frame;
	int aciertos = 0, vidas = 3, record;
	public Apprende(String opc, String imgSel, int height, int width) {
		frame = new JFrame(opc);
    	frame.setSize(height, width);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setVisible(true);
    	
    	contentPane = new JPanel();
        contentPane.setLayout(null);
        frame.add(contentPane);
        
        labelImg = new JLabel("");
	}
	
	public void imageLoader(String imgSel) {
		Image preIcon = new ImageIcon(this.getClass().getResource(imgSel)).getImage();	//Funciones para re-escalar imagenes.
		Image preImg = preIcon;	
		Image newImg = preImg.getScaledInstance(730, 350, java.awt.Image.SCALE_SMOOTH);
		preIcon = new ImageIcon(newImg).getImage();
		
		
		labelImg.setIcon(new ImageIcon(preIcon));
		labelImg.setBounds(25, 25, 730, 350);
		labelImg.setVisible(false);
		contentPane.add(labelImg);
		labelImg.setVisible(true);
	}
	public void setRecord(int record) {
		this.record = record;
	}
	
	public int getRecord() {
		return record;
	}
	
	public void setAciertos(int aciertos) {
		this.aciertos = aciertos;
	}
	public int getAciertos() {
		return aciertos;
	}
	
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	public int getVidas() {
		return vidas;
	}
}