package demo;

import javax.swing.*;

@SuppressWarnings("serial")
public class bills extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		framework();
	}

	private static void framework() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("bills");
		frame.setBounds(0,0,1210,1200);
		
		JTextField id = new JTextField("id");
		id.setSize(50,30);
		id.setLocation(0,30);
		JTextField date = new JTextField("date");
		date.setSize(60,30);
		date.setLocation(90,30);
		
		JTextField lastDate = new JTextField("last");
		lastDate.setSize(60,30);
		lastDate.setLocation(120,30);
		
		frame.add(id);
		frame.add(date);
		frame.add(lastDate);
		frame.setVisible(true);
	}

}
