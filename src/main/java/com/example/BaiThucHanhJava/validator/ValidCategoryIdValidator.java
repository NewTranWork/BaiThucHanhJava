package com.example.BaiThucHanhJava.validator;

import com.example.BaiThucHanhJava.entity.Category;
import com.example.BaiThucHanhJava.validator.annotation.ValidCategoryId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context){
        return category != null && category.getId()!=null;
    }
}
