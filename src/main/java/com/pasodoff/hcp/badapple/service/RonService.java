package com.pasodoff.hcp.badapple.service;



import com.pasodoff.hcp.badapple.util.Config;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.glassfish.jersey.internal.util.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.List;

/**
 * Created by aaron on 15/06/2017.
 */
@Component
public class RonService {

    Config config;

    private static Integer count = 1;

    private Client client = ClientBuilder.newClient();

    public RonService(Config config) {
        super();
        this.config = config;
        HttpAuthenticationFeature feature =
                HttpAuthenticationFeature.basic(
                        config.getUser(),
                        Base64.decode(config.getPassword().getBytes()));
        client.register(feature);
    }

    public List<String> getJsonRonQuote() {

         Response response = client.target(config.getSERVICE_REST_URI())
                .path(String.valueOf(count))
                .request(MediaType.APPLICATION_JSON)
                .get(Response.class);
         List<String> quotes = response.readEntity(new GenericType<List<String>>(){});
         return quotes;
    }
}
