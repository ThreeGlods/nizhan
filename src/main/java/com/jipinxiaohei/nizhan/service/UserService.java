package com.jipinxiaohei.nizhan.service;


import com.jipinxiaohei.nizhan.po.User;


public interface UserService {

    User checkUser(String username, String password);
}
