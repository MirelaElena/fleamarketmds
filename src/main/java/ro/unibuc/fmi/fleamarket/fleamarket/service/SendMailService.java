package ro.unibuc.fmi.fleamarket.fleamarket.service;

import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Service
public class SendMailService {

    public void sendHtmlEmail(String toAddress, String subject, String textMail)
            throws MessagingException {

        Properties properties = new Properties();
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.user", "dbconnectreservation@gmail.com"); // User name
        properties.put("mail.smtp.password", "parolaconnect"); // password
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        Session session = Session.getDefaultInstance(properties,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("fleaMarketApp2018@gmail.com","fleaparola");
                    }
                });

        Transport transport = session.getTransport();
        InternetAddress addressFrom = new InternetAddress("fleaMarketApp2018@gmail.com");



        MimeMessage message = new MimeMessage(session);
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(message);
        message.setContent(textMail,"text/html");
        message.setSender(addressFrom);
        message.setSubject(subject);
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(toAddress));

        transport.connect();
        Transport.send(message);
        transport.close();
    }
}
