package mayurssss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MiniProject3 {
    public  static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
      //  WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        WebElement username  = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement login = driver.findElement(By.id("login-button"));
        login.click();


         try{
             Thread.sleep (5000);
         }catch (Exception e){

         }

        WebElement cart = driver.findElement(By.xpath("//button[@id = 'add-to-cart-sauce-labs-backpack']"));
        cart.click();

        WebElement shoppingcart = driver.findElement(By.className("shopping_cart_link"));
        shoppingcart.click();

      /*  WebElement itemname = driver.findElement(By.className("inventory_item_name"));*/

        WebElement remove = driver.findElement(By.id("remove-sauce-labs-backpack"));
        remove.click();

        /*WebElement badge = driver.findElement(By.className("shopping_cart_badge"));
        String count = badge.getText();*/

       /* driver.findElements(By.className("shopping_cart_badge"));*/

        if (driver.findElements(By.className("shopping_cart_badge")).size() == 0){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }



       /* String actual = itemname.getText();

        String expect = "Sauce Labs Backpack";

        if(actual.equals(expect)) {
            System.out.println("Pass");
        }
            else{
                System.out.println("Fail");
            }*/






       driver.quit();
    }
}
