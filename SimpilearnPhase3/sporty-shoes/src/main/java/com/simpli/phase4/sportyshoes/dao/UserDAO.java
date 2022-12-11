package com.simpli.phase4.sportyshoes.dao;

import java.util.List;

import com.simpli.phase4.sportyshoes.entity.User;

public interface UserDAO {
    public User getDetails(Integer id);

    public User updatePass(User user);

    List<User> fetchAllUsers();

}
