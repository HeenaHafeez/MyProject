package com.simpli.phase4.sportyshoes.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.simpli.phase4.sportyshoes.entity.User;
import com.simpli.phase4.sportyshoes.repo.UserRepository;

@Repository
public class UserDaoImpl implements UserDAO {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getDetails(Integer id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User updatePass(User user) {
        return userRepository.save(user);

    }

    @Override
    public List<User> fetchAllUsers() {
        return userRepository.findAll()
                .stream()
                .filter(user -> !user.getRole().equalsIgnoreCase("admin"))
                .collect(Collectors.toList());
    }

}
