package source.mybatis;

import org.apache.ibatis.logging.slf4j.Slf4jImpl;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import source.mybatis.dbConfig.DruidDataSource;
import source.mybatis.interceptors.ShowSql;
import source.mybatis.mappers.UsersMapper;

import javax.sql.DataSource;

/**
 * @author lla, 2021/2/9  12:39
 * <p>
 * 所有配置均可通过配置类完成，详见AA流程分析
 */
public class MybatisUtils {

    static SqlSessionFactoryBuilder factoryBuilder;
    static SqlSessionFactory sqlSessionFactory;
    static SqlSession sqlSession;

    public static SqlSessionFactory getSessionFactory() throws Exception {
        if (sqlSessionFactory == null) {
            Configuration configuration = new Configuration();
            DataSource dataSource = DruidDataSource.getDataSource();
            JdbcTransactionFactory jdbcTransactionFactory = new JdbcTransactionFactory();
            // 环境初始化
            Environment environment = new Environment("dev", jdbcTransactionFactory, dataSource);
            configuration.setEnvironment(environment);
            configuration.setLogImpl(Slf4jImpl.class);
            configuration.setCacheEnabled(true);

            // configuration.addMappers("source.mybatis.mappers");
            configuration.addMapper(UsersMapper.class);
            configuration.addInterceptor(new ShowSql());

            // 构建
            factoryBuilder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = factoryBuilder.build(configuration);
        }
        return sqlSessionFactory;
    }

    public static Configuration getConfiguration() throws Exception {
        if (sqlSessionFactory == null) {
            getSessionFactory();
        }
        return sqlSessionFactory.getConfiguration();
    }
}
