package com.simpli.phase4.sportyshoes.service;

import java.util.List;

import com.simpli.phase4.sportyshoes.entity.User;

public interface UserService {
    public User getDetails(Integer id);

    public User updatePass(User user);

    List<User> fetchAllUsers();

}
