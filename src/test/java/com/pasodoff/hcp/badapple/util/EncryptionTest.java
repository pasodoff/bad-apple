package com.pasodoff.hcp.badapple.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aaron on 16/06/2017.
 */
public class EncryptionTest {
    @Test
    public void encrypt() throws Exception {
        assertEquals("ZfSeMETaV+7qOXJsDWoMyA==", Encryption.encrypt("Password"));
    }

    @Test
    public void decrypt() throws Exception {
        assertEquals("Password", Encryption.decrypt("ZfSeMETaV+7qOXJsDWoMyA=="));
    }

}