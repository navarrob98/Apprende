package module1;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class Main extends JFrame implements ActionListener, ItemListener {
	
	private static final long serialVersionUID = 1L;
    JPanel contentPane;
    JLabel textTitle, textCreditos, lblBckg;
    JButton btnCreditos, btnExplorar, btnPaises, btnContinentes, btnCapitales;
    JCheckBox chckbxMusica;
    Image imgPick;
    Clip clip;
    final int height = 800;
    final int width = 600;
    
    public Main() {
    	setTitle("Apprende!");
    	setSize(height, width);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	setVisible(true);

        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);
        
        textCreditos = new JLabel();
        textCreditos.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        textCreditos.setBounds(25, 60, 400, 40);
        textCreditos.setVisible(false);
        contentPane.add(textCreditos);
        
        btnCreditos = new JButton("Creditos");
        btnCreditos.setBounds(41, 31, 82, 23);
        contentPane.add(btnCreditos);

        textTitle = new JLabel("Apprende!");
        textTitle.setHorizontalAlignment(SwingConstants.CENTER);
        textTitle.setFont(new Font(Font.SANS_SERIF, Font.BOLD,24));
        textTitle.setBounds(314, 0, 200, 75);
        contentPane.add(textTitle);
        
        btnExplorar = new JButton("Explorar");    //JButtons
        btnExplorar.setBounds(266, 73, 300, 100);
        contentPane.add(btnExplorar);
        
        btnPaises = new JButton("Paises");
        btnPaises.setBounds(height/3, 200, 300, 100);
        contentPane.add(btnPaises);
        
        btnCapitales = new JButton("Capitales de Mexico");
        btnCapitales.setBounds(height/3, 325, 300, 100);
        contentPane.add(btnCapitales);
        
        btnContinentes = new JButton("Continentes");
        btnContinentes.setBounds(height/3,450, 300, 100);
        contentPane.add(btnContinentes);
        
        btnExplorar.addActionListener(this);            // link the JButton with the ActionListener
        btnPaises.addActionListener(this);
        btnCapitales.addActionListener(this);
        btnContinentes.addActionListener(this);
        btnCreditos.addActionListener(this);
		
		chckbxMusica = new JCheckBox("Musica");
		chckbxMusica.addItemListener(this);
		chckbxMusica.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxMusica.setBounds(41, 399, 67, 23);
		contentPane.add(chckbxMusica);
		Image imgPick = new ImageIcon(this.getClass().getResource("/background.jpg")).getImage();
		
		
		
		lblBckg = new JLabel("");
		lblBckg.setIcon(new ImageIcon(imgPick));
		lblBckg.setBounds(0, 0, 784, 600);
		contentPane.add(lblBckg);
		
        setContentPane(contentPane);
    }

    public void actionPerformed(ActionEvent e) {
        //**    DETECTING EVENT SOURCES ***// 
        String str = e.getActionCommand();	// to know which Java button user clicked

        if(str.equals("Explorar"))
        {
        	new Explorar("Explorar", "/Explorar.jpg", height, width);
        	this.setVisible(false);
        }
        else if(str.equals("Paises"))
        {
        	new Paises("Paises","/Mundo.png", height, width);
        	this.setVisible(false);
        }
        else if(str.equals("Capitales de Mexico"))
        {
        	new Capitales("Capitales de Mexico","/Mexico.png", height, width);
        	this.setVisible(false);
        }
        else if(str.equals("Continentes"))
        {
        	new Continentes("Continentes","/Continentes.png", height, width);
        	this.setVisible(false);
        }
        else if(str.equals("Creditos"))
        {
        	creditos();
        }
    }
    
    public void itemStateChanged(ItemEvent i) {
    	if(i.getSource() == chckbxMusica) {
    		if(i.getStateChange() == 1) {
	    		String audioFilePath = "C:/Users/Bryan Navarro/Documents/POO/Proyecto/Apprende/imgs/Musica.wav";
	        	setFile(audioFilePath);
	        	play();
    		}
    		else
    			stop();
    	}
    }
    
    public void setFile(String audioFilePath) {
    	try {
    		File file = new File(audioFilePath);
    		AudioInputStream sound = AudioSystem.getAudioInputStream(file);
    		clip = AudioSystem.getClip();
    		clip.open(sound);
    	}
    	catch(Exception e){
    		
    	}
    }
    
    public void play() {
    	clip.setFramePosition(0);
    	clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    
    public void stop() {
    	clip.stop();
    }
    
    public void creditos() {
    	if(!textCreditos.isVisible()) {
    		textCreditos.setVisible(true);
    		textCreditos.setText("Autor: Bryan Navarro Gonzalez");
    		
    	}
    	else
    		textCreditos.setVisible(false);
        
     }
    
    public static void main(String args[]) {
    	new Main();
    }
}
