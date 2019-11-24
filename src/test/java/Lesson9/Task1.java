package Lesson9;

import Lesson9_2.ExecuteSearch;
import additional.CompleteForm;
import additional.CreateAccount;
import additional.UserCredentials;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import parameters.Settings;


import javax.xml.bind.SchemaOutputResolver;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class Task1 {

    private static WebDriver driver;
    //public static UserCredentials userCredentials = new UserCredentials("dkozachenko2@gmail.com");


    public static CreateAccount createAccount ;
    public static CompleteForm completeForm;
    public static ExecuteSearch executeSearch;




    @BeforeAll
    static void startDriver()  {

        System.out.println("Before all !");
        Path chromeDriverPath = Paths.get("D:\\Install/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", String.valueOf(chromeDriverPath.toAbsolutePath()));

        //----------------------------------------------------------------------------------------
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.navigate().to(Settings.DOMAIN);
        driver.manage().deleteAllCookies();
//        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @Nested
    class FirstHomeWork{

        @Test
        public void test1() {
            System.out.println("Enter to the test");

//            createAccount.enterLogin(userCredentials.getLogin());
            createAccount = new CreateAccount(driver);
            createAccount.enterLogin("dkozachenko2@gmail.com");
            System.out.println("second step passed");

        }

        @Test
        public void test2(){
            completeForm = new CompleteForm(driver);

            completeForm.firstName.sendKeys("Denys");
            completeForm.lastName.sendKeys("Kozachenko");
            completeForm.email.sendKeys("dkozachenko@ukr.net");
            completeForm.passwd.sendKeys("qwerty");
            completeForm.firstNameAd.sendKeys("Denys");
            completeForm.lastNameAd.sendKeys("Kozach");
            completeForm.address1.sendKeys("Test");
            completeForm.city.sendKeys("Test2");
            completeForm.alias.sendKeys("Test3");
            completeForm.submitBtn.click();
            completeForm.findElements();
            completeForm.errorMessage();

        }
    }


    @Nested
    class SecondHomeWork{

        @Test
        public void test1(){

            executeSearch = new ExecuteSearch(driver);

            executeSearch.provideSearch();


        }



    }
}
