    package loginTest;

import libs.ConfigData;
import org.junit.Test;
import parentTest.ParentTest;

import java.io.IOException;
import java.util.Map;

public class ValidLoginWithParamsFromExcel extends ParentTest {
    public ValidLoginWithParamsFromExcel(String browser){
        super (browser);
    }
    @Test
    public void ValidTest()throws IOException{
        Map dataFromExcelForValidLoginTest=excelDriver.getData(ConfigData.getCfgValue("DATA_FILE"),"validLogOn");
        loginPage.OpenPageLogin();
        loginPage.InputLoginName(dataFromExcelForValidLoginTest.get("login").toString());
        loginPage.InputPassword(dataFromExcelForValidLoginTest.get("pass").toString());
        loginPage.ClickSubmitButton();
        checkAcceptanceCriteria("Avatar is not present",homePage.isAvatarPresent(),true);
        checkAcceptanceCriteria("Title is not expected",homePage.getTitle(), "Учетная запчастей");
    }
}
