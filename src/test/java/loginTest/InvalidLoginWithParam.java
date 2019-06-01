package loginTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parentTest.ParentTest;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

@RunWith(value= Parameterized.class)

public class InvalidLoginWithParam extends ParentTest {
    String login, pass;
    public InvalidLoginWithParam(String browser,String login,String pass){
        super(browser);
        this.login =login;
        this.pass=pass;
    }
    @Parameterized.Parameters

    public static Collection testDData(){
        return Arrays.asList(new Object[][]{
                {"chrome", "Student", "906090"},
                {"chrome", "tudent", "906090"}
        });
    }
    @Test
    public void invalidLogin (){
        loginPage.LoginUser(login, pass);
        checkAcceptanceCriteria("Title not match", loginPage.getTitle(),"Account of spare:Авторизация");
    }

}
