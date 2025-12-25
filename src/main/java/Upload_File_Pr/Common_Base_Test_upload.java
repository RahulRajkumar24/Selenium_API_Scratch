package Upload_File_Pr;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Common_Base_Test_upload {
    public static WebDriver driver;

    String baseUrl="https://cgi-lib.berkeley.edu/ex/fup.html";

    @BeforeTest
    public  void setUp(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get(baseUrl);
    }

    @AfterTest
    public void  teardown(){
        driver.quit();
    }
}
