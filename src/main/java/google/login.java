package google;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class login {

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        String baseUrl= "https://google.co.in";
        WebDriver driver= new ChromeDriver();




}



        }