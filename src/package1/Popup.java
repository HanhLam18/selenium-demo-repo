package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\test_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://output.jsbin.com/usidix/1";
        String alertMessage = "";

        driver.get(baseUrl);
        WebElement buttonElement;
        buttonElement = driver.findElement(By.cssSelector("input[value='Go!']"));
        buttonElement.click();

        // access the elements within the alert: switchTo().alert()
        // and then retrieve its message using the "getText()" method
        alertMessage = driver.switchTo().alert().getText();

        // and then automatically close the alert box using the "switchTo().alert().accept()" method
        driver.switchTo().alert().accept();

        System.out.println(alertMessage);

        driver.quit();



    }
}
