package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckbox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\test_driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseURL = "http://demo.guru99.com/test/radio.html";
        driver.get(baseURL);

        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
        WebElement radio3 = driver.findElement(By.id("vfb-7-3"));

        radio2.click();

        WebElement checkbox1 = driver.findElement(By.id("vfb-6-0"));
        WebElement checkbox2 = driver.findElement(By.id("vfb-6-1"));
        WebElement checkbox3 = driver.findElement(By.id("vfb-6-2"));

        checkbox2.click();
        if(checkbox1.isSelected()){
            System.out.println("Checkbox1 is selected");
        }
        else {
            System.out.println("Checkbox1 is not selected");
        }

        driver.close();

    }
}
