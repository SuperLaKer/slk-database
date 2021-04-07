package aa.slk.mybatis.mybatisapi.analyse;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import aa.slktop.mybatisapi.annno.impl.DruidDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author lla, 2021/2/14  15:06
 */
public class MybatisJavaConfigUtils {
    static InputStream resourceAsStream;
    static SqlSessionFactoryBuilder factoryBuilder;
    static SqlSessionFactory sqlSessionFactory;
    static SqlSession sqlSession;
    static Configuration configuration;

    public static SqlSessionFactory getSessionFactory() throws Exception {
        if (sqlSessionFactory == null) {
            DataSource dataSource = DruidDataSource.getDataSource();
            TransactionFactory transactionFactory = new JdbcTransactionFactory();
            Environment environment = new Environment("development", transactionFactory, dataSource);
            Configuration configuration = new Configuration(environment);
            configuration.addMappers("slk.slkTop.commons.mapper");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
        }
        return sqlSessionFactory;
    }

    /**
     * 测试一级缓存
     * @return SqlSession
     * @throws IOException x
     */
    public static SqlSession getSqlSession() throws Exception {
        if (sqlSession == null){
            sqlSession = getSessionFactory().openSession();
        }
        return sqlSession;
    }

    public static SqlSession getSqlSession(Boolean sameSession) throws Exception {
        getSqlSession();
        if (sameSession) {
            return sqlSession;
        } else {
            return getSessionFactory().openSession();
        }
    }

    public static Configuration getConfiguration() throws Exception {
        if (sqlSessionFactory == null) {
            getSessionFactory();
        }
        return configuration;
    }
}
