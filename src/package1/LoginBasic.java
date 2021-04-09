package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginBasic {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "C:\\test_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseURL = "http://demo.guru99.com/test/login.html";
        driver.get(baseURL);
        //driver.manage().window().maximize();

        // Get the WebElement corresponding to the Email Address(TextField)
        WebElement email = driver.findElement(By.id("email"));

        // Get the WebElement corresponding to the Password Field
        WebElement pass = driver.findElement(By.name("passwd"));

        // Find the submit button
        WebElement login = driver.findElement(By.id("SubmitLogin"));

        email.sendKeys("test@yopmail.com");
        pass.sendKeys("Admin@123");
        login.click();
        driver.close();

    }
}
