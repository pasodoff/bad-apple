package com.pasodoff.hcp.badapple.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by aaron on 16/06/2017.
 */
@Component
public class Config {

    @Value("${service.webservice.target}")
    private String SERVICE_REST_URI;

    @Value("${service.webservice.user}")
    private String user;

    @Value("${service.webservice.password}")
    private String password;

    public String getSERVICE_REST_URI() {
        return SERVICE_REST_URI;
    }

    public void setSERVICE_REST_URI(String SERVICE_REST_URI) {
        this.SERVICE_REST_URI = SERVICE_REST_URI;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
