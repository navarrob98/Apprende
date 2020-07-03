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

public class Paises extends Apprende implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	int newNum;
	boolean flg = true;
	JLabel text_1, text_2, text_3, text_4,  newVida, newAc, labelImg, lblTimer;
	
	public Paises(String opc, String imgSel, int height, int width) {
		super(opc, imgSel, height, width);
        
        JButton btn1 = new JButton("1");
		btn1.setBounds(100, 70, 50, 25);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(90, 115, 50, 25);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(235, 40, 50, 25);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(70, 160, 50, 25);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(192, 241, 50, 25);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(120, 206, 50, 25);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(468, 59, 50, 25);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(175, 314, 50, 25);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(348, 296, 50, 25);
		
		JButton btn10 = new JButton("10");
		btn10.setBounds(335, 149, 50, 25);
		
		JButton btn11 = new JButton("11");
		btn11.setBounds(523, 126, 50, 25);
		
		JButton btn12 = new JButton("12");
		btn12.setBounds(595, 279, 50, 25);
		
		JButton btn13 = new JButton("13");
		btn13.setBounds(120, 253, 50, 25);
		
		JButton btn14 = new JButton("14");
		btn14.setBounds(304, 101, 50, 25);
		
		JButton btn15 = new JButton("15");
		btn15.setBounds(415, 267, 50, 25);
		
		JButton btn16 = new JButton("16");
		btn16.setBounds(405, 160, 50, 25);
		
		JButton btn17 = new JButton("17");
		btn17.setBounds(330, 241, 50, 25);
		
		JButton btn18 = new JButton("18");
		btn18.setBounds(564, 217, 50, 25);
		
		JButton btn19 = new JButton("19");
		btn19.setBounds(595, 115, 50, 25);
		
		JButton btn20 = new JButton("20");
		btn20.setBounds(432, 95, 50, 25);
		
		JButton btn21 = new JButton("21");
		btn21.setBounds(478, 171, 50, 25);
		
		JButton btn22 = new JButton("22");
		btn22.setBounds(365, 115, 50, 25);
		
		JButton btn23 = new JButton("23");
		btn23.setBounds(304, 206, 50, 25);
		
		newAc = new JLabel(String.valueOf(getAciertos()));
		newAc.setFont(new Font(Font.SANS_SERIF, Font.BOLD,16));
		newAc.setBounds(715,420, 100,75);
		
		newVida = new JLabel(String.valueOf(getVidas()));
		newVida.setFont(new Font(Font.SANS_SERIF, Font.BOLD,16));
		newVida.setBounds(715,390, 100,75);
		
		lblTimer = new JLabel();
		lblTimer.setBounds(650,470, 100,75);
		lblTimer.setFont(new Font(Font.SANS_SERIF, Font.BOLD,16));
		
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
	 	
		text_1 = new JLabel("Selecciona el pais");		//JLabels para mostrar el continente a seleccionar.
		text_2 = new JLabel();
		text_1.setFont(new Font(Font.SANS_SERIF, Font.BOLD,14));
		text_2.setFont(new Font(Font.SERIF, Font.BOLD,14));
		text_1.setBounds(15, 390, 400, 75);
		text_2.setBounds(147, 390, 400, 75);
		text_2.setVisible(false);
		
		contentPane.add(text_1);
		contentPane.add(text_2);
		contentPane.add(text_3);
		contentPane.add(newVida);
		contentPane.add(newAc);
		contentPane.add(lblTimer);
		contentPane.add(lblVidas);
		contentPane.add(lblAciertos);
		contentPane.add(btn1);
		contentPane.add(btn2);
		contentPane.add(btn3);
		contentPane.add(btn4);
		contentPane.add(btn5);
		contentPane.add(btn6);
		contentPane.add(btn7);
		contentPane.add(btn8);
		contentPane.add(btn9);
		contentPane.add(btn10);
		contentPane.add(btn11);
		contentPane.add(btn12);
		contentPane.add(btn13);
		contentPane.add(btn14);
		contentPane.add(btn15);
		contentPane.add(btn16);
		contentPane.add(btn17);
		contentPane.add(btn18);
		contentPane.add(btn19);
		contentPane.add(btn20);
		contentPane.add(btn21);
		contentPane.add(btn22);
		contentPane.add(btn23);
		
		btn1.addActionListener(this);            // link the JButton with the ActionListener.
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);            
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn10.addActionListener(this);
		btn11.addActionListener(this);
		btn12.addActionListener(this);
		btn13.addActionListener(this);
		btn14.addActionListener(this);            
		btn15.addActionListener(this);
		btn16.addActionListener(this);
		btn17.addActionListener(this);
		btn18.addActionListener(this);
		btn19.addActionListener(this);
		btn20.addActionListener(this);
		btn21.addActionListener(this);
		btn22.addActionListener(this);
		btn23.addActionListener(this);
		
		newNum = quiz()+1;
		Timeout timeout = new Timeout();
        timeout.start(0, 1000);
		imageLoader(imgSel);
		contentPane.setBackground(Color.ORANGE);
	}
	
	public int quiz() {
		String opc;
		Random rand = new Random();
		int num = rand.nextInt(23);    //Genera numero al azar que se usa como indice en la lista.
		
		ArrayList<String> preguntas = new ArrayList<String>();  //Lista con cada continente.
		preguntas.add("Canada");
		preguntas.add("Estados Unidos");
		preguntas.add("Groenlandia");
		preguntas.add("Mexico");
		preguntas.add("Brasil");
		preguntas.add("Colombia");
		preguntas.add("Rusia");
		preguntas.add("Argentina");
		preguntas.add("Sudafrica");
		preguntas.add("Libia");
		preguntas.add("China");
		preguntas.add("Australia");
		preguntas.add("Peru");
		preguntas.add("Francia");
		preguntas.add("Madagascar");
		preguntas.add("Arabia Saudita");
		preguntas.add("Angola");
		preguntas.add("Indonesia");
		preguntas.add("Japon");
		preguntas.add("Kazajistan");
		preguntas.add("India");
		preguntas.add("turquia");
		preguntas.add("Nigeria");
		
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
	     else if(str.equals("7") && newNum == 7)
	     {
	    	 labels(flg);
	     }
	     else if(str.equals("8") && newNum == 8)
	     {
	    	 labels(flg);
	     }
	     else if(str.equals("9") && newNum == 9)
	     {
	    	 labels(flg);
	     }
	     else if(str.equals("10") && newNum == 10)
	     {
	    	 labels(flg);
	     }
	     else if(str.equals("11") && newNum == 11)
	     {
	    	 labels(flg);
	     }
	     else if(str.equals("12") && newNum == 12)
	     {
	    	 labels(flg);
	     }
	     else if(str.equals("13") && newNum == 13)
	     {
	    	 labels(flg);
	     }
	     else if(str.equals("14") && newNum == 14)
	     {
	    	 labels(flg);
	     }
	     else if(str.equals("15") && newNum == 15)
	     {
	    	 labels(flg);
	     }
	     else if(str.equals("16") && newNum == 16)
	     {
	    	 labels(flg);
	     }
	     else if(str.equals("17") && newNum == 17)
	     {
	    	 labels(flg);
	     }
	     else if(str.equals("18") && newNum == 18)
	     {
	    	 labels(flg);
	     }
	     else if(str.equals("19") && newNum == 19)
	     {
	    	 labels(flg);
	     }
	     else if(str.equals("20") && newNum == 20)
	     {
	    	 labels(flg);
	     }
	     else if(str.equals("21") && newNum == 21)
	     {
	    	 labels(flg);
	     }
	     else if(str.equals("22") && newNum == 22)
	     {
	    	 labels(flg);
	     }
	     else if(str.equals("23") && newNum == 23)
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
		}
		else
		{
			setVidas(getVidas()-1);
			newVida.setText(String.valueOf(getVidas()));
			text_3.setVisible(true);
			text_3.setText("Incorrecto");
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