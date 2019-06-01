package testDB;

import libs.DataBase;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class TestDataBase {
    Logger logger= Logger.getLogger(getClass());
    DataBase dataBase;

    @Before
    public void setUp() throws SQLException, IOException, ClassNotFoundException{
        dataBase=new DataBase("MySQL_PADB_DB","MySQL");
    }
    @After
    public void tearDown() throws SQLException{
        dataBase.quit();
    }

        @Test
        public void testWithDataBase() throws SQLException{
        List<Map<String,String>>testData = dataBase.selectTable("select * from seleniumTable");
        logger.info(testData.get(3));
        dataBase.modifyTable("INSERT INFO seleniumTable VALUE (258,'Aliya','pass8'");
        logger.info (dataBase.selectTable("select * from from seleniumTable where login ='Aliya'"));
        logger.info(dataBase.selectTable("select * from seleniumTable where idNumber=258"));
    }
}
