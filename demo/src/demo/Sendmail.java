package demo;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Sendmail {
	public static void main(String[] args) {
		Sendmail.send();
	}

	@SuppressWarnings("deprecation")
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
	      String to = "suraj.kolhe@moderncollegegk.org";

	      // Sender's email ID needs to be mentioned
	      String from = "surajkolhe214@gmail.com";

	      // Assuming you are sending email from localhost
	     // String host = "127.0.0.1";

	      // Get system properties
	      Properties properties = System.getProperties();

	      // Setup mail server
	     // properties.setProperty("mail.smtp.host", host);
	      properties.put("mail.smtp.host", "smtp.gmail.com");
	      properties.put("mail.smtp.socketFactory.port","465");
	      properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
	      properties.put("mail.smtp.auther","true");
	      properties.put("mail.smtp.port","465");
	      
	      // Get the default Session object.
	      Session session = Session.getDefaultInstance(properties,
	    		  new javax.mail.Authenticator() {
	    	  protected PasswordAuthentication getPasswordAuthentication(){
	    		  return new PasswordAuthentication("surajkolhe214@gmail.com", "Kolhe!@21");
	    	  }
	      }
	    		  );
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

