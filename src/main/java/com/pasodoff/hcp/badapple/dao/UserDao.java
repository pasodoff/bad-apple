package com.pasodoff.hcp.badapple.dao;

import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Component;

import com.pasodoff.hcp.badapple.model.User;

import java.util.List;

/**
 * Created by aaron on 15/06/2017.
 */
@Component
public class UserDao {

    private final SqlSession sqlSession;

    public UserDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public User selectUserById(Integer id) {
        return this.sqlSession.selectOne("selectUserById", id);
    }

    public User selectUserByUsername(String username) {
        return this.sqlSession.selectOne("selectUserByUsername", username);
    }

    public List<User> selectAllUsers(){
        return this.sqlSession.selectList("selectUsers");
    }

    public User insertUser(User user) {
        this.sqlSession.insert("insertUser", user);
        return this.sqlSession.selectOne("selectUserByUsername", user.getUsername());
    }
}
