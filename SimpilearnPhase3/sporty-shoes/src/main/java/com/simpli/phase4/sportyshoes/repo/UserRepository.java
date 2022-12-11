package com.simpli.phase4.sportyshoes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simpli.phase4.sportyshoes.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
