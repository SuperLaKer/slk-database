package aa.slkdatabase.practice;

import aa.slkenv.dataBase.annno.EnableDruidDataSource;
import aa.slkenv.dataBase.annno.EnableMybatisSpring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@EnableMybatisSpring
@EnableDruidDataSource
public class Application {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(Application.class);
        ac.refresh();
        DataSource dataSource = ac.getBean(DataSource.class);
        Connection connection = null;
        Statement statement = null;

        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            statement.execute(Constanst.sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        }
    }
}
