//package amazon;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.util.concurrent.TimeUnit;
//
//import static jdk.nashorn.internal.runtime.PropertyHashMap.findElement;
//
//public class Google_page {
//
//    @BeforeTest()
//    public void setup(){
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.google.com/");
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//
//    }
//
//    @Test(priority = 1,description = "Testing for google web page",groups = "Regression")
//    public void googletest(){
//        WebDriver driver= new ChromeDriver();
//
//     //   WebElement search_box=
//             WebElement search_box =   driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Saibaba");
//
//
//        //search_box.click();
//    }
//
//}
