package aa.slk.mybatis.mybatisapi.annno.impl;


import aa.slk.mybatis.mybatisapi.annno.AppValidationImpl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author lla
 */
public class AppValidation implements ConstraintValidator<AppValidationImpl, String> {
	@Override
	public void initialize(AppValidationImpl constraintAnnotation) {
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return ("测试".equals(value));
	}
}
