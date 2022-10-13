package demo;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class loginPage extends JFrame implements ActionListener {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		static JFrame LoginFrame;
		static JLabel UserId, Password,text;
		static JButton Login;
		static JPanel buttons;
		static JPasswordField pwd;
		static JTextField userName;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loginPage obj = new loginPage();
		obj.demo();
	}
	public  void demo() {
		//frame work
		LoginFrame = new JFrame("Login");
		LoginFrame.setLocation(550,250);
		LoginFrame.setSize(450,250);
		LoginFrame.setResizable(false);
		
		//labels user id and input
		UserId = new JLabel("User name");
		UserId.setBounds(100,40,150,50);
		LoginFrame.add(UserId);
		
		//input user id
		userName = new JTextField();
		userName.setBounds(180,55,150,20);
		LoginFrame.add(userName);
		
		//password field
		Password = new JLabel("password");
		Password.setBounds(100,80,150,50);
		LoginFrame.add(Password);
		
		//password input
		pwd = new JPasswordField();
		pwd.setBounds(180,98,150,20);
		LoginFrame.add(pwd);
		
		buttons = new JPanel();
		buttons.setBackground(Color.lightGray);
		LoginFrame.add(buttons);
		
		//login button
		Login = new JButton("login");
		//Login.setPreferredSize(new Dimension(70,30));
		buttons.setBounds(100,55, 70,30);
		Login.addActionListener(this);
		buttons.add(Login);
		
		//set visibility of frame
		LoginFrame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
			 System.out.println("done");
			 String user= userName.getText();
			 String password = pwd.getText();
			 System.out.println(user+" "+password);
			 Statement stmt = con.createStatement();
			 String query = "'SELECT * FROM login WHERE id ='"+user+"'AND password ='"+password+ "'";
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("Coonnection is done");
			if (rs.next()) {
				//Page page = new Page();
				//page.demo();
			}
			con.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("sql fail");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}  
	}
	
}
