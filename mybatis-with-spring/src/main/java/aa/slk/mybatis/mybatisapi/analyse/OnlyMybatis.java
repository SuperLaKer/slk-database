package aa.slk.mybatis.mybatisapi.analyse;


import org.apache.ibatis.session.SqlSession;
import aa.slktop.commons.mapper.UsersMapper;

/**
 * @author lla, 2021/2/14  14:59
 */
public class OnlyMybatis {

    public static void main(String[] args) throws Exception {
        SqlSession sqlSession = MybatisJavaConfigUtils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        System.out.println(usersMapper.selectById(1));
    }
}

