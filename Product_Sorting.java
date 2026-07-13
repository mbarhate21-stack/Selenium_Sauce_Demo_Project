package mayurssss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MiniProject4 {
    public static  void main(String[] args){
        WebDriver driver = new FirefoxDriver();
      //  WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
         password.sendKeys("secret_sauce");

         WebElement login = driver.findElement(By.id("login-button"));
         login.click();

         try{
             Thread.sleep (2000);
         } catch (Exception e) {
             throw new RuntimeException(e);
         }

         WebElement dropdown = driver.findElement(By.className("product_sort_container"));

        Select select = new Select (dropdown);
        select.selectByVisibleText("Price (low to high)");

        dropdown = driver.findElement(By.className("product_sort_container"));
        select = new Select (dropdown);

        System.out.println(select.getFirstSelectedOption().getText());








         driver.quit();

    }
}
