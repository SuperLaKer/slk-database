package aa.slk.mybatis.mybatisapi.annno;


import aa.slk.mybatis.mybatisapi.annno.impl.AppValidation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author lla
 * @create 2020/12/7:10:20
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Constraint(validatedBy = {AppValidation.class})
public @interface AppValidationImpl {
    String message() default "{aValid测试}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
