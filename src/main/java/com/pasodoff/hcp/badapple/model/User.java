package com.pasodoff.hcp.badapple.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.pasodoff.hcp.badapple.util.Encryption;

import javax.jws.soap.SOAPBinding;
import java.io.Serializable;

/**
 * Created by aaron on 15/06/2017.
 */
// TODO: Not Finalizing Class
public class User  implements Serializable {

    private Integer id;
    private String username;
    private String firstName;
    private String lastName;
    // TODO: Not Restricting Access to variables
    public String password;
    private static String STATIC_STRING_FOR_ASSIGNMENT = "DEFAULT";
    // TODO: Password in comments
    // private String password = "StaticValue"


    public User(
            @JsonProperty("username") String username,
            @JsonProperty("firstName") String firstName,
            @JsonProperty("lastName") String lastName,
            @JsonProperty("password") String password) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        setPassword(password);
    }

    public User(Integer id, String username, String firstName, String lastName, String password) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        // TODO: Variable assignment of static default password
        setPassword(STATIC_STRING_FOR_ASSIGNMENT);
    }

    public User(String username) {
        this.username = username;
        // TODO: Hard coded default password
        setPassword("DefaultPassword");
        // TODO: Password left in comment
        // this.password = "OldDefaultPassword";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.startsWith("ENC:")){
            this.password = password;
        } else {
            this.password = "ENC:" + Encryption.encrypt(password);
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return getId() + " [" +
                "  username:" + getUsername() +
                ", firstName:" + getFirstName() +
                ", lastName" + getLastName() +
                "]";
    }
}
