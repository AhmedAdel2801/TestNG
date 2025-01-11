import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;


public class SecondTestNG {
    WebDriver driver;
    @BeforeTest
    public void prepare(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
    }
    @AfterTest
    public void tearDown() throws InterruptedException {
        driver.quit();
        Thread.sleep(Duration.ofMillis(1000));
    }
    @Test (priority = 0)
    public void openBrowser()  {
        System.out.println("Opening browser.");
        driver.navigate().to("https://www.twitter.com");

    }
    @Test(priority = 1)
    public void signUp(){
        System.out.println("Signing up.");

    }
    @Test (priority = 2)
    public void logIn(){
        System.out.println("Logging in.");

    }
    @Test (priority = 3)
    public void addToCart(){
        System.out.println("Add item to cart.");

    }
    @Test (priority = 4)
    public void logOut(){
        System.out.println("Logging out.");

    }
}
