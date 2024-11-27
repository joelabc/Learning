package AGTrek;


import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AGTrek {

    private static final String EMAIL_FROM = "joelabraham098@gmail.com";
//    private static final String EMAIL_TO = "joelabraham098@gmail.com";

    private static final String APP_PASSWORD = "adjd csqd ckrh zrzw";

    public static void main(String[] args) throws InterruptedException, MessagingException {

        Message message = new MimeMessage(getEmailSession());
        message.setFrom(new InternetAddress(EMAIL_FROM));
//        message.setRecipients(Message.RecipientType.TO,  InternetAddress.parse("renjima@gmail.com,nrsabari@yahoo.com,adriel.biju@gmail.com.xcetraa@gmail.com"));
//        message.setRecipients(Message.RecipientType.TO,  InternetAddress.parse("joelabraham098@gmail.com,joelabc.dev@gmail.com"));


        System.out.println("Hello World!");

        System.setProperty("webdriver,chrome,driver","D:\\Learning\\Essential Files\\drivers\\131.6778.69\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://tvmwildlife.com/");
        Thread.sleep(5000);
        WebElement element = driver.findElement(By.xpath("//h5[contains(text(), 'Agasthyarkoodam  Off Season Package')]"));
        element.click();
        Thread.sleep(5000);

        element = driver.findElement(By.xpath("(//button[contains(text(), 'Book Now')])[2]"));

        element.click();
        Thread.sleep(5000);


        element = driver.findElement(By.xpath("//h2[@class='fc-toolbar-title']"));
        String bookingCalendar = element.getText();
        System.out.println(bookingCalendar);
        if(element.getText().equals("December 2024")){
//            message.setRecipients(Message.RecipientType.TO,  InternetAddress.parse("renjima@gmail.com,nrsabari@yahoo.com,adriel.biju@gmail.com.xcetraa@gmail.com,joelabraham098@gmail.com"));
            message.setSubject("Agastharkoodam Booking is Open for : " + bookingCalendar);
            message.setText("KINDLY START THE BOOKING");
            Transport.send(message);

        }
        else {
            message.setRecipients(Message.RecipientType.TO,  InternetAddress.parse("joelabraham098@gmail.com"));
            message.setRecipients(Message.RecipientType.CC,  InternetAddress.parse("joelabc.dev@gmail.com"));
            message.setSubject("Agastharkoodam Booking is Open for : " + bookingCalendar);
            message.setText("KINDLY WAIT FOR THE BOOKING");
            Transport.send(message);
        }
        element.click();
        driver.quit();
    }

    private static Session getEmailSession() {
        return Session.getInstance(getGmailProperties(), new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EMAIL_FROM, APP_PASSWORD);
            }
        });
    }

    private static Properties getGmailProperties() {
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        return prop;
    }
}
