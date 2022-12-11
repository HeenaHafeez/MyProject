package com.simpli.phase4.sportyshoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simpli.phase4.sportyshoes.dao.UserDAO;
import com.simpli.phase4.sportyshoes.entity.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User getDetails(Integer id) {
        return userDAO.getDetails(id);
    }

    @Override
    public User updatePass(User user) {
        return userDAO.updatePass(user);

    }

    @Override
    public List<User> fetchAllUsers() {
        return userDAO.fetchAllUsers();
    }

}
