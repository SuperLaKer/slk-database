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
public class Role extends 你自己的父类实体,没有就不用设置! {

    private static final long serialVersionUID = 1L;

    /**
     * 外键，关联user id
     */
    private Long userId;

    /**
     * 是否启用
     */
    private Integer status;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色描述
     */
    private String roleDesc;

    /**
     * 创建日期
     */
    private LocalDateTime createDate;

    /**
     * 保留字段a
     */
    private String tempStringA;

    /**
     * 保留字段b
     */
    private String tempStringB;


}
