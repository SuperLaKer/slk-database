package aa.slkdatabase.jpa.test;


import aa.slkdatabase.jpa.ApplicationStarter;
import aa.slkdatabase.jpa.MyBeans;
import aa.slkdatabase.jpa.entity.Goods;
import aa.slkdatabase.jpa.repository.GoodsRepository;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 异常：
 * No identifier specified for entity：实体类主键添加 javax.persistence.Id，包别错了
 */

// 引入spring-test依赖
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationStarter.class, MyBeans.class})
public class GoodsRepositoryTest {

    static Integer total = 0;
    @Autowired
    GoodsRepository goodsRepository;



    @BeforeClass
    public static void beforeClass() {
    }

    @Test
    public void update() {
        Goods goods = new Goods("JavaWeb", 1000, "一本书", "49.80");
        goods.setId(2);
        goodsRepository.save(goods);
    }

    @Test
    public void multiThread() throws InterruptedException {

    }
}