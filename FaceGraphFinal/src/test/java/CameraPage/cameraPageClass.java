package CameraPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class cameraPageClass {

    WebDriver driver ;
    String userName="Mostafa User";
@Test(priority = 0)
    public void OpenBrowser(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://portalsmilemeinqa.azurewebsites.net/devices/create-camera");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }
    @Test(priority = 1)
    public void FillLoginData(){
    String AccountNumber="050977";
    String Passcode="102030";

    driver.findElement(By.id("Username")).sendKeys(AccountNumber);
    driver.findElement(By.id("Password")).sendKeys(Passcode);
    driver.findElement(By.id("AutoVerificationCode")).click();
    driver.findElement(By.id("btnSubmit")).click();


    }
    @Test(priority = 2)
    public void FillRequiredData() throws InterruptedException {
   // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    Thread.sleep(8000);
    String cameraName="TestCameraMostafa";
    String CameraIP="198.168.168";

    String Password="mostafa@123";

    String Zone="testZone";

    driver.findElement(By.xpath("/html/body/app-root/side-bar/div[1]/ng-sidebar-container/div/div/perfect-scrollbar/div/div[1]/section/div/div/app-managecameras/app-cameras/div/div[2]/form/div[1]/div[1]/input-field/input")).sendKeys(cameraName);
    driver.findElement(By.xpath("/html/body/app-root/side-bar/div[1]/ng-sidebar-container/div/div/perfect-scrollbar/div/div[1]/section/div/div/app-managecameras/app-cameras/div/div[2]/form/div[1]/div[2]/input-field/input")).sendKeys(CameraIP);
    driver.findElement(By.cssSelector("body > app-root > side-bar > div.app > ng-sidebar-container > div > div > perfect-scrollbar > div > div.ps-content > section > div > div > app-managecameras > app-cameras > div > div.chk-block-content > form > div:nth-child(2) > div:nth-child(1) > input-field > input")).sendKeys(userName);
    driver.findElement(By.xpath("/html/body/app-root/side-bar/div[1]/ng-sidebar-container/div/div/perfect-scrollbar/div/div[1]/section/div/div/app-managecameras/app-cameras/div/div[2]/form/div[2]/div[2]/input-field/input")).sendKeys(Password);
    //driver.findElement(By.xpath("/html/body/app-root/side-bar/div[1]/ng-sidebar-container/div/div/perfect-scrollbar/div/div[1]/section/div/div/app-managecameras/app-cameras/div/div[2]/form/div[3]/div[1]/input-field/div/select/option[10]")).sendKeys();
    Select dropNVR= new Select(driver.findElement(By.xpath("/html/body/app-root/side-bar/div[1]/ng-sidebar-container/div/div/perfect-scrollbar/div/div[1]/section/div/div/app-managecameras/app-cameras/div/div[2]/form/div[3]/div[1]/input-field/div/select")));
    dropNVR.selectByValue("8735889f-b45d-4fc8-90bd-9b1e0e2e9a0e");

    driver.findElement(By.xpath("/html/body/app-root/side-bar/div[1]/ng-sidebar-container/div/div/perfect-scrollbar/div/div[1]/section/div/div/app-managecameras/app-cameras/div/div[2]/form/div[3]/div[2]/input-field/input")).sendKeys("Test Zone");
    //driver.findElement(By.id("EntranceCamera")).click();
    driver.findElement(By.xpath("/html/body/app-root/side-bar/div[1]/ng-sidebar-container/div/div/perfect-scrollbar/div/div[1]/section/div/div/app-managecameras/app-cameras/div/div[2]/form/button[1]")).click();
    Thread.sleep(3000);
    }

        @Test(priority = 3)
    public void RemoveCamera() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/app-root/side-bar/div[1]/ng-sidebar-container/div/div/perfect-scrollbar/div/div[1]/section/div/div/app-listcameras/div[3]/div/div[10]/data-card/div/div[2]/ul/li[3]")).click();
            Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/app-modal/div/div[3]/div/button[1]")).click();
    }
    @Test(priority = 4)
    public void CloseBrowser() throws InterruptedException {
    Thread.sleep(3000);
    driver.close();
    }


}
