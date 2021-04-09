package package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\test_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/delete_customer.php";
        WebElement customerID;
        String alertMessage = "";

        driver.get(baseUrl);

        // Find the input element by name then send the value for it then submit form
        customerID = driver.findElement(By.name("cusid"));
        customerID.sendKeys("12345");
        customerID.submit();

        // Switching to alert
        Alert alert = driver.switchTo().alert();

        // Capturing alert message.
        alertMessage = driver.switchTo().alert().getText();

        // Displaying alert message
        System.out.println(alertMessage);

        // Accepting alert
        alert.accept();


    }
}
