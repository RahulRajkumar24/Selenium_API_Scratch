package fb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Common_Base_Test {
public static WebDriver driver;

String baseUrl ="https://www.facebook.com/";

@BeforeTest
    public void setUp(){
    WebDriverManager.chromedriver().setup();

    driver= new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.switchTo().alert().dismiss();
    driver.switchTo().frame(2);
   // ((JavascriptExecutor) driver).executeScript("return doucment.readystate").equals("complete");
    driver.get(baseUrl);

}
@AfterTest
    public void teardown(){
    driver.quit();
}

}
