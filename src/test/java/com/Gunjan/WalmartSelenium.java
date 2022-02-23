package com.Gunjan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class WalmartSelenium {
    @Test
    private void navigatewalmartpage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shekh\\Downloads\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      //driver.get("https://amazon.com");
       // driver.get("https://amazon.com");
      System.out.println("Title of the page is  "+driver.getTitle());

        //Assert.assertEquals(driver.getTitle(),"Facebook - Log In or Sign Up");
      //  driver.findElement(By.cssSelector("input#email")).sendKeys("gunpandey03@gmail.com");
       // driver.findElement(By.id("pass")).sendKeys("abcd");
        //driver.findElement(By.name("login")).click();
       // driver.findElement(By.cssSelector("._97w3")).click();
       // driver.findElement(By.linkText("Amazon Basics")).click();
       // driver.findElement(By.xpath("//ul[@class='style__navList__Igck2']//li[@class='style__navItem__3rEc7 style__isCurrent__1yLnN style__isHeading__2UmI2']//a")).click();
              Thread.sleep(2000);
        driver.close();

    }
}
