package com.jipinxiaohei.nizhan.service;

import com.jipinxiaohei.nizhan.dao.UserRepository;
import com.jipinxiaohei.nizhan.po.User;
import com.jipinxiaohei.nizhan.util.SHA256;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, SHA256.SHA256(password));
        return user;
    }
}
