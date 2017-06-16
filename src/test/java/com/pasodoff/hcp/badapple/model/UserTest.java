package com.pasodoff.hcp.badapple.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aaron on 16/06/2017.
 */
public class UserTest {
    @Test
    public void getPassword_shouldReturnEncryptedString() throws Exception {
        User user = new User("username",
                "Joe", "Blogs","password");
        String password = user.getPassword();
        assertEquals("ENC:dvRw5R86HGiWgK8h9eqg/A==", password);
    }

    @Test
    public void setPassword_shouldEncryptedString() throws Exception {
        User user = new User(
                "username",
                "Joe",
                "Blogs",
                "password");
        user.setPassword("NewPassword");
        assertEquals("ENC:E2ghAEJKGOz2Vmg8FQwp7w==",user.getPassword());
    }

}