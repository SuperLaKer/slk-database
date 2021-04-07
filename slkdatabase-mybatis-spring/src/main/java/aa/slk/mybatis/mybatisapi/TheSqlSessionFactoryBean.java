package aa.slk.mybatis.mybatisapi;


import aa.slk.mybatis.mybatisapi.analyse.interceptors.ShowSql;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @author lla, 2021/2/14  14:27
 */
public class TheSqlSessionFactoryBean {
    @Bean
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
        // configuration
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setConfiguration(getConfiguration());
        factoryBean.setDataSource(dataSource);
        return factoryBean.getObject();
    }

    public Configuration getConfiguration(){
        Configuration configuration = new Configuration();
        configuration.addInterceptor(new ShowSql());
        return configuration;
    }
}
