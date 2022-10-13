package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JLabel;

public class Details {


	public void Detail(String iD, JLabel rate) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Password");
			// System.out.println("Connected successfully"); 
			try( Statement stmt = con.createStatement()){
				String query = "SELECT * FROM `farmer's_list` WHERE ID = '"+iD+"'";
					ResultSet rs = stmt.executeQuery(query);	
					//System.out.println("query run successfully from details");
					if(rs.next()) {
						String iDgot = rs.getString("Id");
						String Namegot = rs.getString("Name");
						rate.setText("Id - "+iDgot + "  Name - "+ Namegot);
					}else {
						rate.setText("Id:- "+iD +" Not Found");
						Records.id.setText(null);
						
					}
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

	public void Detail(String iD) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Password");
			try( Statement stmt = con.createStatement()){
				String query = "SELECT * FROM `farmer's_list` WHERE ID = '"+iD+"'";
					ResultSet rs = stmt.executeQuery(query);	
					if(rs.next()) {
						String iDgot = rs.getString("Id");
						String Namegot = rs.getString("Name");
						bills.gid.setText("Id - "+iDgot + "   Name - "+ Namegot);
					}else {
						bills.gid.setText(" Not Found");
						bills.id.setText(null);
					}
			}
			con.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			bills.gid.setText("sql fail");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			bills.gid.setText("server connection faield");
		}
	}

	public static String getid(String name0, String mobile, String email01) {
		// TODO Auto-generated method stub

		String iDgot = "";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Password");
			try( Statement stmt = con.createStatement()){
				String query = "SELECT id FROM `farmer's_list` WHERE name = '"+name0+"'AND email = '"+email01+"'AND Mobile_No = '"+mobile+"'";
					ResultSet rs = stmt.executeQuery(query);	
					if(rs.next()) {
						iDgot = rs.getString("Id");
					}else {
						AddFarmer.result.setText(" Not Found");
					}
			}
			con.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			AddFarmer.result.setText("sql fail");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			AddFarmer.result.setText("server connection faield");
		}
		return iDgot;

	}

	

}
