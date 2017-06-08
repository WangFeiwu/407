package cn.flydou.rubbish407.service.impl;

import cn.flydou.rubbish407.dao.UserMapper;
import cn.flydou.rubbish407.entity.User;
import cn.flydou.rubbish407.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Eraser on 2017/6/9.
 */
@Service("UserService")
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    public User getUserByAccount(String account) {
        return userMapper.getUserByAccount(account);
    }
}
