package aa.slktop.database;

import aa.slkenv.dataBase.annno.EnableMybatisSpring;
import aa.slkenv.dataBase.annno.EnableSpringDataSource;
import aa.slktop.database.entity.User;
import aa.slktop.database.examples.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * private String status;
 * private String userName;
 * private String password;
 * private Long age;
 * private Long testAInt;
 * private Long testBInt;
 * private java.sql.Timestamp createDate;
 */
@Configuration
@ComponentScan
@EnableMybatisSpring
@MapperScan("aa.slktop.database.mappers")
@EnableSpringDataSource(dataBaseName = "slkdatabase")
public class SQLApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(SQLApplication.class);
        ac.refresh();

        UserService userService = ac.getBean(UserService.class);
        User user = userService.findUserById(1L);
        System.out.println(user);

        ac.close();
    }
}
