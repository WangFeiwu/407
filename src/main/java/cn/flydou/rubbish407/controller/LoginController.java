package cn.flydou.rubbish407.controller;

import cn.flydou.rubbish407.bean.Result;
import cn.flydou.rubbish407.service.UserService;
import cn.flydou.rubbish407.vo.T_User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Eraser on 2017/6/6.
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/Login", method = {RequestMethod.POST})
    public @ResponseBody Result Sign(@RequestBody T_User user) {

        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getAccount(), user.getPassword());

        Result result = new Result();

        try {
            subject.login(token);
            result.setMsg("Login Success!");
            result.setStatusCode(0);

            return result;
        } catch (Exception e) {
            result.setStatusCode(1);
            result.setMsg("Wrong account or password");

            return result;
        }
    }

}
