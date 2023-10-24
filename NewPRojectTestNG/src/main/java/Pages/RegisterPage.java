package Pages;

import BasePackage.BaseClass;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Locale;

public class RegisterPage extends BaseClass {

    public RegisterPage(WebDriver driver){
        super(driver);
    }



    By clickOnSpotBugs = By.id("bugs-form");
    By firstName=By.id("firstName");
    By lastName=By.id("lastName");
    By Phone=By.id("phone");
    Select Countries = new Select(driver.findElement(By.id("countries_dropdown_menu")));
    By Email=By.id("emailAddress");
    By Password=By.id("password");

    By registerButton=By.id("registerBtn");

    public void Make_Registration(String firstname,String lastname,String phone , String email,String password){
//        Locale locale = new Locale("eng.us");
//        Faker faker =new Faker(locale);
        driver.findElement(clickOnSpotBugs).click();
        driver.findElement(firstName).sendKeys(firstname);
        driver.findElement(lastName).sendKeys(lastname);
        driver.findElement(Phone).sendKeys(phone);
        Countries.selectByValue("Albania");
        driver.findElement(Email).sendKeys(email);
        driver.findElement(Password).sendKeys(password);
        driver.findElement(registerButton).click();

    }
}
