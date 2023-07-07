package com.zaurtregulov.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ChceckEmailValidator implements ConstraintValidator<ChceckEmail, String> {
    private String endOfEmail;
    @Override
    public void initialize(ChceckEmail chceckEmail) {
       endOfEmail = chceckEmail.value();
    }

    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext constraintValidatorContext) {
        return enteredValue.endsWith(endOfEmail);
    }
}
