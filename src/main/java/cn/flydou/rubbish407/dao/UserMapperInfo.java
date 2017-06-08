package cn.flydou.rubbish407.dao;

import cn.flydou.rubbish407.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
/**
 * Created by wanchenqi on 2017/6/8.
 */
public interface UserMapperInfo {
    UserInfo showUserInfoById(@Param("id") int id);

    UserInfo showUserInfoByUserId(@Param("userId") int userId);

    public void insertUserInfo(UserInfo userInfo);

    public void deleteUserInfo(UserInfo userInfo);

    public void updateUserInfo(UserInfo userInfo);


}
