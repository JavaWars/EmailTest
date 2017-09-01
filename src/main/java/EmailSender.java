import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;

/**
 * Created by Pavel on 28.03.2017.
 */
public class EmailSender {
    public static void main(String[] args) {

        EmailService emailService=new EmailService("email","password");
        for (int i=0;i<100;i++) {
            emailService.sendMessage("artem.krikun@nure.ua", "важное сообщение "+i, "ты лалка!");
        }
    }
}
