package C30.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    private boolean headless = false;

    @BeforeMethod
    public void setUpDriver(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(headless);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);

        if (headless){
            driver.manage().window().setSize(new Dimension(1920, 1080));
        }
        else{
            driver.manage().window().maximize();
        }

    }

    @AfterMethod
    public void quitDriver(){
        driver.quit();
    }
}
