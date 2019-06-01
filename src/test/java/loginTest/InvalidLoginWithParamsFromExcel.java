package loginTest;

import libs.ConfigData;
import libs.SpreadsheetData;
import org.junit.Test;
import org.junit.runners.Parameterized;
import parentTest.ParentTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

public class InvalidLoginWithParamsFromExcel extends ParentTest {
    String login, pass;
    public InvalidLoginWithParamsFromExcel (String browser, String login, String pass){
        super(browser);
        this.login=login;
        this.pass=pass;
    }
    @Parameterized.Parameters
    public static Collection testData()throws IOException{
        InputStream spreadsheet=new FileInputStream(ConfigData.getCfgValue("DATA_FILE_PATH")+"testDAtaSuit.xls" );
        return new SpreadsheetData(spreadsheet,"InvalidLogOn").getData();
    }
    @Test
    public void invalidLogin(){
        loginPage.LoginUser(login,pass);
        checkAcceptanceCriteria("Title not match",loginPage.getTitle(),"Account of spare:Авторизация");
    }
}
