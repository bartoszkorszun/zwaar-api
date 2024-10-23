package com.bartoszkorszun.zwaarapi.entity;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class UserTest {

    private static User user;
    @BeforeAll
    static void setUp() {
        user = new User.Builder(
                "Bartosz",
                "bartoszkorszun@gmail.com",
                "stronk123"
        )
                .height(186)
                .weight(91.54)
                .notifications(true)
                .build();
    }

    @Test
    @DisplayName("Test created user")
    void testCreatedUser() {
        assertEquals("Bartosz", user.getName());
        assertEquals("bartoszkorszun@gmail.com", user.getEmail());
        assertEquals("stronk123", user.getPassword());
        assertEquals(186, user.getHeight());
        assertEquals(91.54, user.getWeight());
        assertEquals(26.45970632443057, user.getBmi());
        assertTrue(user.isNotifications());
    }

    @Test
    @DisplayName("Test change user")
    void testChangeUser() {
        user.setName("Klaudia");
        user.setEmail("klaud@gmail.com");
        user.setPassword("weak123");
        user.setHeight(163);
        user.setWeight(55.5);
        user.setNotifications(false);

        assertEquals("Klaudia", user.getName());
        assertEquals("klaud@gmail.com", user.getEmail());
        assertEquals("weak123", user.getPassword());
        assertEquals(163, user.getHeight());
        assertEquals(55.5, user.getWeight());
        assertEquals(20.88900598441793, user.getBmi());
        assertFalse(user.isNotifications());
    }
}