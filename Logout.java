package mayurssss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MiniProject5 {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(11));

        WebElement username =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement login = driver.findElement(By.id("login-button"));
        login.click();

        System.out.println("Login Successfully");

        WebElement menu = driver.findElement(By.xpath("//button[text() = 'Open Menu']"));
        menu.click();
        WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
        logout.click();
        WebElement verify = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Swag Labs']")));
        String act = verify.getText();
        String exp = "Swag Labs";
        if (exp.equals(act)){
            System.out.println("Logout Successfully");
        }else {
            System.out.println("Error");
        }





        driver.quit();
    }
}
