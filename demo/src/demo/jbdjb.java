package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jbdjb {
	public static void main(String[] args) {
		 try {							
			 float  fat = 3.0f;
			float snf = 8.0f;
			//float rate = 33.0f;
			for(int i = 0; i < 21; i++) {
				snf = 8.0f;
				//float rate1 = rate;
				for(int j = 0; j < 26; j++) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","Password");
				try( Statement stmt = con.createStatement()){
					System.out.println(snf +"   "+fat);
		String quary = "SELECT `rate` FROM ratetable WHERE format(snf,2) = format("+snf+" , 2) "
				+ " AND format(fat,2) = format("+fat+" , 2) ";
		ResultSet rs = stmt.executeQuery(quary);
		System.out.println(rs.next());
		System.out.println(rs.getString(1) +"   " + j +" "+i);
		System.out.println("query run successfully");
		snf = snf + 0.1f;
		//rate1 = rate1 + 0.2f;
	}
	//rate1 = rate+0.2f;
	//rate = rate1;
}
				fat = fat + 0.1f;
			}
		 }catch(SQLException e){
			 e.printStackTrace();
		 }catch(ClassNotFoundException e){
			 e.printStackTrace();
		 }
	}
}
