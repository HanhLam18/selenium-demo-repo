package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "C:\\test_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://demo.guru99.com/test/ajax.html");

        // Find the radio button for “No” using its ID and click on it
        driver.findElement(By.id("yes")).click();

        //Click on Reset Button
        driver.findElement(By.cssSelector("input[value='Reset']")).click();

        //Click on Check Button
        //driver.findElement(By.id("buttoncheck")).click();

    }

}
