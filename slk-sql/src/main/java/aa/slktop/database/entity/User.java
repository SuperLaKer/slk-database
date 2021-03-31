package aa.slktop.database.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@TableName("user")
public class User implements Serializable {

    private Long id;
    private String status;

    @TableField("user_name")
    private String userName;
    private String password;
    private Integer age;
    @TableField("test_a_int")
    private Integer testAInt;
    @TableField("test_b_int")
    private Integer testBInt;
    private java.sql.Timestamp createDate;

    public User(String status, String userName, String password, Integer age, Integer testAInt, Integer testBInt, Timestamp createDate) {
        this.status = status;
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.testAInt = testAInt;
        this.testBInt = testBInt;
        this.createDate = createDate;
    }

    public User() {
    }
}
