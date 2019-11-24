package Login;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.openqa.selenium.By.xpath;

public class LoginSubmitButton  {


    WebDriver driver;
    public LoginSubmitButton(WebDriver driver) {
        this.driver = driver;
    }


    public void startLogin() {
        System.out.println("Enter to the third page");

      WebElement el = driver.findElement(By.xpath("//div[@class=\"header_user_info\"]/a[@class=\"login\"]"));

      el.click();


    }
}
