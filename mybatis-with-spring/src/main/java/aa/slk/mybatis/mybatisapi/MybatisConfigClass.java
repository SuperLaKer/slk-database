package aa.slk.mybatis.mybatisapi;


import aa.slk.mybatis.UsersService;
import aa.slk.mybatis.mappers.UsersMapper;
import aa.slk.mybatis.mybatisapi.annno.EnableSpringDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


/**
 * @author lla, 2021/2/10  11:50
 */

@MapperScan("slk.slkTop.commons.mapper")
@Import(TheSqlSessionFactoryBean.class)
@EnableSpringDataSource(dataBaseName = "sfnotes")  // 数据库配置，使用到了ImportAware接口
@Configuration
public class MybatisConfigClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MybatisConfigClass.class, UsersService.class);  // 可以直接注册后置处理器

        UsersMapper usersMapper = context.getBean(UsersMapper.class);
        System.out.println(usersMapper.selectById(1));
        System.out.println(usersMapper.selectById(1).getUsername());
        // 事务待会再说
        UsersService usersService = context.getBean(UsersService.class);

    }
}
