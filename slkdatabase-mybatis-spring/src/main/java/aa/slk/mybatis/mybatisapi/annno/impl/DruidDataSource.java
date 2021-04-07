package aa.slk.mybatis.mybatisapi.annno.impl;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author lla
 */
public class DruidDataSource {

  @Bean
  public static DataSource getDataSource() throws Exception {
    InputStream is = DruidDataSource.class.getClassLoader().getResourceAsStream("druid.properties");
    Properties properties = new Properties();
    properties.load(is);
    DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
    Connection connection = dataSource.getConnection();
    System.out.println(connection);
    connection.close();
    // 4.获取连接池对象
    return dataSource;
  }
}
