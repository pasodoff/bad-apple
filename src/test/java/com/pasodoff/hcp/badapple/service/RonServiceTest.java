package com.pasodoff.hcp.badapple.service;

import com.pasodoff.hcp.badapple.util.Config;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by aaron on 16/06/2017.
 */
public class RonServiceTest {

    @Autowired
    Config config;

    @Test
    public void requestQuote_getJsonRonQuote(){
        RonService service = new RonService(config);
        List<String> quotes = service.getJsonRonQuote();
        assertEquals(1,quotes.size());
    }

}