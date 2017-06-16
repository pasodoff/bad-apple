package com.pasodoff.hcp.badapple.resource;

import com.pasodoff.hcp.badapple.service.RonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by aaron on 16/06/2017.
 */
@RestController
public class QuoteResource {

    RonService ronService;

    public QuoteResource(RonService ronService) {
        this.ronService = ronService;
    }

    @RequestMapping("/quote")
    public List<String> getQuote(){
        return ronService.getJsonRonQuote();
    }
}
