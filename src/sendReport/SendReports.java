/**
 * 
 */
package sendReport;

/**
 * @author {Naeem Siddiq}
 *
 * {Associate Software Engineer}
 */

import java.util.Properties;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.testng.annotations.Test;

public class SendReports {

	@Test
	public void sendReportThroughMail() throws Exception {

		Thread.sleep(4000);
		final String username = "vdcheck123@gmail.com"; // ur email
		final String password = "vdcheck123456";

		Properties props = new Properties();
		props.put("mail.smtp.auth", true);
		props.put("mail.smtp.starttls.enable", true);
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("vdcheck123@gmail.com"));// your email     
																				//hammad.shabbir@venturedive.com
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("naeem.siddiq@venturedive.com,vdcheck123@gmail.com,m.naeem283@gmail.com"));// u will send to
			message.setSubject("Test Automation VenD");
			MimeBodyPart messageBodyPart = new MimeBodyPart();
			Multipart multipart = new MimeMultipart();
			
			messageBodyPart.setText("Hi!\n\nThis is a Test Automation Report of Islamic Finder..."
					+ "\n\nPlease find attached the Automation Report.You need to download it to have good results."
					+"\nThanks.\n\nRegards\nNaeem Siddiq\nAssociate Software Engineer\nVenturedive");
			multipart.addBodyPart(messageBodyPart);
			
			// attached file --------------------------------------------
			String file = "C:\\workspace\\IslamicFinder_WebAutomation\\ExtentReports\\IslamicFinder_Automation_Report.html";
			String fileName = "IslamicFinder_Automation_Report.html";
			MimeBodyPart messageBodyPart_with_file = new MimeBodyPart();
			DataSource source = new FileDataSource(file);
			messageBodyPart_with_file.setDataHandler(new DataHandler(source));
			messageBodyPart_with_file.setFileName(fileName);
			multipart.addBodyPart(messageBodyPart_with_file);

			message.setContent(multipart);

			System.out.println("sending");
			Transport.send(message);
			System.out.println("Done");

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

}
