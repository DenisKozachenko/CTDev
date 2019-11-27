package Lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class FilloutLoginField {


    WebDriver driver;

    public FilloutLoginField (WebDriver driver){
        this.driver=driver;
    }
    public static WebElement logfield;



    public void fillLogIn(String login) {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        logfield = driver.findElement(By.xpath("//div[@class=\"input-text__field\"]/input[@name=\"regular\"]"));
//        logfield = driver.findElement(By.xpath("//form[@id=\"searchbox\"]/input[4]"));

        logfield.sendKeys(login);


    }
}
