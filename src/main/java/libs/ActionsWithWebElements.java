package libs;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsWithWebElements {
    WebDriver driver;
    Logger log;
    WebDriverWait webDriverWait20;

    public ActionsWithWebElements(WebDriver webDriver) {
        this.driver = webDriver;
        log = Logger.getLogger(getClass());
        webDriverWait20 = new WebDriverWait(driver, 20);
    }

    /*
    Метод ввода текста в поле
     */
    public void inputTextToField(WebElement inputField, String inputText) {
        try {
            inputField.clear();
            inputField.sendKeys(inputText);
            log.info("Text is not input");
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Text is not input");
            Assert.fail("Cannot work input");
        }
    }

    /*
    нажатие кнопки
     */
    public void pressButton(WebElement buttonName) {
        try {
            webDriverWait20.until(ExpectedConditions.visibilityOf(buttonName));
            buttonName.click();
            log.info("Button is clicked");
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Button is not clicked");
            Assert.fail("Cannot click button");
        }
    }
    /*
    Нажатие элемента, картинки и т.д.
     */
    public  void clickOnElement(WebElement element){
        try{
            webDriverWait20.until(ExpectedConditions.elementToBeClickable(element));
            webDriverWait20.until(ExpectedConditions.not(ExpectedConditions.invisibilityOf(element)));
            element.click();
            log.info("Element clicked " + element);
        }catch (Exception ex){
            ex.printStackTrace();
            log.error("Element is not clicked");
            Assert.fail("Cannot click element");
        }
    }


    /*
    Выбор значения из дробдауналиста
     */
    public void selectDropDownByText(String locatorDropDownList, String textDropDown) {
        try {
            Select selectDD = new Select(driver.findElement(By.xpath(locatorDropDownList)));
            selectDD.deselectByVisibleText(textDropDown);
            log.info("Text was selected");
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Text does not select");
            Assert.fail("Cannot select");
        }
    }

    /*
    Выбор значения из дропдауна листа по значению
     */
    public void selectDDByValue(String locatorDropDownList, String valueDD) {
        try {
            Select selectDD = new Select(driver.findElement(By.xpath(locatorDropDownList)));
            selectDD.deselectByValue(valueDD);
            log.info("Value is selected");
        } catch (Exception ex) {
            ex.printStackTrace();
            log.error("Value is not selected");
        }
    }
    /*
    Выбор значения Дропдауна листа по значению. выбор чекбокса
     */
    public void selectCheckBox(String locatorCheckBox,boolean isNeededStatus) {
        try {
            if (isNeededStatus && ( !driver.findElement(By.xpath(locatorCheckBox)).isSelected()) || (!isNeededStatus && driver.findElement(By.xpath(locatorCheckBox)).isSelected())){
            driver.findElement(By.xpath(locatorCheckBox)).click();
            }
            log.info("All is Ok");
        }catch (Exception ex){
            ex.printStackTrace();
            log.error("Something went wrong");
        }
}
public boolean isElementPresent(WebElement element){
        return element.isSelected() && element.isEnabled();
}




}
