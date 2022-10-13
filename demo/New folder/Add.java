package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Add {
	public static void main(String[] args) {
	 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Password");
			try( Statement stmt = con.createStatement()){
						float  fat = 3.0f;
						float snf = 8.0f;
						float rate = 33.0f;
						for(int i = 0; i < 21; i++) {
							snf = 8.0f;
							float rate1 = rate;
							for(int j = 0; j < 26; j++) {
								String snf1 = String.format("%.1f",snf);
								String quary = "INSERT INTO `ratetable` (`fat`, `snf`, `rate`) VALUES (?,? ,? )" ;
								PreparedStatement prep = con.prepareStatement(quary);
								prep.setFloat(1,fat);
								prep.setString(2,snf1);
								prep.setFloat(3,rate1);
								
								prep.execute();	
								System.out.println("query run successfully");
								snf = snf + 0.1f;
								rate1 = rate1 + 0.2f;
							}
							fat = fat + 0.1f;
							rate1 = rate+0.2f;
							rate = rate1;
						}
					}
			con.close();
	 }catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println("sql fail");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}