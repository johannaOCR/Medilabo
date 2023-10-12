package com.medilabo.backend.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserTest {

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User();
    }

    @Test
    public void testUserId() {
        user.setUserId(1L);
        assertEquals(1L, user.getUserId());
    }

    @Test
    public void testUsername() {
        user.setUsername("testUser");
        assertEquals("testUser", user.getUsername());
    }

}
