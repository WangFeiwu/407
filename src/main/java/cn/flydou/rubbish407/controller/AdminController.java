package cn.flydou.rubbish407.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Eraser on 2017/6/6.
 */
@Controller
public class AdminController {
    @RequestMapping("/admin")
    public String index(){
        return "/index.jsp";
    }
}
