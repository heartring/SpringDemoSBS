import com.alibaba.druid.pool.DruidDataSource;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mysql.jdbc.Driver;
import org.junit.Test;

import java.sql.SQLException;

/**
 * Created by Administrator on 2018/4/18 0018.
 */
public class DataBaseConnectorTest {

    /**
     * 测试 连接池druid连接mysql
     * @throws SQLException
     */
    @Test
    public void testMysqlAndDruidConnetor() throws SQLException {
        DruidDataSource dds = new DruidDataSource();
        dds.setUsername("root");
        dds.setPassword("123");
        dds.setUrl("jdbc:mysql://localhost:3306/atguigu");
        dds.setDriver(new Driver());

        String dbName = dds.getConnection().getMetaData().getDatabaseProductName();
        System.out.println(dbName);
        dds.close();
    }


    /**
     * 测试连接mongoDB
     */
    @Test
    public void testMongoConnection(){
        MongoClient mc = new MongoClient("localhost", 27017);
        MongoDatabase mdb = mc.getDatabase("test");
        System.out.println(mdb.getName());
        System.out.println(mdb.getCollection("stus").find());
        mc.close();



    }



}