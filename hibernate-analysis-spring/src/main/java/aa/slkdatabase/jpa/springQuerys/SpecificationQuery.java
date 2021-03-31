package aa.slkdatabase.jpa.springQuerys;


import aa.slkdatabase.jpa.ApplicationStarter;
import aa.slkdatabase.jpa.entity.Account;
import aa.slkdatabase.jpa.entity.Users;
import aa.slkdatabase.jpa.repository.UsersRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.*;
import java.util.List;
import java.util.Optional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationStarter.class)
public class SpecificationQuery {

    @Autowired
    UsersRepository usersRepository;


    @Test
    @Transactional  // session关闭问题
    public void testSpec() {
        Specification<Users> specification = new Specification<Users>() {
            @Override
            public Predicate toPredicate(Root<Users> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                Path<Object> name = root.get("userName");
                return criteriaBuilder.equal(name, "admin1");
            }
        };
        Optional<Users> optional = usersRepository.findOne(specification);
        assert optional.isPresent();
        Users users = optional.get();
        List<Account> accounts = users.getAccounts();
        System.out.println(accounts);
    }
}
