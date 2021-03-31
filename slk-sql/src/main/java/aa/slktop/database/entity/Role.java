package aa.slktop.database.entity;

import lombok.Data;

@Data
public class Role {

    private Long id;
    private Long userId;
    private Long status;
    private String roleName;
    private String roleDesc;
    private java.sql.Timestamp createDate;
    private String tempStringA;
    private String tempStringB;
}
