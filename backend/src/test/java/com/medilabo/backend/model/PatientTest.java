package com.medilabo.backend.model;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(SpringExtension.class)
public class PatientTest {
/*
    @BeforeClass
    public static void setupValidatorInstance() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @Test
    public void whenNotNullName_thenNoConstraintViolations() {
        Patient patient = new UserNotNull("John");
        Set<ConstraintViolation<UserNotNull>> violations = validator.validate(user);

        assertThat(violations.size()).isEqualTo(0);
    }

    @Test
    public void whenNullName_thenOneConstraintViolation() {
        Patient patient = new UserNotNull(null);
        Set<ConstraintViolation<UserNotNull>> violations = validator.validate(user);

        assertThat(violations.size()).isEqualTo(1);
    }

    @Test
    public void whenEmptyName_thenNoConstraintViolations() {
        Patient patient = new UserNotNull("");
        Set<ConstraintViolation<UserNotNull>> violations = validator.validate(user);

        assertThat(violations.size()).isEqualTo(0);
    }
    */

}
