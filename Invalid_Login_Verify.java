package mayurssss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiniProject2 {
public static void main (String[] args){
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.saucedemo.com/");

    WebElement username = driver.findElement(By.id("user-name"));
    username.sendKeys("Mayur");

    WebElement password = driver.findElement(By.id("password"));
    password.sendKeys("1234663");

    WebElement login = driver.findElement(By.id("login-button"));
    login.click();


   /* WebElement error = driver.findElement(By.cssSelector("h3[data-test = 'error']"));  */
    WebElement error = driver.findElement(By.xpath("//h3[@data-test = 'error']"));
    System.out.println( "invalid error message is = " + error.getText());

    String expect = ("Epic sadface: Username and password do not match any user in this service");
    String actual = error.getText();

    if(actual.equals(expect)){
        System.out.println("Pass");
    }
    else{
        System.out.println("Fail");
    }

    driver.quit();





    }
}
