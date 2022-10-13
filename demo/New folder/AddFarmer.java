package demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("serial")
public abstract class AddFarmer extends JFrame implements ActionListener {
	public static void main(String[] args) {
		//new AddFarmer();
		xyz();
	}
	
	public static void xyz(){
		JFrame name0 = new JFrame("name");
		name0.setBounds(0,0,1210,1200);
		name0.setLayout(null);
		int a=150;
		int b=50;
		
		JLabel Fname = new JLabel("Farmer's Name");
		Fname.setBounds(a-100,b,110,30);
		name0.add(Fname);
		
		JTextField name = new JTextField(15);
		name.setBounds(a,b+7,150,20);
		name0.add(name);
		

		JLabel FMobile = new JLabel("Mobile No");
		FMobile.setBounds(a+160,b,110,30);
		name0.add(FMobile);
		
		JTextField mobile_no = new JTextField(10);
		mobile_no.setBounds(a+230,b+7,150,20);
		KeyListener keyListener = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				String key = mobile_no.getText();
				int length = key.length();
				if(length > 9) {
					e.consume();
				}	
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

		};
		mobile_no.addKeyListener(keyListener);
		name0.add(mobile_no);
		

		JLabel Femail = new JLabel("email");
		Femail.setBounds(a+420,b,110,30);
		name0.add(Femail);
		
		JTextField email = new JTextField(20);
		email.setBounds(a+460,b+7,150,20);
		name0.add(email);
		
		JButton add = new JButton("add");
		add.setBounds(a+650,b+7,70,20);
		add.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {
				String name0 = name.getText();
				String mobile = mobile_no.getText();
				String email0 = email.getText();
				String regex = "^[a-zA-Z0-9_!#$%&*+/=?'{|}~^-]+(/:\\.[a-zA-Z0-9_!#$%&*+/=?'{|}~^-])*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(email0);
				if (matcher.matches()) {
				String query = "insert into farmers values("+name0+","+mobile+","+email0+")";
				}else {
					email.setText(null);
				}
			}
		});
		name0.add(add);
		name0.setVisible(true);
		name0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}