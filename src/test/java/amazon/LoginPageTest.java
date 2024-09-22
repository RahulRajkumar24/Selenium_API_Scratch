import amazon.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTest extends Common_Base_Test {
LoginPage loginPage;

@Test
    public void loginpagetest()
{
loginPage= new LoginPage(driver);
loginPage.login("rahulrajkumar.b@gmail.com","Saibaba@24");

}
}
