package aa.slktop.database.examples;

import aa.slktop.database.entity.User;
import aa.slktop.database.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public void insert(){
        ArrayList<User> users = new ArrayList<>();

        User user = new User("1", "用户1", "123456", 10, 20,
                30, new Timestamp(System.currentTimeMillis()));
        users.add(user);
        userMapper.update(users);
    }

    public User findUserById(Long id){
        User user = userMapper.findById(id);
        return user;
    }

}
