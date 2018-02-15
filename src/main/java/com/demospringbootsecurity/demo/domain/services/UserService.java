package com.demospringbootsecurity.demo.domain.services;

import com.demospringbootsecurity.demo.domain.models.SecUser;

import java.util.List;

/*
Create By: Ron Rith
Create Date: 2/15/2018
*/
public interface UserService {
    SecUser findUserByEmail(String email);

    void saveUser(SecUser secUser);

    List<SecUser> findAllUsers();

    SecUser getUserById(Long id);

    void deleteUser(Long id);

    void updateUser(SecUser secUser, Long id);

    SecUser findByEmailAndPassword(String email, String password);
}
