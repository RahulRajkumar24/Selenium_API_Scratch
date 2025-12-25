package fb;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class LoginPage {
    public WebDriver driver;

    private By loginTextbox = By.xpath("//input[@id='email']");

    private By passwordTextbox = By.xpath("//input[@id='pass']");

    private By submitButton = By.xpath("//button[@name='login']");

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void login(String username , String password) throws IOException {
        driver.findElement(loginTextbox).sendKeys(Keys.CLEAR);
                //clear();
        driver.findElement(loginTextbox).sendKeys(username);
      //  ((JavascriptExecutor)driver).executeScript("return document.ready state").equals("complete");
        driver.findElement(passwordTextbox).clear();
        driver.findElement(passwordTextbox).sendKeys(password);
      //  ((JavascriptExecutor)driver).executeScript("return document.ready state").equals("complete");
        driver.findElement(submitButton).click();




        TakesScreenshot t=(TakesScreenshot) driver;
        File src=t.getScreenshotAs(OutputType.FILE);
        File dest = new File("./screenshot/p1.png");
        FileUtils.copyFile(src, dest);

    }
}
