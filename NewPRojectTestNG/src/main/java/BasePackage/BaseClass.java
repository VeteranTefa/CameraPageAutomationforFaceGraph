package BasePackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public  WebDriver driver;
    public BaseClass(WebDriver driver){
        this.driver=driver;
    }
    public  void Initialization(String url){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }
}
