package aa.slk.mybatis.mybatisapi.annno;

import aa.slk.mybatis.mybatisapi.annno.impl.MybatisSqlSessionFactoryProvider;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author lla, 2020/12/10:18:58
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(MybatisSqlSessionFactoryProvider.class)
@MapperScan("slk.slkTop.commons.mapper")
public @interface EnableMybatisSpring {
}
