package PagesinTest;

import BasePackage.BaseClass;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Pages.RegisterPage;

import java.io.FileReader;

public class RegisterTestPage extends BaseClass {

    public RegisterTestPage(WebDriver driver){
        super(driver);
    }

    @Test
    public void RunRegister(){

        Initialization("https://qa-practice.netlify.app/");
        RegisterPage r =new RegisterPage(driver);
        String firstName="Mostafa"
                ,lastName="Mohamed"
                ,email="mostafatest121@gmail.com"
                ,phone="01013347528"
                ,password="mostafa@test123";
        r.Make_Registration(firstName,lastName,phone,email,password);


    }

//    @DataProvider(name="dp")
//    public String[] ReadDataFromJSON(){
//        JsonParser jsonParser = new JsonParser();
//        FileReader fileReader= new FileReader("D:\\FaceGraphFinal\\NewPRojectTestNG\\src\\test\\JSON Folder\\data.json");
//        Object obj = jsonParser.parse(fileReader);
//        JsonObject jsonObject= (JsonObject) obj;
//        for (int i=0;i<jsonObject.size();i++){
//            //JsonObject users = (JsonObject)jsonObject.get("firstName");
//        }
//    }





}
