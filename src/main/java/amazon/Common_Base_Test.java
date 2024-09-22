import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Common_Base_Test {
public static WebDriver driver;

String baseUrl ="https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Damazon%2Bsign%26i%3Delectronics%26adgrpid%3D59527504272%26ext_vrnc%3Dhi%26hvadid%3D597352931660%26hvdev%3Dc%26hvlocphy%3D9300144%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D14291380018876354321%26hvtargid%3Dkwd-365111317397%26hydadcr%3D19941_2255885%26tag%3Dgooginhydr1-21%26ref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0";

@BeforeTest
    public void setUp(){
    WebDriverManager.chromedriver().setup();
    driver= new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    ((JavascriptExecutor) driver).executeScript("return doucment.readystate").equals("complete");
    driver.get(baseUrl);

}
@AfterTest
    public void teardown(){
    driver.quit();
}

}
