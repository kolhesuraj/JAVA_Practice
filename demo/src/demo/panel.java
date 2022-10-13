package demo;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class panel extends JFrame {
	//Declaring frame , panel , buttons
	static JFrame test;
	static JPanel test1;
	static JButton b1 ,b2 ,b3;
	static JLabel l;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating new frame and panel to store buttons and label
		test = new JFrame("test");
		test1 = new JPanel();
		b1 = new JButton("lets");
		l = new JLabel("hello world!");
		
		//adding background color to panel
		test1.setBackground(Color.blue);
		
		//setBounds for poisoning to any object in frame
		test1.setBounds(0,0,120,1000);
		l.setBounds(150,20,80,40);
		
		//adding panel to frame and button ,label to panel
		//Border Layout shows their place to show
		test.add(test1);
		test1.add(b1);
		test.add(l);
		test.setLayout(null);
		//setting size to frame
		//test.setSize(1545 ,828);
		test.setSize(500, 500);
		
		//Set Frame To center
		test.setLocationRelativeTo(null);
		
		//showing the frame
		test.show();
		
	}
}