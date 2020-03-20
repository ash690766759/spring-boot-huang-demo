package com.huang;


import com.huang.bean.Guest;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class GuestValid {
    public static void main(String[] args) {
        //通过validatin   创建Validator实例
        //Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

        Validator validatorFastFail = Validation.byDefaultProvider().configure()
                .addProperty("hibernate.validator.fail_fast","true").buildValidatorFactory().getValidator();
        //创建bean
        Guest g = new Guest("","");
        //接收验证结果
        //Set<ConstraintViolation<Guest>> vset=validator.validate(g);
        Set<ConstraintViolation<Guest>> vset=validatorFastFail.validate(g);
        //遍历Set
        for(ConstraintViolation  violation:vset){
            System.out.println(violation.getPropertyPath()+":"+violation.getMessage());
        }
    }
}
