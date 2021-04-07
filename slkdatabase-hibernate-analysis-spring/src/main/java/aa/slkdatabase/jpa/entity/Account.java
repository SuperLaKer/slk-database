package aa.slkdatabase.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account")
public class Account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "increment", strategy = "increment")
    private Integer id;

    @Column(name = "account_name")
    private String accountName;  // 数据库 name

    @Column(insertable = false, updatable = false)
    private Integer uid;  // 数据库 userId
    private Float money;
    private String address;

    @ManyToOne(targetEntity = Users.class, fetch = FetchType.LAZY)
    // 外键名字为uid，在关系表中名字为id
    @JoinColumn(name = "uid", referencedColumnName = "id")
    private Users users;


    public Account(String accountName, Integer uid, Float money) {
        this.accountName = accountName;
        this.uid = uid;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountName='" + accountName + '\'' +
                ", uid=" + uid +
                ", money=" + money +
                ", address='" + address + '\'' +
                '}';
    }
}
