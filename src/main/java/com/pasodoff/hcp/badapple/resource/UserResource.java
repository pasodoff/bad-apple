package com.pasodoff.hcp.badapple.resource;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.pasodoff.hcp.badapple.dao.UserDao;
import com.pasodoff.hcp.badapple.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * Created by aaron on 15/06/2017.
 */
@RestController
public class UserResource {

    private final AtomicLong counter = new AtomicLong();

    private final UserDao userDao;

    public UserResource(UserDao userDao){
        this.userDao = userDao;
    }

    //  TODO: XSS circumvent Same Origin Policy
    @CrossOrigin(origins = "*")
    @RequestMapping("/user")
    public List<User> readUsers() {
        return userDao.selectAllUsers();
    }

    @RequestMapping("/user/{id:[0-9]+}")
    public User readUserById(@PathVariable(value="id") Integer id) {
        return userDao.selectUserById(id);
    }

    @RequestMapping("/user/{username:[a-z,A-Z]+}")
    public User readUserByUsername(@PathVariable(value="username") String username){
        return userDao.selectUserByUsername(username);
    }

    @RequestMapping(value="/user", method= RequestMethod.POST)
    public User createUser(@RequestBody User user){
        return userDao.insertUser(user);
    }

}
