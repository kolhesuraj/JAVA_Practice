package demo;

import java.util.Date;
import java.util.Properties;
import javax.*;

public class Sendmail {
	public static void main(String[] args) {
		Sendmail.send();
	}

	public static void send() {
		// TODO Auto-generated method stub
		var currentdate = new Date(); 
		var datetime = currentdate.getDate() + "/"
		                + (currentdate.getMonth()+1)  + "/" 
		                + currentdate.getYear() + "  "  
		                + currentdate.getHours() + ":"  
		                + currentdate.getMinutes() + ":" 
		                + currentdate.getSeconds();
		System.out.println(datetime);
		  // Recipient's email ID needs to be mentioned.
	      String to = "abcd@gmail.com";

	      // Sender's email ID needs to be mentioned
	      String from = "web@gmail.com";

	      // Assuming you are sending email from localhost
	      String host = "localhost";

	      // Get system properties
	      Properties properties = System.getProperties();

	      // Setup mail server
	      properties.setProperty("mail.smtp.host", host);

	      // Get the default Session object.
	      Session session = Session.getDefaultInstance(properties);
	      try {
	          // Create a default MimeMessage object.
	          MimeMessage message = new MimeMessage(session);

	          // Set From: header field of the header.
	          message.setFrom(new InternetAddress(from));

	          // Set To: header field of the header.
	          message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

	          // Set Subject: header field
	          message.setSubject("This is the Subject Line!");

	          // Now set the actual message
	          message.setText("This is actual message");

	          // Send message
	          Transport.send(message);
	          System.out.println("Sent message successfully....");
	       } catch (MessagingException mex) {
	          mex.printStackTrace();
	       }
	}

}

