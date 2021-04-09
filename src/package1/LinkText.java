package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\test_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseURL = "http://demo.guru99.com/test/link.html";
        driver.get(baseURL);

        WebElement linkText = driver.findElement(By.linkText("click here"));
        linkText.click();

        System.out.println("Title of page is: " + driver.getTitle());
        driver.close();
    }
}
