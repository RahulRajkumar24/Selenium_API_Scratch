package fb;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class loginpagetest extends Common_Base_Test{
    LoginPage loginPage;

    @Test
    public void loginpagetest() throws IOException {
        loginPage = new LoginPage(driver);
        loginPage.login("rahulrajkumar.b@gmail.com","Saibaba@624");

    }
}


