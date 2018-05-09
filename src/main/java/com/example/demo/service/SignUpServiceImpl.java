package com.example.demo.service;

import com.example.demo.form.UserForm;
import com.example.demo.model.User;
import com.example.demo.model.Role;
import com.example.demo.model.State;
import com.example.demo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void signUp(UserForm userForm) {
        String hashPassword = passwordEncoder.encode(userForm.getPassword());

        User user = new User();
        user.setFirstName(userForm.getFirstName());
        user.setLastName(userForm.getLastName());
        user.setLogin(userForm.getLogin());
        user.setHashPassword(hashPassword);
        user.setRole(Role.USER);
        user.setState(State.ACTIVE);

        usersRepository.save(user);
    }
}
