package cn.flydou.rubbish407.dao;

import cn.flydou.rubbish407.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Eraser on 17-6-8.
 */
public interface UserMapper {
    User getUserByAccount(@Param("account") String account);

    String queryPasswordByAccount(@Param("account") String account);

    int insertUser(User user);

    int countUser();

    int queryIdByAccount(@Param("account") String account);

}
