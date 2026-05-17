//login to flipkart


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class Flipkart_Interview_PR {
    public static void main(String[] args) throws IOException, InterruptedException {

       // WebDriverManager.chromedriver().setup();

        WebDriverManager.chromedriver().browserVersion("147").setup();
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.manage().timeouts().getImplicitWaitTimeout();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://www.flipkart.com/new-elec-clp-march-at-store?pageUID=1778936687422");

     WebElement electronics = wait.until(ExpectedConditions.elementToBeClickable
             (By.xpath("//img[@src='https://static-assets-web.flixcart.com/apex-static/images/svgs/L1Nav/electronics.svg']")));



     electronics.click();



    WebElement FirstLaptops= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='https://rukminim2.flixcart.com/fk-p-flap/196/196/image/5039469452fbd25e.png?q=90']")));

    //FirstLaptops.click();

        Actions action = new Actions(driver);
        action.moveToElement(FirstLaptops).perform();
        acti

        List<WebElement> Laptops = driver.findElements(By.xpath("//img[@src='https://rukminim2.flixcart.com/fk-p-flap/196/196/image/5039469452fbd25e.png?q=90']"));

System.out.println("size of Laptops:" + Laptops.size());


driver.quit();
    }
}
