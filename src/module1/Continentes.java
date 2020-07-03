package module1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JLabel;



public class Continentes extends Apprende implements ActionListener {
	private static final long serialVersionUID = 1L;

	int newNum;
	boolean flg = true, flgTime = false;
	JLabel text_1, text_2, text_3, text_4,  newVida, newAc, labelImg, lblTimer, lblPenalty;
	
	public Continentes(String opc, String imgSel, int height, int width) {
		super(opc, imgSel, height, width);
        
		JButton btnEu = new JButton("1");
		btnEu.setBounds(370, 90, 75, 25);
		
		JButton btnAmeNorte = new JButton("2");
		btnAmeNorte.setBounds(150, 115, 75, 25);
		
		JButton btnAmeSur = new JButton("3");
		btnAmeSur.setBounds(205, 250, 75, 25);
		
		JButton btnAf = new JButton("4");
		btnAf.setBounds(380, 210, 75, 25);
		
		JButton btnAs = new JButton("5");
		btnAs.setBounds(500, 110, 75, 25);
		
		JButton btnOc = new JButton("6");
		btnOc.setBounds(590, 265, 75, 25);
		
		newAc = new JLabel(String.valueOf(getAciertos()));
		newAc.setFont(new Font(Font.SANS_SERIF, Font.BOLD,16));
		newAc.setBounds(715,420, 100,75);
		
		newVida = new JLabel(String.valueOf(getVidas()));
		newVida.setFont(new Font(Font.SANS_SERIF, Font.BOLD,16));
		newVida.setBounds(715,390, 100,75);
		
		lblTimer = new JLabel();
		lblTimer.setBounds(650,470, 100,75);
		lblTimer.setFont(new Font(Font.SANS_SERIF, Font.BOLD,16));
		
		lblPenalty = new JLabel();
		lblPenalty.setFont(new Font(Font.SANS_SERIF, Font.BOLD,25));
		lblPenalty.setBounds(310,440, 180,75);
		lblPenalty.setText("-10 Segundos");
		lblPenalty.setVisible(false);
		
		JLabel lblVidas = new JLabel("Vidas");
		lblVidas.setBounds(650,390, 100,75);
		lblVidas.setFont(new Font(Font.SANS_SERIF, Font.BOLD,16));
		
		JLabel lblAciertos = new JLabel("Aciertos");
		lblAciertos.setBounds(640,420 , 100,75);
		lblAciertos.setFont(new Font(Font.SANS_SERIF, Font.BOLD,16));
		
		text_3 = new JLabel();
	 	text_3.setFont(new Font(Font.SANS_SERIF, Font.BOLD,25));
	 	text_3.setBounds(330, 400, 400, 75);
	 	text_3.setVisible(false);
	 	
		text_1 = new JLabel("Selecciona el continente");		//JLabels para mostrar el continente a seleccionar.
		text_2 = new JLabel();
		text_1.setFont(new Font(Font.SANS_SERIF, Font.BOLD,14));
		text_2.setFont(new Font(Font.SERIF, Font.BOLD,14));
		text_1.setBounds(15, 390, 400, 75);
		text_2.setBounds(192, 390, 400, 75);
		text_2.setVisible(false);
		
		contentPane.add(text_1);
		contentPane.add(text_2);
		contentPane.add(text_3);
		contentPane.add(newVida);
		contentPane.add(newAc);
		contentPane.add(lblTimer);
		contentPane.add(lblPenalty);
		contentPane.add(lblVidas);
		contentPane.add(lblAciertos);
		contentPane.add(btnEu);
		contentPane.add(btnAmeNorte);
		contentPane.add(btnAmeSur);
		contentPane.add(btnAf);
		contentPane.add(btnAs);
		contentPane.add(btnOc);
		
		btnEu.addActionListener(this);            // link the JButton with the ActionListener.
		btnAmeNorte.addActionListener(this);
		btnAmeSur.addActionListener(this);
		btnAf.addActionListener(this);
		btnAs.addActionListener(this);
		btnOc.addActionListener(this);
		
		newNum = quiz()+1;
		Timeout timeout = new Timeout();
        timeout.start(0, 1000);
		imageLoader(imgSel);
		contentPane.setBackground(Color.PINK);
	}
	
	public int quiz() {
		String opc;
		Random rand = new Random();
		int num = rand.nextInt(6);    //Genera numero al azar que se usa como indice en la lista.
		
		ArrayList<String> preguntas = new ArrayList<String>();  //Lista con cada continente.
		preguntas.add("Europa");
		preguntas.add("America del Norte");
		preguntas.add("America del Sur");
		preguntas.add("Africa");
		preguntas.add("Asia");
		preguntas.add("Oceania");
		
		opc = preguntas.get(num);
		text_1.setVisible(true);
		text_2.setText(opc);
		text_2.setVisible(true);
		return num;
	}
	
	public void actionPerformed(ActionEvent e) {
	     //**    DETECTING EVENT SOURCES ***// 
	     String str = e.getActionCommand();	// to know which Java button user clicked
	     
	     if(str.equals("1") && newNum == 1)
	     {
	    	 labels(flg);
	     }
	     else if(str.equals("2") && newNum == 2)
	     {
	    	 labels(flg);
	     }
	     else if(str.equals("3") && newNum == 3)
	     {
	    	 labels(flg);
	     }
	     else if(str.equals("4") && newNum == 4)
	     {
	    	 labels(flg);
	     }
	     else if(str.equals("5") && newNum == 5)
	     {
	    	 labels(flg);
	     }
	     else if(str.equals("6") && newNum == 6)
	     {
	    	 labels(flg);
	     }
	     else 
	     {
	    	 labels(!flg);
		 }
	     
	}
	
	public void labels(boolean flg) {
		if(flg) {
			setAciertos(getAciertos()+1);
			newAc.setText(String.valueOf(getAciertos()));
			text_3.setVisible(true);
			text_3.setText("Correcto");
		 	text_2.setVisible(false);
		 	lblPenalty.setVisible(false);
		}
		else
		{
			setVidas(getVidas()-1);
			flgTime = true;
			newVida.setText(String.valueOf(getVidas()));
			text_3.setVisible(true);
			text_3.setText("Incorrecto");
			lblPenalty.setVisible(true);
	    	text_2.setVisible(false);
		}
		if(vidas >= 0)
			newNum = quiz()+1;
		else {
	 		frame.setVisible(false);
	 		new gameOver("Game Over!","", 800, 600, getAciertos());
		}
	}
	
	public void printTime(int minute, int second) {
	    String fullHour = "";
	    fullHour += (minute > 9) ? + minute : "0" + minute;
	    fullHour += (second > 9) ? ":" + second : ":0" + second;
	 
	    lblTimer.setText(fullHour);
	}
	 
	public class Timeout {
	 
	    //private int hour = 0;
	    private int minute = 1;
	    private int second = 30;
	    private Timer timer;
	    private boolean isTimerRunning;
	    
	 
	    public Timeout() {
	        timer = new Timer();
	        
	    }
	 
	    TimerTask task = new TimerTask() {
	        @Override
	        public void run() {
	            isTimerRunning = true;
	            if(getVidas() < 0) {
	            	isTimerRunning = false;
                    timer.cancel();
                    timer.purge();
	            }
	            if(flgTime) {
	            	second -= 10;
	            	flgTime = false;
	            }
	            if(second > 0) {
	                second--;
	            } else {
	                second = 59;
	                if(minute > 0) minute--;
	                else {
	                        isTimerRunning = false;
	                        timer.cancel();
	                        timer.purge();
	                        frame.setVisible(false);
	                        new gameOver("Game Over!","", 800, 600, getAciertos());
	                    }
	            	}
	            
	            if(isTimerRunning)
	                printTime(minute, second);
	        }
	    }; // fin timertask
	 
	    public void start(int timeout, int interval) {
	        timer.schedule(task, timeout, interval);
	    }
	 
	} // fin clase
	
	
}