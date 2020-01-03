import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Temperature extends JFrame{
	/**
	 * @param args
	 */
	
		JLabel fahrenheitLa,celsiusLa,faK,ceK;
		JTextField FahrenheitText,celsiusText;
		JButton fButton,cButton;
		public Temperature(){
			this.setBounds(0, 0,500, 300);
			this.setTitle("温度转换器");
			this.setLayout(null);
			
			fahrenheitLa = new JLabel("华氏温度");
			fahrenheitLa.setBounds(30,20,80,30);
			this.add(fahrenheitLa);
			
			FahrenheitText = new JTextField();
			FahrenheitText.setBounds(90,20,70,30);
			this.add(FahrenheitText);
			
			faK = new JLabel("℉");
			faK.setBounds(160,20,30,30);
			this.add(faK);
			
			celsiusLa = new JLabel("摄氏温度");
			celsiusLa.setBounds(210,20,80,30);
			this.add(celsiusLa);
			
			celsiusText = new JTextField();
			celsiusText.setBounds(270,20,70,30);
			this.add(celsiusText);
			
			ceK = new JLabel("℃");
			ceK.setBounds(340,20,30,30);
			this.add(ceK);
			
			fButton = new JButton("摄氏");
			fButton.setBounds(95,60,60,30);
			this.add(fButton);
			fButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e){
					String strtxt1=FahrenheitText.getText();
					double res1=Integer.valueOf(strtxt1);
					celsiusText.setText(String.format("%.2f", (res1-32)*5/9) +" ");
				}
			});
			
			cButton = new JButton("华氏");
			cButton.setBounds(275,60,60,30);
			this.add(cButton);
			cButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e){
					String strtxt2=celsiusText.getText();
					double res2=Integer.valueOf(strtxt2);
					FahrenheitText.setText(String.format("%.2f", (9/5)*res2 +32) +" ");
				}
			});
			
			this.setVisible(true);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			

		}
	
	public static void main(String[] args) {
		Temperature temperature;
		temperature = new Temperature();
		
	}
}
