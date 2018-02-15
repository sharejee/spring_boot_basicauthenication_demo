package com.demospringbootsecurity.demo.domain.repositories;

import com.demospringbootsecurity.demo.domain.models.SecUser;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/*
Create By: Ron Rith
Create Date: 2/15/2018
*/
@Repository("userRepository")
public interface UserRepository extends PagingAndSortingRepository<SecUser,Long>{
    SecUser findByEmail(String email);
    SecUser findByEmailAndPassword(String email, String password);
}
