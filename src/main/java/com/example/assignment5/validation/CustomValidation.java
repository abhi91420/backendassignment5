package com.example.assignment5.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.FIELD, ElementType.PARAMETER})
@Constraint(validatedBy = CustomValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomValidation {
    String message() default "Not Valid";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
