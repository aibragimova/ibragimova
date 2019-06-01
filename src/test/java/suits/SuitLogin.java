package suits;

import loginTest.InvalidLoginWithParam;
import loginTest.ValidTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        //сюда мы пишем все тесты которые хотим запустить в одном сьюте
        ValidTest.class,
        InvalidLoginWithParam.class

}
        )

public class SuitLogin {

}
