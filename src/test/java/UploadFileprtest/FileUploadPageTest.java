package UploadFileprtest;

import Upload_File_Pr.Common_Base_Test_upload;
import Upload_File_Pr.FileUploadPage;
import org.testng.annotations.Test;

public class FileUploadPageTest extends Common_Base_Test_upload {

    FileUploadPage fileUploadPage;

    @Test(priority = 1, description = "testing for file upload", groups = "Regression")
       public void FileUploadPageTest()
        {
            fileUploadPage = new FileUploadPage(driver);
            fileUploadPage.fileUpload();

        }



    }



