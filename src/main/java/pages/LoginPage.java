package pages;

import libs.ConfigData;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage extends ParentPage{
//    WebDriver driver;
//    Logger log;

//    String userName ="_username";
//    String password ="password";
//    String submitButtonByXPath ="//button[@type='submit']";
//
//    By userName1=By.name("_username");
//    By password1=By.id("password");
//    By submitButtonByXPath1=By.xpath("//button[@type='submit']");
//
//    WebElement userName2=driver.findElement(By.name("_username"));
//    WebElement password2=driver.findElement(By.name("password"));
//    WebElement submitButtonByXPath2=driver.findElement(By.xpath("//button[@type='submit']"));

    @FindBy (name = "_username")
    WebElement userName3;

    @FindBy (id = "password")
    WebElement password3;

    @FindBy(xpath ="//button[@type='submit']")
    WebElement submitButtonByXPath3;



    public LoginPage(WebDriver driver){
        super(driver);
    }
    public void OpenPageLogin(){
        try{
            driver.get(ConfigData.getCfgValue("base_url")+"/login");
            log.info("Page login was opened");
        }catch (Exception e){
            log.info("Can not open URL");
            Assert.fail("Can not open URL");
        }
    }
    public void OpenLoginPage(String link)

    {
        try {
            driver.get(link);
            log.info("Page was opened");
        } catch (Exception ex)
        {
            ex.printStackTrace();
            log.error("Page does not open" + ex);
        }
    }
    public void InputLoginName(String loginValue){
        actionsWithWebElements.inputTextToField(userName3,loginValue);
    }
    public void InputPassword (String pass){
        actionsWithWebElements.inputTextToField(password3,pass);
    }
    public void ClickSubmitButton(){
        actionsWithWebElements.pressButton(submitButtonByXPath3);
    }
    public void LoginUser(String loginValue, String pass){
        OpenPageLogin();
        InputLoginName(loginValue);
        InputPassword(pass);
        ClickSubmitButton();
    }
}
