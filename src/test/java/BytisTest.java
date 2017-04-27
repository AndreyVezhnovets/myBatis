import com.prog.AppConfig;
import com.prog.dao.Crud;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class BytisTest {

    private int workerId = 2;
    private String masterName = "коля";
    private int expectedAge = 19;
    private String expectedCity = "МИНСК";

    @Autowired
    public Crud crud;
//
//    @Test
//    public void creatTables() {
//        try {
//            crud.tryNativeSQL("CREATE TABLE data.MASTER(name VARCHAR (50),age INT (3));");
//            crud.tryNativeSQL("CREATE TABLE data.WORKER(ID INT (10),master_name VARCHAR (50),CITY VARCHAR (20));");
//        } catch (SQLException e) {
//        }
//    }
//
//    @Test
//    public void insertInDB() {
//        try {
//            crud.tryNativeSQLUpdqte("insert into master (name, age) values ('КОЛЯ', 19);");
//            crud.tryNativeSQLUpdqte("insert into master (name, age) values ('ВАСЯ', 22);");
//            crud.tryNativeSQLUpdqte("insert into worker (id, master_name, city) values (1, 'КОЛЯ', 'МИНСК');");
//            crud.tryNativeSQLUpdqte("insert into worker (id, master_name, city) values (2, 'ВАСЯ', 'МИНСК');");
//            crud.tryNativeSQLUpdqte("insert into worker (id, master_name, city) values (3, 'КОЛЯ', 'ГОМЕЛЬ');");
//            crud.tryNativeSQLUpdqte("insert into worker (id, master_name, city) values (4, 'ВАСЯ', 'ГОМЕЛЬ');");
//        } catch (SQLException e) {
//        }
//    }

    @Test
    public void tryWorkerCity() {
        String city = crud.getWorkerById(workerId).getCity();
        assertEquals(city, expectedCity);
    }

    @Test
    public void tryMaster() {

        int age = crud.getMasterByName(masterName).getAge();
        assertEquals(age, expectedAge);
    }
}
