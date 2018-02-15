package com.demospringbootsecurity.demo.domain.controllers;

import com.demospringbootsecurity.demo.domain.models.Role;
import com.demospringbootsecurity.demo.domain.models.SecUser;
import com.demospringbootsecurity.demo.domain.repositories.RoleRepository;
import com.demospringbootsecurity.demo.domain.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/*
Create By: Ron Rith
Create Date: 2/15/2018
*/
@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @RequestMapping(value={"/login"}, method = RequestMethod.GET)
    public String login(){
        List<Role> roles = (List<Role>) roleRepository.findAll();
        List<SecUser> secUsers = userService.findAllUsers();

        if (roles == null || roles.size() <= 0) {
            Role role = new Role();
            role.setRole("ADMIN");
            roleRepository.save(role);
        }

        if (secUsers == null || secUsers.size()<=0){
            SecUser secUser = new SecUser();
            secUser.setName("Rith");
            secUser.setLastName("Ron");
            secUser.setEmail("rithronlkh@gmail.com");
            secUser.setActive(1);
            secUser.setPassword("123456");
            userService.saveUser(secUser);
            System.out.println(bCryptPasswordEncoder.encode(secUser.getPassword()));
        }
        return "login";
    }

    @RequestMapping(value="/admin", method = RequestMethod.GET)
    public String home() throws Exception{
        return "/hello";
    }
}
