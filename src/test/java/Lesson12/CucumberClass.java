package Lesson12;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Path;
import java.nio.file.Paths;



public class CucumberClass {

    WebDriver driver;


    public StartPage startPage;
    public FilloutLoginField fillLoginField;
    public FilloutPassField filloutPassField;

    @Given("I am on the login page")
    public void logInPage(){
        Path chromeDriverPath = Paths.get("D:\\Install/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", String.valueOf(chromeDriverPath.toAbsolutePath()));

        //----------------------------------------------------------------------------------------
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        driver = new ChromeDriver(options);
        startPage = new StartPage(driver);
        startPage.loginPage();
    }
    @And("I fillout Login field")
    public void fillOutLoginField(){
        fillLoginField = new FilloutLoginField(driver);
        fillLoginField.fillLogIn("dkozachenko");
    }
    @And("I fillout password field")
    public void fillPassword(){
        filloutPassField = new FilloutPassField(driver);
        filloutPassField.fillPass("test");
    }

}
