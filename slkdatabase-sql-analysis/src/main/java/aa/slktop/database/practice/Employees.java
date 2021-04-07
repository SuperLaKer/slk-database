package aa.slktop.database.practice;


import lombok.Data;

import java.io.Serializable;

/**
 * 实践
 *
 * @author lla
 */
@Data
public class Employees implements Serializable {

    /**
     * id自增主键
     */
    private Long id;
    /**
     * name, age, position: b-tree索引
     */
    private String name;
    private Integer age;
    private String position;
    private java.sql.Timestamp hireTime;
}
