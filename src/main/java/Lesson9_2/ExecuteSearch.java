package Lesson9_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ExecuteSearch {

    WebDriver driver;
    public WebElement searchField;
    public WebElement searchBtn;
    public WebElement listView;
    public WebElement addToCart;
    public WebElement shoppingCart;
    public WebElement proceedChOut;
    public WebElement total;
    public WebElement dropCart;
    public WebElement addItem;

    public  ExecuteSearch  (WebDriver driver){

        this.driver = driver;

    }

    public void provideSearch (){

        searchField = driver.findElement(By.xpath("//form[@id=\"searchbox\"]/input[4]"));
        searchField.sendKeys("Blouse");
        searchBtn = driver.findElement(By.xpath("//form[@id=\"searchbox\"]/button"));
        searchBtn.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        listView = driver.findElement(By.xpath("//div[@class=\"sortPagiBar clearfix \"]/ul/li[3]/a"));
        listView.click();

        addToCart = driver.findElement(By.xpath("//div[@class=\"row\"]/div[3]/div/div[2]/a"));

        addToCart.click();

        proceedChOut = driver.findElement(By.xpath("//div[@class=\"clearfix\"]/div[2]/div[4]/a"));
        proceedChOut.click();

        addItem = driver.findElement(By.xpath("//tbody/tr/td[5]/div/a[2]"));
        addItem.click();

//        shoppingCart = driver.findElement(By.xpath("//div[@class=\"shopping_cart\"]/a"));
//        shoppingCart.click();
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//



//
        total = driver.findElement(By.xpath("//tfoot/tr[6]/td[2]/span[contains(text(), '$56.00')]"));
//
        dropCart = driver.findElement(By.xpath("//tbody/tr/td[7]/div/a"));
        dropCart.click();







    }

}
