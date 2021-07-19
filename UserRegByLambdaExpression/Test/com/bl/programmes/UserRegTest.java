package com.bl.programmes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegTest {
    UserReg userReg = new UserReg();

    @Test
    void firstnameValidate() {
        String firstName = "Anzar";
        assertTrue(userReg.firstname(firstName));

    }

    @Test
    void lastName() {
        String lastName= "Shaikh";
        assertTrue(userReg.lastName(lastName));
    }

    @Test
    void email() {
        String email = "anzarshaikh@bl.co.in";
        assertTrue(userReg.email(email));
    }

    @Test
    void mobile() {
        String mobile = "91 9503849559";
        assertTrue(userReg.mobile(mobile));
    }

    @Test
    void password() {
        String password = "Anzar@373";
        assertTrue(userReg.password(password));
    }
}