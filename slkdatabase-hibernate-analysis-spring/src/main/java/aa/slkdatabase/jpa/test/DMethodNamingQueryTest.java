package aa.slkdatabase.jpa.test;


import aa.slkdatabase.jpa.ApplicationStarter;
import aa.slkdatabase.jpa.entity.Users;
import aa.slkdatabase.jpa.repository.DMethodNamingQuery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationStarter.class)
public class DMethodNamingQueryTest {

    @Autowired
    DMethodNamingQuery dMethodNamingQuery;

    // 精准查询
    @Test
    public void findByName() {
        Users Users = dMethodNamingQuery.findByUserName("小三");
        System.out.println(Users);
        // select * from Users  where username=?
    }

    // 模糊查询
    @Test
    public void findByNameLike() {
        List<Users> userList = dMethodNamingQuery.findByUserNameLike("小_");
        userList.forEach(System.out::println);
    }

    // 多条件, id > 5 and username like "小%";
    @Test
    public void findByIdGreaterThanAndNameLike() {
        List<Users> userList = dMethodNamingQuery.findByIdGreaterThanAndUserNameLike(5, "小%");
        userList.forEach(System.out::println);
    }

}