package com.pasodoff.hcp.badapple.service;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aaron on 19/06/2017.
 */
public class CmdServiceTest {
    @Test
    public void givenPasodoffDotCom_nslookupReturnsCorrectIpAddress() throws Exception {
        CmdService cmd = new CmdService();
        String result = cmd.nslookup("pasodoff.com");
        System.out.println(result);
        assertTrue(result.contains("176.58.109.8"));
    }
}