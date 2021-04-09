package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\test_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://www.facebook.com";
        String tagName = "";

        driver.get(baseUrl);
        WebElement emailElement = driver.findElement(By.id("email"));
        WebElement passlElement = driver.findElement(By.id("pass"));
        WebElement loginElement = driver.findElement(By.name("login"));
        

        emailElement.sendKeys("AAA");
        passlElement.sendKeys("Admin@123");
        loginElement.click();


        //driver.close();
        System.exit(0);
    }
}
