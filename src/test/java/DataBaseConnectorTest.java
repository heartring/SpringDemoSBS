import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mysql.jdbc.Driver;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

/**
 * Created by Administrator on 2018/4/18 0018.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:config/applicationContext.xml", "classpath:config/spring-web.xml"})
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

    /**
     * 测试连接redis
     */
    @Test
    public void testRedisConnection(){
        Jedis jedis = new Jedis("localhost", 6379);
        String key = jedis.get("myKey");
        System.out.println(key);
        jedis.close();


    }


    @Test
    public void testPostgresqlConnection() throws SQLException {
        DruidDataSource dds = new DruidDataSource();
        dds.setUsername("postgres");
        dds.setPassword("lx45211");
        dds.setUrl("jdbc:postgresql://localhost:5432/test_lx");
        dds.setDriverClassName("org.postgresql.Driver");


        DatabaseMetaData dm = dds.getConnection().getMetaData();
        String dbName = dm.getDatabaseProductName();
        String version = dm.getDatabaseProductVersion();

        System.out.println(dbName + ": " + version);
        System.out.println(dm.getClientInfoProperties());
        dds.close();
    }

    @Resource(type = DruidDataSource.class)
    private DruidDataSource druidDataSource;

    @Test
    public void testDruidInSpringContext(){
        DruidPooledConnection connection = null;
        String dbName = null;
        try {
            connection = druidDataSource.getConnection();
            dbName = connection.getMetaData().getDatabaseProductName();
            System.out.println(dbName);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            druidDataSource.close();
        }

    }



}
