package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SparesPage extends ParentPage{
    @FindBy(xpath = ".//*[@href='" + "http://v3.test.itpmgroup.com/dictionary" + "/spares/edit']")
    private WebElement plusButton;

    @FindBy(id = "spares_spareName")
    private WebElement spareName;

    @FindBy(id = "spares_spareType")
    private String spareType;

    @FindBy(name = "add")
    private WebElement submitSpareButton;

    @FindBy(xpath = ".//*/td[text()='New Spare']")
    private WebElement addedSpare;

    @FindBy(name = "delete")
    private WebElement deleteSpareButton;


    public SparesPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnPlusButton(){
        actionsWithWebElements.clickOnElement(plusButton);
    }
//
    public void enterTextIntoSpareName(String name){
        actionsWithWebElements.inputTextToField(spareName, name);
    }

    public void chooseSpareType(String type){
        actionsWithWebElements.selectDropDownByText(spareType,type);
    }

    public void clickOnSubmitSpareButton(){
        actionsWithWebElements.clickOnElement(submitSpareButton);
    }
//
    public void clickOnAddedSpare(){
        actionsWithWebElements.clickOnElement(addedSpare);
    }

    public void clickOnDeleteSpareButton(){
        actionsWithWebElements.clickOnElement(deleteSpareButton);
    }
}
