package com.example.BaiThucHanhJava.validator.annotation;


import com.example.BaiThucHanhJava.validator.ValidUserIdValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidUserIdValidator.class)
public @interface ValidUserId {

    String message() default "Invalid User ID";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
