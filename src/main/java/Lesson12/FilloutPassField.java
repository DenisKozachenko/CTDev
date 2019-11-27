package Lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilloutPassField {

    public static WebElement passfield;
    WebDriver driver;

    public FilloutPassField(WebDriver driver){
        this.driver = driver;
    }

    public void fillPass (String pass) {

//        passfield = driver.findElement(By.xpath("//form[@class=\"form\"]/div[3]/input[@name=\"password\"]"));
        passfield = driver.findElement(By.xpath("//div[@class=\"input-text__field\"]/input[@type=\"password\"]"));
        passfield.sendKeys(pass);

    }
}
