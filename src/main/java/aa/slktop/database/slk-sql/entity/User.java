package aa.slktop.database.slk-sql.entity;

import 你自己的父类实体,没有就不用设置!;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2021-03-31
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends 你自己的父类实体,没有就不用设置! {

    private static final long serialVersionUID = 1L;

    /**
     * 是否启用
     */
    private String status;

    /**
     * 用户名（独立索引）
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 年龄（联合索引_1）
     */
    private Integer age;

    /**
     * 测试字段1（联合索引_1）
     */
    private Integer testAInt;

    /**
     * 测试字段2（联合索引_1）
     */
    private Integer testBInt;

    /**
     * 创建日期
     */
    private LocalDateTime createDate;


}
