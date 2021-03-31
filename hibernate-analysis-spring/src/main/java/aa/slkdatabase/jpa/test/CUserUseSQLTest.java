package aa.slkdatabase.jpa.test;


import aa.slkdatabase.jpa.ApplicationStarter;
import aa.slkdatabase.jpa.entity.Users;
import aa.slkdatabase.jpa.repository.CUserUseSQL;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationStarter.class)
public class CUserUseSQLTest {

    @Autowired
    CUserUseSQL cUserUseSQL;

    @Test
    public void findByIdUseSQL() {
        Users Users = cUserUseSQL.findByIdUseSQL(2);
        System.out.println(Users);
    }

    @Test
    public void likeNameQuery() {

        List<Users> userList = cUserUseSQL.likeNameQuery("小%");
        userList.stream().forEach(Users -> System.out.println(Users));

    }
}