import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
    @Test
            public void login() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\shekh\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://amazon.com");
    System.out.println("title of the page is  " +driver.getTitle());
//    span.nav-line-1 nav-progressive-content
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        driver.findElement(By.id("createAccountSubmit")).click();
        driver.findElement(By.id("ap_customer_name")).sendKeys("agamanaya");
        driver.findElement(By.id("ap_email")).sendKeys("agam.anaya@gmail.com");
        driver.findElement(By.id("ap_password")).sendKeys("mishra03");
        driver.findElement(By.id("ap_password_check")).sendKeys("mishra03");
        driver.findElement(By.id("continue")).click();
    Thread.sleep(2000);
     }

    }

