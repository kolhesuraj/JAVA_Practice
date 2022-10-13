package demo;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class kjdhkjd {
	JPanel bill;
	static JLabel massage;
	JTextField id;
	static JTextField gid;
	private static float[] snf, fat, rate, weight, total;
	private static Date[] date;
	protected java.sql.Date dt2,dt3;
	protected String gh,gh3;
	private Date dt4;
	private Date dt6;
	public Component blill() {
		// TODO Auto-generated method stub
		KeyListener listner = new KeyListener() {
			public void keyPressed(KeyEvent listner) {
				// TODO Auto-generated method stub
				
				
			}

			@Override
			public void keyTyped(KeyEvent listner) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent listner) {
				// TODO Auto-generated method stub
				if(listner.getKeyChar() >= '0' && listner.getKeyChar() <= '9'|| listner.getKeyChar() >= '.') {
					if(listner.getSource() == id) {
//						String iD = id.getText();
//						Details dt = new Details();
//						dt.Detail(iD);
						}
					
				}
			}
		};

		JFrame frame = new JFrame();
		frame.setSize(800, 1200);
		frame.setLayout(null);
		frame.setVisible(true);
		bill = new JPanel();
		bill.setBounds(151,0,1370,1200);
		bill.setLayout(null);
		frame.add(bill);
		
		//
		massage = new JLabel("select start and end date for bills");
		massage.setBounds(250,10,250,20);
		bill.add(massage);
		
		int a = 50;
		int b = 50;
		//
		JLabel Id = new JLabel("ID");
		Id.setBounds(a,b,30,20);
		bill.add(Id);
		id = new JTextField();
		id.setBounds(a+20,b,50,20);
		id.addKeyListener(listner);
		bill.add(id);
		
		//
		gid = new JTextField();
		gid.setBounds(a+20,b+50,150,20);
		gid.setEditable(false);
		bill.add(gid);
		
		//
		JLabel StartDate = new JLabel("Starting Date");
		StartDate.setBounds(a+100,b,150,20);
		bill.add(StartDate);
		//
		UtilDateModel model = new UtilDateModel();
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		JDatePanelImpl datePanel = new JDatePanelImpl(model,p);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		datePicker.setBounds(a+200, b, 130, 20);
		datePicker.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(datePicker.getJFormattedTextField().getText());
				try {
					Date dt = (Date) dateformat.parse(datePicker.getJFormattedTextField().getText());
					dt4 = new java.sql.Date(dt.getTime());
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				gh = datePicker.getJFormattedTextField().getText();
				
				//dt3 = new java.sql.Date(dt.getTime());
			}
		});
		bill.add(datePicker);	
		
		

		//
		JLabel EndDate = new JLabel("Ending Date");
		EndDate.setBounds(a+350,b,150,20);
		bill.add(EndDate);
		
		//
		UtilDateModel model1 = new UtilDateModel();
		Properties p1 = new Properties();
		p1.put("text.today", "Today");
		p1.put("text.month", "Month");
		p1.put("text.year", "Year");
		JDatePanelImpl datePanel1 = new JDatePanelImpl(model1,p);
		JDatePickerImpl datePicker1 = new JDatePickerImpl(datePanel1, new DateLabelFormatter());
		datePicker1.setBounds(a+450, b, 130, 20);
		datePicker1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(datePicker1.getJFormattedTextField().getText());
				try {
					Date dt5 = (Date) dateformat.parse(datePicker1.getJFormattedTextField().getText());
					dt6 = new java.sql.Date(dt5.getTime());
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				gh3 = datePicker1.getJFormattedTextField().getText();
				//dt2 = new java.sql.Date(dt5.getTime());
			}
		});
		bill.add(datePicker1);
		
		JButton get = new JButton("GET");
		get.setBounds(a+650,b,70,30);
		bill.add(get);
		get.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				kjdhkjd.getdate(id,dt4,dt6);
			}
			
		});
		return null;
	}
	@SuppressWarnings({ "null" })
	protected static void getdate(JTextField id, Date dt42, Date dt62) {
		// TODO Auto-generated method stub
		try {
			String id1 = id.getText();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Password");
			// System.out.println("Connected successfully"); 
			try( Statement stmt = con.createStatement()){
				System.out.println(dt42+"      "+dt62);
				String query = "SELECT * FROM `record` WHERE ID = '"+id1+"' AND date between '"+dt42+"' AND '"+dt62+"'";
					ResultSet rs = stmt.executeQuery(query);	
					System.out.println("query run successfully from details");
					//System.out.println(rs.next());
					int i = 0;
					//float snf[],fat[],rate[],weight[],total[];
					//Date date[];
					while(rs.next()); {
						System.out.println(rs.getType());
		                snf[i] = rs.getFloat("snf");
		                fat[i] = rs.getFloat("fat");
						rate[i] = rs.getFloat("rate");
						weight[i] = rs.getFloat("weight");
						total[i] = rs.getFloat("total");
						date[i] = rs.getDate("date");
						i++;
						System.out.println("done "+i);
					}
					float weightt = 0,totalt = 0;
					for (int j = 0; j <= i;j++) {
						weightt = weightt+weight[j];
						totalt = totalt+total[j];
					}
					}
			con.close();
		} catch (SQLException e11) {
			// TODO Auto-generated catch block
			e11.printStackTrace();
			System.out.println("sql fail");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
/*	protected static void getdate(JTextField id, String gh2, String gh3) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Password");
			PreparedStatement st;
			ResultSet rs;
			try {
				String q1 = "select * from 'record' where id = ? and date between ? and ?";
				st = con.prepareStatement(q1);
				st.setString(1,id.toString());
				st.setString(2,gh2);
				st.setString(3,gh3);
				rs=st.executeQuery();
			}catch(SQLException e) {
				
			}
		}catch(Exception e){
			
		}*/
	}
}
