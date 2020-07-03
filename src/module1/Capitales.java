package module1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Capitales extends Apprende implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	int newNum;
	boolean flg = true;
	JLabel text_1, text_2, text_3, text_4,  newVida, newAc, labelImg, lblTimer;
	JTextField selector;
	String opc;
	
	public Capitales(String opc, String imgSel, int height, int width) {
		super(opc, imgSel, height, width);

		selector = new JTextField();
		selector.setBounds(300, 415, 150, 25);
		selector.addActionListener(this);
		
		newAc = new JLabel(String.valueOf(aciertos));
		newAc.setFont(new Font(Font.SANS_SERIF, Font.BOLD,16));
		newAc.setBounds(715,420, 100,75);
		
		newVida = new JLabel(String.valueOf(vidas));
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
	 	text_3.setBounds(330, 500, 400, 75);
	 	text_3.setVisible(false);
	 	
		text_1 = new JLabel("Capital de ");		//JLabels para mostrar el continente a seleccionar.
		text_2 = new JLabel();
		text_1.setFont(new Font(Font.SANS_SERIF, Font.BOLD,14));
		text_2.setFont(new Font(Font.SERIF, Font.BOLD,14));
		text_1.setBounds(40, 390, 400, 75);
		text_2.setBounds(113, 390, 400, 75);
		text_2.setVisible(false);
		
		contentPane.add(selector);
		contentPane.add(text_1);
		contentPane.add(text_2);
		contentPane.add(text_3);
		contentPane.add(newVida);
		contentPane.add(newAc);
		contentPane.add(lblTimer);
		contentPane.add(lblVidas);
		contentPane.add(lblAciertos);
		
		newNum = quiz()+1;
		Timeout timeout = new Timeout();
        timeout.start(0, 1000);
		contentPane.setBackground(Color.PINK);
	}
	
	public void actionPerformed(ActionEvent e) {
		String in = selector.getText();

		if(opc.equals("Aguascalientes") && in.equals("Aguascalientes")) {
			labels(flg);
		}
		else if(opc.equals("Baja California") && in.equals("Mexicali")) {
			labels(flg);
		}
		else if(opc.equals("Baja California Sur") && in.equals("La Paz")) {
			labels(flg);
		}
		else if(opc.equals("Campeche") && in.equals("Campeche")) {
			labels(flg);
		}
		else if(opc.equals("Coahuila") && in.equals("Saltillo")) {
			labels(flg);
		}
		else if(opc.equals("Colima") && in.equals("Colima")) {
			labels(flg);
		}
		else if(opc.equals("Chiapas") && in.equals("Tuxtla Gutierrez")) {
			labels(flg);
		}
		else if(opc.equals("Chihuahua") && in.equals("Chihuahua")) {
			labels(flg);
		}
		else if(opc.equals("Distrito Federal") && in.equals("Ciudad de México")) {
			labels(flg);
		}
		else if(opc.equals("Durango") && in.equals("Durango")) {
			labels(flg);
		}
		else if(opc.equals("Guanajuato") && in.equals("Guanajuato")) {
			labels(flg);
		}
		else if(opc.equals("Guerrero") && in.equals("Chilpancingo")) {
			labels(flg);
		}
		else if(opc.equals("Hidalgo") && in.equals("Pachuca")) {
			labels(flg);
		}
		else if(opc.equals("Jalisco") && in.equals("Guadalajara")) {
			labels(flg);
		}
		else if(opc.equals("Mexico") && in.equals("Toluca")) {
			labels(flg);
		}
		else if(opc.equals("Michoacan") && in.equals("Morelia")) {
			labels(flg);
		}
		else if(opc.equals("Morelos") && in.equals("Cuernavaca")) {
			labels(flg);
		}
		else if(opc.equals("Nayarit") && in.equals("Tepic")) {
			labels(flg);
		}
		else if(opc.equals("Nuevo Leon") && in.equals("Monterrey")) {
			labels(flg);
		}
		else if(opc.equals("Oaxaca") && in.equals("Oaxaca")) {
			labels(flg);
		}
		else if(opc.equals("Puebla") && in.equals("Puebla")) {
			labels(flg);
		}
		else if(opc.equals("Queretaro") && in.equals("Queretaro")) {
			labels(flg);
		}
		else if(opc.equals("Quintana Roo") && in.equals("Chetumal")) {
			labels(flg);
		}
		else if(opc.equals("San Luis Potosi") && in.equals("San Luis Potosi")) {
			labels(flg);
		}
		else if(opc.equals("Sinaloa") && in.equals("Culiacan")) {
			labels(flg);
		}
		else if(opc.equals("Sonora") && in.equals("Hermosillo")) {
			labels(flg);
		}
		else if(opc.equals("Tabasco") && in.equals("Villahermosa")) {
			labels(flg);
		}
		else if(opc.equals("Tamaulipas") && in.equals("Ciudad Victoria")) {
			labels(flg);
		}
		else if(opc.equals("Tlaxcala") && in.equals("Tlaxcala")) {
			labels(flg);
		}
		else if(opc.equals("Veracruz") && in.equals("Xalapa")) {
			labels(flg);
		}
		else if(opc.equals("Yucatan") && in.equals("Mérida")) {
			labels(flg);
		}
		else if(opc.equals("Zacatecas") && in.equals("Zacatecas")) {
			labels(flg);
		}
		else
			labels(!flg);
	}
	
	public int quiz() {
		Random rand = new Random();
		int num = rand.nextInt(31);;    //Genera numero al azar que se usa como indice en la lista.

		ArrayList<String> preguntas = new ArrayList<String>();  //Lista con cada continente.
		preguntas.add("Aguascalientes");
		preguntas.add("Baja California");
		preguntas.add("Baja California Sur");
		preguntas.add("Campeche");
		preguntas.add("Coahuila");
		preguntas.add("Colima");
		preguntas.add("Chiapas");
		preguntas.add("Chihuahua");
		preguntas.add("Distrito Federal");
		preguntas.add("Durango");
		preguntas.add("Guanajuato");
		preguntas.add("Guerrero");
		preguntas.add("Hidalgo");
		preguntas.add("Jalisco");
		preguntas.add("Estado de Mexico");
		preguntas.add("Michoacan");
		preguntas.add("Morelos");
		preguntas.add("Nayarit");
		preguntas.add("Nuevo Leon");
		preguntas.add("Oaxaca");
		preguntas.add("Puebla");
		preguntas.add("Queretaro");
		preguntas.add("Quintana Roo");
		preguntas.add("San Luis Potosi");
		preguntas.add("Sinaloa");
		preguntas.add("Sonora");
		preguntas.add("Tabasco");
		preguntas.add("Tamaulipas");
		preguntas.add("Tlaxcala");
		preguntas.add("Veracruz");
		preguntas.add("Yucatan");
		preguntas.add("Zacatecas");
		
		opc = preguntas.get(num);    //Accede al indice del ArrayList y obtiene lo que hay dentro.
		imageLoader("/"+ opc +".png");  //Carga la imagen del estado seleccionado.
		text_1.setVisible(true);
		text_2.setText(opc);
		text_2.setVisible(true);
		return num;
	}
	
	// Metodo para mostrar si acertaste o no.
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
		if(getVidas() >= 0)
			newNum = quiz()+1;
		else {
	 		frame.setVisible(false);
	 		new gameOver("Game Over!","", 800, 600, getAciertos());
	 		
		}
		selector.setText("");		//Limpia el texto previamente escrito en el JTextField
	}
	
	// Metodo para mostrar el timer.
	public void printTime(int minute, int second) {
	    String fullHour = "";
	    fullHour += (minute > 9) ? + minute : "0" + minute;
	    fullHour += (second > 9) ? ":" + second : ":0" + second;
	 
	    lblTimer.setText(fullHour);
	}
	 
	public class Timeout {
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