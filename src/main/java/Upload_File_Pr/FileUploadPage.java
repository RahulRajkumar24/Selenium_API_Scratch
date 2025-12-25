package Upload_File_Pr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage {
    public WebDriver driver;

    private By uploadFileBtn = By.xpath("//input[@name='upfile']");

    private By notesAboutFiletxt= By.xpath("//input[@name='note']");

    private By pressBtn = By.xpath("//input[@value='Press']");

    public FileUploadPage(WebDriver driver){
        this.driver=driver;

    }
    public void fileUpload(){
        driver.findElement(uploadFileBtn).click();
        driver.findElement(uploadFileBtn).sendKeys("C:\\Users\\Vinaya\\Desktop\\Upload_Test");
        driver.findElement(notesAboutFiletxt).sendKeys("Sample note pad notes");
        driver.findElement(pressBtn).click();
    }
}
