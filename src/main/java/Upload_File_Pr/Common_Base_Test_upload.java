package Upload_File_Pr;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Common_Base_Test {
    public static WebDriver driver;

    String baseUrl="https://cgi-lib.berkeley.edu/ex/fup.html";

    @BeforeTest
    public  void setUp(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(baseUrl);
    }

    @AfterTest
    public void  teardown(){
        driver.quit();
    }
}
