package aa.slk.mybatis;


import aa.slk.mybatis.domain.Users;
import aa.slk.mybatis.interceptors.ShowSql;
import aa.slk.mybatis.mappers.UsersMapper;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

@Configuration
@ComponentScan("aa.slk.mybatis")
// 就是mapperScan啊
@MapperScan("aa.slk.mybatis.mappers")
@EnableTransactionManagement(mode = AdviceMode.PROXY)
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(Application.class, UsersServiceImpl.class);
        ac.refresh();
        UsersMapper usersMapper = ac.getBean(UsersMapper.class);
        Users users = usersMapper.findById(1);
        System.out.println(users);

        UsersService usersService = ac.getBean(UsersService.class);
        usersService.update(6);
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setPlugins(new ShowSql());
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public TransactionManager transactionManager(DataSource dataSource) {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }

    @Bean("dataSource")
    public DataSource dataSource() throws Exception {
        Properties pro = new Properties();
        InputStream is = DruidDataSource.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
        return dataSource;
    }
}
