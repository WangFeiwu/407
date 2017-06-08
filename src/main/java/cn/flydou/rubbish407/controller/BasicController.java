package cn.flydou.rubbish407.controller;

import cn.flydou.rubbish407.dao.UserMapper;
import cn.flydou.rubbish407.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Eraser on 2017/6/2.
 */
@Controller
public class BasicController {

    private static Logger logger =LoggerFactory.getLogger(BasicController.class);

    @RequestMapping("/")
    public String index() {

        return "../../index";
    }

    @RequestMapping("/LoginPage")
    public String login() {
        return "login";
    }

}
