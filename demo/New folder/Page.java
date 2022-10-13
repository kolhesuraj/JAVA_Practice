package demo;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.Icon;
import javax.swing.ImageIcon; 
	public class Page extends JFrame implements ActionListener {
		static JPanel buttonsPanel , Label;
		public static void main( String[] arg) {
			// TODO Auto-generated method stub
			Page obj = new Page();
			obj.demo();
		}
		public static JFrame Frame;
		private ActionListener l;
		public  void demo() {
			//frame work
			JFrame Frame = new JFrame("main");
			Frame.setSize(1890,1200);
			Frame.setLocation(0,0);
			
			//
			buttonsPanel = new JPanel();
			buttonsPanel.setBounds(0,0, 150,1200);
			buttonsPanel.setBackground(Color.black);
			//buttonsPanel.setLayout(null);
			Frame.add(buttonsPanel);
			
			//
			Label = new JPanel();
			Label.setBounds(1000,158,1200,12);
			Label.setBackground(Color.blue);
			Frame.add(Label);
			
			//
			Icon icon = new ImageIcon("C:\\Users\\suraj\\OneDrive\\Desktop\\Java\\demo\\src\\demo\\logo\\add-record1.jpeg");
			JButton Records = new JButton("new record", icon);
			Records.setSize(100,100);
			Records.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					System.out.println("you pressed records");
				}
			});
			buttonsPanel.add(Records);
			
			//
			Icon icon1 = new ImageIcon("C:\\Users\\suraj\\OneDrive\\Desktop\\Java\\demo\\src\\demo\\logo\\addUser1.png");
			JButton Farmers = new JButton("Add Framers", icon1);
			Farmers.setSize(60,30);
			Farmers.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					System.out.println("you pressed Framers");
					setPreferredSize(new Dimension(400,400));
					//Frame.add(hi);
				}
			});
			buttonsPanel.add(Farmers);
			
			//
			Icon icon2 = new ImageIcon("C:\\Users\\suraj\\OneDrive\\Desktop\\Java\\demo\\src\\demo\\logo\\Bill1.png");
			JButton bills = new JButton("bills", icon2);
			bills.setSize(60,30);
			bills.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) {
					new bills();
				}
			});
			buttonsPanel.add(bills);
			
			//
			JButton rateTable = new JButton("rate Table");
			rateTable.setSize(60,30);
			buttonsPanel.add(rateTable);
			
			//
			JLabel ButLabel = new JLabel("new Label");
			ButLabel.setLocation(400,400);
			Label.add(ButLabel);
			//set visibility of frame
			Frame.setVisible(true);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}		
	}

