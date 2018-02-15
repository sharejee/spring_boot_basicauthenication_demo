package com.demospringbootsecurity.demo.domain.repositories;

import com.demospringbootsecurity.demo.domain.models.Role;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/*
Create By: Ron Rith
Create Date: 2/15/2018
*/
@Repository("roleRepository")
public interface RoleRepository extends PagingAndSortingRepository<Role,Long>{
    Role findByRole(String role);
}
