package Lesson12;

import Lesson11.FillOutLogInForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class StartPage {

    private  WebDriver driver;

    public StartPage(WebDriver driver){
        this.driver = driver;
    }

    public void loginPage()  {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.navigate().to("https://accounts.ukr.net/login?client_id=9GLooZH9KjbBlWnuLkVX&drop_reason=logout");
        driver.manage().deleteAllCookies();
//        driver.navigate().to("http://automationpractice.com/index.php");
    }
}
