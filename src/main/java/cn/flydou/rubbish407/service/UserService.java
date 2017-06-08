package cn.flydou.rubbish407.service;

import cn.flydou.rubbish407.entity.User;

/**
 * Created by Eraser on 2017/6/9.
 */
public interface UserService {
    User getUserByAccount(String account);
}
