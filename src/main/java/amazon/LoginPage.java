package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;

    private By loginTextbox = By.xpath("//input[@id='ap_email']");
    private By loginButton = By.xpath("//input[@id='continue']");

    private By passwordTextbox = By.xpath("//input[@id='ap_password']");

    private By submitButton = By.xpath("//input[@id='signInSubmit']");

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

   public void login(String Username, String Password)
   {
    driver.findElement(loginTextbox).clear();
    driver.findElement(loginTextbox).sendKeys(Username);
    driver.findElement(loginButton).click();
  //  ((JavascriptExecutor)driver).executeScript("return doucment.readystate").equals("complete");
    driver.findElement(passwordTextbox).clear();
    driver.findElement(passwordTextbox).sendKeys(Password);
    driver.findElement(passwordTextbox).click();
    //   ((JavascriptExecutor)driver).executeScript("return doucment.readystate").equals("complete");
   }

}




