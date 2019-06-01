package spareTest;

import org.junit.Test;
import parentTest.ParentTest;

public class NewSpareTest extends ParentTest {
 public NewSpareTest(String browser){
        super(browser);
    }
    @Test
    public void addNewSpare(){
        loginPage.OpenPageLogin();
        loginPage.InputLoginName("Student");
        loginPage.InputPassword("909090");
        loginPage.ClickSubmitButton();
        homePage.clickOnMenuDictionary();
        homePage.clickOnsubMenuSpare();
        sparesPage.clickOnPlusButton();
        sparesPage.enterTextIntoSpareName("New Item from Me");
        sparesPage.chooseSpareType("Датчики");
        sparesPage.clickOnSubmitSpareButton();
        sparesPage.clickOnAddedSpare();
        sparesPage.clickOnDeleteSpareButton();

    }
}
