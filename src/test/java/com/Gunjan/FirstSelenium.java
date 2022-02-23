package com.Gunjan;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstSelenium {
    @Test
    public void OpenSelenium() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shekh\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        Thread.sleep(2000);
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ap_email")).sendKeys("gunjan");
        Thread.sleep(2000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        driver.close();

    }
}
