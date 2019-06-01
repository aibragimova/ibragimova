package pages;

import libs.ActionsWithWebElements;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParentPage {

    WebDriver driver;
    Logger log;
    ActionsWithWebElements actionsWithWebElements;


    @FindBy(tagName = "h1")
    protected WebElement zagolovok;

    public ParentPage(WebDriver driver)
    {
        this.driver = driver;
        log = Logger.getLogger(getClass());
        PageFactory.initElements(driver,this);
        actionsWithWebElements = new ActionsWithWebElements(driver);
    }

    public String getTitle()
    {
        return driver.getTitle();
    }

    public void checkTitle(String title)
    {
        Assert.assertEquals("Title not expected",getTitle(),title);
    }

    public void checkZagolovok(String zagolovokText)
    {
        Assert.assertEquals("Zagolovok is not matched", zagolovok.getText(), zagolovokText);
    }
}