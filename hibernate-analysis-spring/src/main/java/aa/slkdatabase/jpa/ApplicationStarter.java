package aa.slkdatabase.jpa;

import aa.slkdatabase.jpa.entity.Users;
import aa.slkdatabase.jpa.repository.UsersRepository;
import aa.slkenv.dataBase.annno.EnableSpringDataSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@EnableSpringDataSource
@ComponentScan()
public class ApplicationStarter {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationStarter.class);
        UsersRepository bean = ac.getBean(UsersRepository.class);
        List<Users> usersList = bean.findAll();
        System.out.println(usersList);
    }
}
