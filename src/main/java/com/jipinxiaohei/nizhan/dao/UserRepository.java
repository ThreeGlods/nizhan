package com.jipinxiaohei.nizhan.dao;

import com.jipinxiaohei.nizhan.po.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);
}
