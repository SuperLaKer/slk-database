package aa.slkdatabase.jpa.test;


import aa.slkdatabase.jpa.ApplicationStarter;
import aa.slkdatabase.jpa.entity.Users;
import aa.slkdatabase.jpa.repository.BUsersJpql;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.transaction.Transactional;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationStarter.class)
public class BUserJpqlTest {

    @Autowired
    BUsersJpql bUserJpql;


    @Test
    public void findByName() {
        Users Users = bUserJpql.findByName("小瓜");
        System.out.println(Users);
    }

    @Test
    public void findByNameId() {
        Users Users = bUserJpql.findByNameId("小瓜", 2);
        System.out.println(Users);
    }

    @Test
    @Transactional
    @Rollback(value = false)
    public void updateUser() {
        //bUserJpql.updateUsers();
    }

}