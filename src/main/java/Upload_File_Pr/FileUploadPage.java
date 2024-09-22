package Upload_File_Pr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;

    private By uploadFileBtn = By.xpath("//input[@name='upfile']");

    private By notesAboutFiletxt= By.xpath("//input[@name='note']");

    private By pressBtn = By.xpath("//input[@value='Press']");
}
