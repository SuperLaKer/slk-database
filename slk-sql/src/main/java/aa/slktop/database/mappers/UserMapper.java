package aa.slktop.database.mappers;

import aa.slktop.database.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {


    /**
     * String status;
     * String userName;
     * String password;
     * Long age;
     * Long testAInt;
     * Long testBInt;
     * java.sql.Timestamp createDate;
     */
    @Insert({
            "<script>",
            "insert into user (status, user_name, password, age, test_a_int, test_b_int, create_date) values",
            "<foreach collection='users' item='user' index='index' separator=','>",
            "(#{user.status}, #{user.userName}, #{user.password}, #{user.age}, #{user.testAInt}, #{user.testBInt}, #{user.createDate})",
            "</foreach>",
            "</script>"
    })
    void update(@Param("users") List<User> users);


    @Select({"<script>",
                "select * from user where id = #{id}",
            "</script>",})
    User findById(@Param("id") Long id);
}
