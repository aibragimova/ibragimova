package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends ParentPage {
//    public HomePage(WebDriver driver) {
//        super(driver);
//    }

    @FindBy(xpath = ".//div[@class='pull-left image']//img[@class='img-circle']")
    WebElement avatar;

    @FindBy (xpath = ".//li[@id='deal']")
    WebElement sdelki;

    @FindBy(xpath =".//*[@id='dictionary']/a")
    private WebElement menuDictionary;

    @FindBy(id = "spares")
    private WebElement subMenuSpare;

    @FindBy(id="apparat")
    private WebElement subMenuApparat;

    @FindBy(xpath = "//i[@class='fa fa-plus']")
    private WebElement subAddButton;

    @FindBy(xpath = ".//a[@class='dropdown-toggle']")
    private WebElement avatarStudent;

    @FindBy(xpath = ".//a[@href='/logout']")
    private WebElement buttonLogout;

    @FindBy(xpath = ".//a[@href='/dictionary/deal_type']")
    private WebElement subMenuTypeSdelki;

    @FindBy(xpath = "//a[@class='logo']")
    protected WebElement TitleLogo;

    @FindBy (xpath = "//input[@id='apparat_apparatNumber']")
    protected WebElement ApparatNumberTextField;

    @FindBy (xpath = "//input[@id='apparat_apparatComment']")
    protected WebElement ApparatCommentTextField;

    @FindBy (xpath = "//button[@name='add']")
    protected WebElement subCreateButton;

    // String TitleLogo = "//a[@class='logo']";

    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    public boolean isAvatarPresent() {
        return actionsWithWebElements.isElementPresent(avatar);
    }

    public boolean isAvatarStudentPresent() {
        return actionsWithWebElements.isElementPresent(avatarStudent);
    }

    public void clickOnAvatarStudent() {
        actionsWithWebElements.pressButton(avatarStudent);
    }

    public void clickOnsubMenuSpare() {
        actionsWithWebElements.pressButton(subMenuSpare);
    }

    public void clickOnbuttonLogout() {

        actionsWithWebElements.pressButton(buttonLogout);
    }

    public void clickOnsubMenuTypeSdelki() {
        actionsWithWebElements.pressButton(subMenuTypeSdelki);
    }

    public void checkTitle(String uchetZapchastey)
    {
        Assert.assertEquals("UchetnayaZapis is not matched", TitleLogo.getText(), uchetZapchastey);
    }
//
    public void clickOnMenuDictionary() {
        actionsWithWebElements.pressButton(menuDictionary);
    }

    public void clickOnSubMenuApparat() {
        actionsWithWebElements.pressButton(subMenuApparat);
    }

    public void clickOnsubAddButton() {
        actionsWithWebElements.pressButton(subAddButton);
    }

    public void inputTextToApparatNumberField(String apparatNumberText){
        actionsWithWebElements.inputTextToField(ApparatNumberTextField, apparatNumberText);
    }

    public void inputTextToApparatCommentField(String apparatCommentText){
        actionsWithWebElements.inputTextToField(ApparatCommentTextField, apparatCommentText);
    }

    public void clickOnsubCreateButton() {
        actionsWithWebElements.pressButton(subCreateButton);
    }

}